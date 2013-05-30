package xmpp;


import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.pubsub.*;
import org.jivesoftware.smackx.pubsub.listener.ItemEventListener;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 28.05.13
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class XmppService {
    public static void main(String[] args) throws XMPPException {
        XMPPConnection connection = new XMPPConnection("localhost");
        connection.connect();
        connection.login("user1", "1234");
        PubSubManager mgr = new PubSubManager(connection);
        System.out.println("Verbunden: " + connection.isConnected());

        //Knoten  erzeugen
        LeafNode leaf = mgr.createNode("testNode");
        ConfigureForm form = new ConfigureForm(FormType.submit);
        form.setAccessModel(AccessModel.open);
        form.setDeliverPayloads(true);
        form.setNotifyRetract(true);
        form.setPersistentItems(true);
        form.setPublishModel(PublishModel.open);

        leaf.sendConfigurationForm(form);


        //Zu Testknoten publishen
        LeafNode node = mgr.getNode("testNode");
        node.send(new PayloadItem("test" + System.currentTimeMillis(), new SimplePayload("book", "pubsub:test:book", "")));
        System.out.println(node.getItems());


        //Listener zu Node hinzufuegen
        node = mgr.getNode("testNode");

        node.addItemEventListener(new ItemEventCoordinator<Item>());
        node.subscribe("user2");


    }

    private static class ItemEventCoordinator<T> implements ItemEventListener {
        @Override
        public void handlePublishedItems(ItemPublishEvent items)
        {
            System.out.println("Item count: " + items.getItems().size());
            System.out.println(items);
        }
    }
}

