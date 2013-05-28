package xmpp;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.pubsub.LeafNode;
import org.jivesoftware.smackx.pubsub.PubSubManager;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 28.05.13
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class AdminClient {
    public static void main(String[]args) throws XMPPException {
        // Erzeugt Connection zum Server
        XMPPConnection connection = new XMPPConnection("localhost");
// Connect to the server
        connection.connect();
// Login auf dem Server
        connection.login("user1", "1234");

// Erzeugt einen PubSubManager
        PubSubManager mgr = new PubSubManager(connection);

// Erzeugt Leaf
        LeafNode leaf = mgr.createNode();
    }
}
