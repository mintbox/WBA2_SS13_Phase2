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
public class XmppServer {

       public boolean connect() throws XMPPException {
           XMPPConnection connection = new XMPPConnection("localhost");
           PubSubManager mgr =new PubSubManager(connection);
           connection.connect();
           //System.out.println("Verbunden: " + connection.isConnected());
               return connection.isConnected();
       }

        //Testknoten  erzeugen
    public void createNode(PubSubManager mgr) throws XMPPException {
        LeafNode leaf = mgr.createNode("testNode2");
        ConfigureForm form = new ConfigureForm(FormType.submit);
        form.setAccessModel(AccessModel.open);
        form.setDeliverPayloads(false);
        form.setNotifyRetract(true);
        form.setPersistentItems(true);
        form.setPublishModel(PublishModel.open);
        leaf.sendConfigurationForm(form);
    }

        //Zu Testknoten publishen
        public void publishToNode(PubSubManager mgr) throws XMPPException {
        LeafNode node = mgr.getNode("testNode");
        node.send(new Item());
        }


    }

