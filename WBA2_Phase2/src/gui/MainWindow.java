/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import org.jivesoftware.smack.XMPPException;
import xmpp.PubSubClient;

import javax.swing.*;
import java.awt.*;

/**
 * @author denjae
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    public void setPubSub(PubSubClient ps) {

        this.pubSub = ps;

    }

    public MainWindow(JComboBox jComboBoxMannschaften) throws HeadlessException {
        this.jComboBoxMannschaften = jComboBoxMannschaften;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jLabelMannschaft = new javax.swing.JLabel();
        jComboBoxMannschaften = new javax.swing.JComboBox();
        jLabelFunktion = new javax.swing.JLabel();
        jComboBoxFunction = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAusgabe = new javax.swing.JTextArea();


        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mannschaften");

        jLabelTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Fussball-Applikation");

        jLabelMannschaft.setText("Bitte Mannschaft auswaehlen");

        jComboBoxMannschaften.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1899 Hoffenheim", "1.FC Nuernberg", "1.FSV Mainz 05", "Bayer 04 Leverkusen", "Borussia Dortmund", "Borussia Moenchengladbach", "Eintracht Frankfurt", "FC Augsburg", "FC Bayern Muenchen", "FC Schalke 04", "Fortuna Duesseldorf", "Hamburger SV", "Hannover 96", "Sportclub Freiburg", "SpVgg Greuther Feurth", "SV Werder Bremen", "VFB Stuttgart", "VFL Wolfsburg"}));
        jComboBoxMannschaften.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelFunktion.setText("Gewuenschte Funktion auswaehlen");

        jComboBoxFunction.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Mannschaft abonnieren ", "Abonnement beenden", "Alle Mannschaften anzeigen", "Nachrichten empfangen", "Kommentar senden ", "Tor senden"}));
        jComboBoxFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jComboBoxFunctionActionPerformed(evt);
                } catch (XMPPException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        });

        jTextAreaAusgabe.setEditable(false);
        jTextAreaAusgabe.setBackground(new java.awt.Color(238, 238, 238));
        jTextAreaAusgabe.setColumns(20);
        jTextAreaAusgabe.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAusgabe);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jLabelTitle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createSequentialGroup()
                                .add(20, 20, 20)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(jLabelMannschaft, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(jComboBoxMannschaften, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jLabelFunktion)
                                        .add(jComboBoxFunction, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(230, Short.MAX_VALUE))
                        .add(jScrollPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .add(jLabelTitle)
                                .add(57, 57, 57)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(jLabelMannschaft)
                                        .add(jLabelFunktion))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(jComboBoxMannschaften, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(jComboBoxFunction, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(18, 18, 18)
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        team = (String)jComboBoxMannschaften.getSelectedItem();
        System.out.println(team);

    }

    //Funktion aus Dropdown waehlen und ausfuehren
    private void jComboBoxFunctionActionPerformed(java.awt.event.ActionEvent evt) throws XMPPException {
        function = jComboBoxFunction.getSelectedIndex();

        switch (function) {
            case 0:
                pubSub.subscribe(team);
                JOptionPane.showMessageDialog(null, "abonniert");
                break;
            case 1:
                pubSub.unsubscribe(team);
                JOptionPane.showMessageDialog(null, "Abonnement beendet");
                break;
            case 2:
                pubSub.discover();
                break;
            case 3:
                pubSub.getMessagesFromNode(team);

                break;
            case 4:
            case 5:
                dispose();
                AdminWindow adminWindow = new AdminWindow();
                adminWindow.setPubSub(pubSub);
                adminWindow.setVisible(true);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JComboBox jComboBoxMannschaften;
    private javax.swing.JComboBox jComboBoxFunction;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelMannschaft;
    private javax.swing.JLabel jLabelFunktion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAusgabe;
    private javax.swing.JTextField jTextField1;

    private String team;
    int function;
    private PubSubClient pubSub;
}
