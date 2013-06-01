package xmpp;

import Liveticker.Liveticker;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.pubsub.*;

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
    public void disconnect(){
        connection.disconnect();
    }
    public void pubComment(String team, int min, String comment) throws XMPPException {
        LeafNode node = mgr.getNode(team);
        SimplePayload payload = new SimplePayload("Liveticker", null, "");
        PayloadItem item = new PayloadItem<SimplePayload>(team, payload);
        node.publish(item);
        System.out.println("Item wurde erzeugt.");
    }

}
