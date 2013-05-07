package Liveticker;

import javax.swing.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 07.05.13
 * Time: 13:54
 * To change this template use File | Settings | File Templates.
 */
public class LivetickerService {
    @Path("/{id}")
    @GET
    @Produces("application/xml")
    public void getMannschaft() throws JAXBException, IOException {
        String eingabe;
        int ein;
        JAXBContext jc = JAXBContext.newInstance(Liveticker.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
                /*FRAGE: Wie funktioniert das bei verteilten Systemen?*/
        Liveticker liveticker = (Liveticker) unmarshaller.unmarshal(new File("Liveticker/LiveTicker.xml"));
        //Evtl ID's der Mannschaften ausgeben
        eingabe = JOptionPane.showInputDialog("ID der Mannschaft: ");
        ein = Integer.parseInt(eingabe);

        while (ein == Liveticker.Heimmannschaft.mann_id || ein == Liveticker.Gastmannschaft.mann_id) {

        }


    }
}
