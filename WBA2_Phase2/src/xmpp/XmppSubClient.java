package xmpp;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.pubsub.Item;
import org.jivesoftware.smackx.pubsub.LeafNode;
import org.jivesoftware.smackx.pubsub.PubSubManager;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 31.05.13
 * Time: 13:47
 * To change this template use File | Settings | File Templates.
 */
public class XmppSubClient {
    XMPPConnection connection;
    PubSubManager mgr = new PubSubManager(connection);

    XmppSubClient(String user, String pass) throws XMPPException {
        connection = new XMPPConnection("localhost");
        connection.connect();
        connection.login(user, pass);
    }


    public void abonniere(String team) throws XMPPException {
        LeafNode node = mgr.getNode(team);

        node.addItemEventListener(new ItemEventCoordinator<Item>());
        node.subscribe(connection.getUser());

    }


}
