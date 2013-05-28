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
        // Create a connection to the igniterealtime.org XMPP server.
        XMPPConnection connection = new XMPPConnection("localhost");
// Connect to the server
        connection.connect();
// Most servers require you to login before performing other tasks.
        connection.login("user1", "1234");

// Create a pubsub manager using an existing Connection
        PubSubManager mgr = new PubSubManager(connection);

// Create the node
        LeafNode leaf = mgr.createNode();
    }
}
