package Liveticker;

import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

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
    public void getMannschaft(@PathParam("id") int team) throws JAXBException, IOException {
        int test = 0;

        JAXBContext jc = JAXBContext.newInstance(Liveticker.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
                /*FRAGE: Wie funktioniert das bei verteilten Systemen?*/
        Liveticker liveticker = (Liveticker) unmarshaller.unmarshal(new File("/Users/djga/Dropbox/coding/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker_Testdaten.xml"));
        //Evtl ID's der Mannschaften ausgeben
        int i = 0;
        while (test != 1) {
            int heimId = Integer.parseInt(liveticker.getSpiel().get(i).getHeimmannschaft().getMannId());
            int gastId = Integer.parseInt(liveticker.getSpiel().get(i).getGastmannschaft().getMannId());
            if (heimId == (team) || gastId == team) {
                System.out.println("Heimmannschaft: " + liveticker.getSpiel().get(i).getHeimmannschaft().getName());
                System.out.println("Gastmannschaft: " + liveticker.getSpiel().get(i).getGastmannschaft().getName());
                for (int j = 0; liveticker.getSpiel().get(i).getEndergebnis().getTore().getTor().size() > j; j++) {
                    System.out.println("TOR:");
                    System.out.println("Torschuetze: " + liveticker.spiel.get(i).endergebnis.tore.tor.get(j).getTorschuetze());
                    System.out.println("Mannschaft: " + liveticker.spiel.get(i).endergebnis.tore.tor.get(j).getMannschaftSchuetze());
                    System.out.println("Spielminute " + liveticker.spiel.get(i).endergebnis.tore.tor.get(j).getMinute());
                    System.out.println("-----------------------------------");


                }
                for (int k = 0; k < liveticker.getSpiel().get(i).getKommentare().getKommentar().size(); k++) {
                    System.out.println(liveticker.spiel.get(i).getKommentare().getKommentar().get(k).getMinute() + " Minute:");
                    System.out.println(liveticker.spiel.get(i).getKommentare().getKommentar().get(k).getText());
                    System.out.println("-----------------------------------");
                }
                test = 1;
            } else
                i++;


        }

    }

    @DELETE
    @Path("liveticker/{id}")
    @Produces("application/xml")
    public Liveticker deleteComment(@PathParam("id") int i) throws JAXBException, IOException {

        ObjectFactory ob = new ObjectFactory();
        Liveticker liveticker = ob.createLiveticker();
        JAXBContext context = JAXBContext.newInstance(Liveticker.class);
        Unmarshaller um = context.createUnmarshaller();
        liveticker = (Liveticker) um.unmarshal(new FileReader("/Users/djga/Dropbox/coding/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker_Testdaten.xml"));
        Liveticker lt = ob.createLiveticker();

        if (i <= liveticker.getSpiel().size()) {

            lt.getSpiel().addAll(liveticker.getSpiel());
            lt.getSpiel().remove(liveticker.getSpiel().get(i));

            // Marshall content to XML-File.
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
            m.marshal(lt, System.out);

            Writer w = null;
            w = new FileWriter("/Users/djga/Dropbox/coding/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker_Testdaten.xml");
            m.marshal(lt, w);
            w.close();
            return lt;
        }
        return lt;
    }
}
