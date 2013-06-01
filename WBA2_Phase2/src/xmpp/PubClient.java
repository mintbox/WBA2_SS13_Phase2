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
        SimplePayload payload = new SimplePayload("Liveticker", null, "<Spiel><Kommentare><Kommentar><Minute>"+min+"</Minute><Text>"+comment+"</Text></Kommentar></Kommentare></Spiel>");
        PayloadItem item = new PayloadItem<SimplePayload>(team, payload);
        node.publish(item);
        System.out.println("Item wurde erzeugt.");
    }

    public void pubGoal(String team, String schuetze, int min, String ergebnis) throws XMPPException {
        LeafNode node = mgr.getNode(team);
        SimplePayload payload = new SimplePayload("Liveticker", null, "Endergebnis><Ergebnis>"+ergebnis+"</Ergebnis><Tore><Tor><Torschuetze>"+schuetze+"</Torschuetze><Mannschaft_Schuetze>"+team+"</Mannschaft_Schuetze><Minute>"+min+"</Minute></Tor></Tore></Endergebnis>");
        PayloadItem item = new PayloadItem<SimplePayload>(team, payload);
        node.publish(item);
        System.out.println("Item wurde erzeugt.");
    }

}
