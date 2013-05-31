package xmpp;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.pubsub.Item;
import org.jivesoftware.smackx.pubsub.LeafNode;
import org.jivesoftware.smackx.pubsub.PayloadItem;
import org.jivesoftware.smackx.pubsub.PubSubManager;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 31.05.13
 * Time: 14:03
 * To change this template use File | Settings | File Templates.
 */
public class PubClient {
    XMPPConnection connection = new XMPPConnection("localhost");
    PubSubManager mgr = new PubSubManager(connection);

    PubClient(String user, String pass) throws XMPPException {
        connection.connect();
        connection.login(user, pass);
    }
    public void pubComment(String team) throws XMPPException {
        LeafNode node = mgr.getNode(team);
        node.send(new Item("test"));
      //  PayloadItem payload =new PayloadItem();
    }

    public void pubTor() {

    }
}
