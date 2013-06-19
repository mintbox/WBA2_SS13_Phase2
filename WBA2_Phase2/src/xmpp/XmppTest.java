package xmpp;

import org.jivesoftware.smack.XMPPException;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 31.05.13
 * Time: 16:33
 * To change this template use File | Settings | File Templates.
 */
public class XmppTest {
    public static void main(String[] args) throws XMPPException {
        PubSubClient pubsub = new PubSubClient("user1", "user1");

        //pubsub.subscribe("FC Bayern Muenchen");
       //pubsub.discover();
        //pubsub.pubGoal("FC Bayern Muenchen", "Thomas Mueller", 12, "1:0");
        //pubsub.pubComment("FC Bayern Muenchen", 12, "Test Comment");
        pubsub.getMessagesFromNode("FC Bayern Muenchen");
        //pubsub.deleteAllNodes();
        //pubsub.unsubscribe("FC Bayern Muenchen");
        //pubsub.getAllSubscriptions();
        //pubsub.disconnect();
    }
}
