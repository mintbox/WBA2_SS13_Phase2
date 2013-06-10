package xmpp;


import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.pubsub.*;
import org.jivesoftware.smackx.pubsub.listener.ItemEventListener;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 28.05.13
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class CreateNodes {
    public static void main(String[] args) throws XMPPException {
        XMPPConnection connection = new XMPPConnection("localhost");
        connection.connect();
        connection.login("user1", "user1");
        PubSubManager mgr = new PubSubManager(connection);
        System.out.println("Verbunden: " + connection.isConnected());

        //Knoten  erzeugen
       LeafNode hoff = mgr.createNode("1899 Hoffenheim");
        ConfigureForm form1 = new ConfigureForm(FormType.submit);
        form1.setAccessModel(AccessModel.open);
        form1.setDeliverPayloads(true);
        form1.setNotifyRetract(true);
        form1.setPersistentItems(true);
        form1.setPublishModel(PublishModel.open);
        hoff.sendConfigurationForm(form1);

        LeafNode nuern = mgr.createNode("1.FC Nuernberg");
        ConfigureForm form2 = new ConfigureForm(FormType.submit);
        form2.setAccessModel(AccessModel.open);
        form2.setDeliverPayloads(true);
        form2.setNotifyRetract(true);
        form2.setPersistentItems(true);
        form2.setPublishModel(PublishModel.open);
        nuern.sendConfigurationForm(form2);

        LeafNode mainz = mgr.createNode("1.FSV Mainz 05");
        ConfigureForm form3 = new ConfigureForm(FormType.submit);
        form3.setAccessModel(AccessModel.open);
        form3.setDeliverPayloads(true);
        form3.setNotifyRetract(true);
        form3.setPersistentItems(true);
        form3.setPublishModel(PublishModel.open);
        mainz.sendConfigurationForm(form3);

        LeafNode bayer = mgr.createNode("Bayer 04 Leverkusen");
        ConfigureForm form4 = new ConfigureForm(FormType.submit);
        form4.setAccessModel(AccessModel.open);
        form4.setDeliverPayloads(true);
        form4.setNotifyRetract(true);
        form4.setPersistentItems(true);
        form4.setPublishModel(PublishModel.open);
        bayer.sendConfigurationForm(form4);

        LeafNode domu = mgr.createNode("Borussia Dortmund");
        ConfigureForm form5 = new ConfigureForm(FormType.submit);
        form5.setAccessModel(AccessModel.open);
        form5.setDeliverPayloads(true);
        form5.setNotifyRetract(true);
        form5.setPersistentItems(true);
        form5.setPublishModel(PublishModel.open);
        domu.sendConfigurationForm(form5);

        LeafNode bmg = mgr.createNode("Borussia Moenchengladbach");
        ConfigureForm form6 = new ConfigureForm(FormType.submit);
        form6.setAccessModel(AccessModel.open);
        form6.setDeliverPayloads(true);
        form6.setNotifyRetract(true);
        form6.setPersistentItems(true);
        form6.setPublishModel(PublishModel.open);
        bmg.sendConfigurationForm(form6);

        LeafNode ffurt = mgr.createNode("Eintracht Frankfurt");
        ConfigureForm form7 = new ConfigureForm(FormType.submit);
        form7.setAccessModel(AccessModel.open);
        form7.setDeliverPayloads(true);
        form7.setNotifyRetract(true);
        form7.setPersistentItems(true);
        form7.setPublishModel(PublishModel.open);
        ffurt.sendConfigurationForm(form7);

        LeafNode augsburg = mgr.createNode("FC Augsburg");
        ConfigureForm form8 = new ConfigureForm(FormType.submit);
        form8.setAccessModel(AccessModel.open);
        form8.setDeliverPayloads(true);
        form8.setNotifyRetract(true);
        form8.setPersistentItems(true);
        form8.setPublishModel(PublishModel.open);
        augsburg.sendConfigurationForm(form8);

        LeafNode fcb = mgr.createNode("FC Bayern Muenchen");
        ConfigureForm form9 = new ConfigureForm(FormType.submit);
        form9.setAccessModel(AccessModel.open);
        form9.setDeliverPayloads(true);
        form9.setNotifyRetract(true);
        form9.setPersistentItems(true);
        form9.setPublishModel(PublishModel.open);
        fcb.sendConfigurationForm(form9);


        LeafNode schalke = mgr.createNode("FC Schalke 04");
        ConfigureForm form10 = new ConfigureForm(FormType.submit);
        form10.setAccessModel(AccessModel.open);
        form10.setDeliverPayloads(true);
        form10.setNotifyRetract(true);
        form10.setPersistentItems(true);
        form10.setPublishModel(PublishModel.open);
        schalke.sendConfigurationForm(form10);

        LeafNode ddorf = mgr.createNode("Fortuna Duesseldorf");
        ConfigureForm form11 = new ConfigureForm(FormType.submit);
        form11.setAccessModel(AccessModel.open);
        form11.setDeliverPayloads(true);
        form11.setNotifyRetract(true);
        form11.setPersistentItems(true);
        form11.setPublishModel(PublishModel.open);
        ddorf.sendConfigurationForm(form11);

        LeafNode hsv = mgr.createNode("Hamburger SV");
        ConfigureForm form12 = new ConfigureForm(FormType.submit);
        form12.setAccessModel(AccessModel.open);
        form12.setDeliverPayloads(true);
        form12.setNotifyRetract(true);
        form12.setPersistentItems(true);
        form12.setPublishModel(PublishModel.open);
        hsv.sendConfigurationForm(form12);

        LeafNode hannover = mgr.createNode("Hannover 96");
        ConfigureForm form13 = new ConfigureForm(FormType.submit);
        form13.setAccessModel(AccessModel.open);
        form13.setDeliverPayloads(true);
        form13.setNotifyRetract(true);
        form13.setPersistentItems(true);
        form13.setPublishModel(PublishModel.open);
        hannover.sendConfigurationForm(form13);

        LeafNode scf = mgr.createNode("Sportclub Freiburg");
        ConfigureForm form14 = new ConfigureForm(FormType.submit);
        form14.setAccessModel(AccessModel.open);
        form14.setDeliverPayloads(true);
        form14.setNotifyRetract(true);
        form14.setPersistentItems(true);
        form14.setPublishModel(PublishModel.open);
        scf.sendConfigurationForm(form14);

        LeafNode fuerth = mgr.createNode("SpVgg Greuther Feurth");
        ConfigureForm form15 = new ConfigureForm(FormType.submit);
        form15.setAccessModel(AccessModel.open);
        form15.setDeliverPayloads(true);
        form15.setNotifyRetract(true);
        form15.setPersistentItems(true);
        form15.setPublishModel(PublishModel.open);
        fuerth.sendConfigurationForm(form15);

        LeafNode werder = mgr.createNode("SV Werder Bremen");
        ConfigureForm form16 = new ConfigureForm(FormType.submit);
        form16.setAccessModel(AccessModel.open);
        form16.setDeliverPayloads(true);
        form16.setNotifyRetract(true);
        form16.setPersistentItems(true);
        form16.setPublishModel(PublishModel.open);
        werder.sendConfigurationForm(form16);

        LeafNode vfb = mgr.createNode("VFB Stuttgart");
        ConfigureForm form17 = new ConfigureForm(FormType.submit);
        form17.setAccessModel(AccessModel.open);
        form17.setDeliverPayloads(true);
        form17.setNotifyRetract(true);
        form17.setPersistentItems(true);
        form17.setPublishModel(PublishModel.open);
        vfb.sendConfigurationForm(form17);

        LeafNode wob = mgr.createNode("VFL Wolfsburg");
        ConfigureForm form18 = new ConfigureForm(FormType.submit);
        form18.setAccessModel(AccessModel.open);
        form18.setDeliverPayloads(true);
        form18.setNotifyRetract(true);
        form18.setPersistentItems(true);
        form18.setPublishModel(PublishModel.open);
        wob.sendConfigurationForm(form18);




        //Verbindung trennen
        connection.disconnect();


    }


    private static class ItemEventCoordinator<T> implements ItemEventListener {
        @Override
        public void handlePublishedItems(ItemPublishEvent items)
        {
            System.out.println("Item count: " + items.getItems().size());
            System.out.println(items);
        }

    }
}


