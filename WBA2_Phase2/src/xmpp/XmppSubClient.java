package xmpp;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.packet.DiscoverInfo;
import org.jivesoftware.smackx.pubsub.*;

import java.util.List;

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

    public void discoverAll() throws XMPPException {
        List<Subscription> subscriptions = mgr.getSubscriptions();
        System.out.println(subscriptions);
    }

    public void discoverUser() throws XMPPException {
        List<Affiliation> affiliations = mgr.getAffiliations();
        System.out.println(affiliations);
    }


}
