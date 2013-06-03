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
        SubClient testSub = new SubClient("user1", "1234");
        PubClient testPub = new PubClient("user2", "user2");
        //     testSub.abonniere("FC Bayern Muenchen");
        // testSub.discoverAll();
        // testSub.discover();
        //   testPub.pubComment("FC Bayern Muenchen", 11, "Test ob Publishen klappt");
        // testPub.pubGoal("FC Bayern Muenchen", "Thomas Mueller", 12, "1:0");
        //testSub.discover();
        testSub.getMessages("FC Bayern Muenchen");

    }
}
