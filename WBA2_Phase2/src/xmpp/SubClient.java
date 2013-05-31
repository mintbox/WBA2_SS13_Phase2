package xmpp;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.pubsub.Item;
import org.jivesoftware.smackx.pubsub.LeafNode;
import org.jivesoftware.smackx.pubsub.PubSubManager;
import org.jivesoftware.smackx.pubsub.Subscription;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 31.05.13
 * Time: 13:47
 * To change this template use File | Settings | File Templates.
 */
public class SubClient {
    XMPPConnection connection = new XMPPConnection("localhost");
    PubSubManager mgr = new PubSubManager(connection);

    SubClient(String user, String pass) throws XMPPException {
        connection.connect();
        connection.login(user, pass);
    }


    public void abonniere(String team) throws XMPPException {
        LeafNode node = mgr.getNode(team);
        node.addItemEventListener(new ItemEventCoordinator<Item>());
        node.subscribe(connection.getUser());

    }

    public void discoverAll() throws XMPPException {
        List<Subscription> subscriptions = mgr.getSubscriptions();
        System.out.println(subscriptions);
    }
}
