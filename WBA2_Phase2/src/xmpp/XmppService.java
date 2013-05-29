package xmpp;


import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.pubsub.*;

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
        connection.login("user1","1234");
        PubSubManager mgr = new PubSubManager(connection);
        System.out.println("Verbunden: " + connection.isConnected());

        //Testknoten  erzeugen
        mgr.getNode("testNode");
        mgr.createNode("testNode2");
        connection.disconnect();
//        LeafNode leaf = mgr.createNode("testNode2");
//        ConfigureForm form = new ConfigureForm(FormType.submit);
//        form.setAccessModel(AccessModel.open);
//        form.setDeliverPayloads(false);
//        form.setNotifyRetract(true);
//        form.setPersistentItems(true);
//        form.setPublishModel(PublishModel.open);
//        leaf.sendConfigurationForm(form);


        //Zu Testknoten publishen
//        LeafNode node = mgr.getNode("testNode");
//        node.send(new Item());
//
    }
}

