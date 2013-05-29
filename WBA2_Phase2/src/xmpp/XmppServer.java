package xmpp;


import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 28.05.13
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class XmppServer {
    public static void main(String[]args) throws XMPPException {
        XMPPConnection connection = new XMPPConnection("localhost");
        connection.connect();
        connection.login("user1", "1234");



    }
}
