package xmpp;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.ServiceDiscoveryManager;
import org.jivesoftware.smackx.packet.DiscoverItems;
import org.jivesoftware.smackx.pubsub.Item;
import org.jivesoftware.smackx.pubsub.LeafNode;
import org.jivesoftware.smackx.pubsub.PubSubManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 31.05.13
 * Time: 13:47
 * To change this template use File | Settings | File Templates.
 */
public class SubClient {
    private XMPPConnection connection = new XMPPConnection("localhost");
    private PubSubManager mgr = new PubSubManager(connection);
    private ServiceDiscoveryManager sdMgr;


    SubClient(String user, String pass) throws XMPPException {
        connection.connect();
        connection.login(user, pass);
    }

    public void disconnect() {
        connection.disconnect();
    }


    public void abonniere(String team) throws XMPPException {
        LeafNode node = mgr.getNode(team);
        node.addItemEventListener(new ItemEventCoordinator<Item>());
        node.subscribe(connection.getUser());

    }


    public List<String> discover() throws XMPPException {
        this.sdMgr = ServiceDiscoveryManager.getInstanceFor(connection);
        List<String> list = new ArrayList<String>();
        for (Iterator<DiscoverItems.Item> iterator = sdMgr.discoverItems("pubsub." + "localhost").getItems(); iterator.hasNext(); ) {
            DiscoverItems.Item item = iterator.next();
            list.add(item.getNode());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return list;
    }

    //bad request
    public void getMessages(String team) throws XMPPException {
        LeafNode node = mgr.getNode(team);
        for (int i = 0; i < node.getItems().size(); i++) {
            System.out.println("bin in der Schleife");
            node.getItems().get(i);
        }
    }
}
