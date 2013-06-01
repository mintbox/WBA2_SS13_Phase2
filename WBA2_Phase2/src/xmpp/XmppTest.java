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
        SubClient test = new SubClient("user1", "1234");
     //   test.abonniere("FC Bayern Muenchen");
       // test.discoverAll();
        test.discover();
    }
}
