package gui;

import org.jivesoftware.smack.XMPPException;
import xmpp.PubSubClient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 10.06.13
 * Time: 16:46
 * To change this template use File | Settings | File Templates.
 */
public class DesignerLogin {
    private JTextField benutzernameTextField;
    private JPasswordField passwortPasswordField;
    private JButton absendenButton;

    public DesignerLogin() {
        absendenButton.addActionListener(new ActionListener() {
            String user= benutzernameTextField.getText();
            String pass = new String(passwortPasswordField.getPassword());
            public void actionPerformed(ActionEvent e) {
                try {
                    PubSubClient pubSub = new PubSubClient(user, pass);
                                   } catch (XMPPException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        DesignerLogin designerLogin = new DesignerLogin();
    }

}
