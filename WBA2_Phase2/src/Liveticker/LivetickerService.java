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
@Path("/liveticker")
public class LivetickerService {

    //Gibt Liveticker des aktuellen Spieltages zurueck
    @GET
    @Produces("application/xml")
    public Liveticker getTicker() throws JAXBException, FileNotFoundException {
        Liveticker liveticker;
        JAXBContext context = JAXBContext.newInstance(Liveticker.class);
        Unmarshaller um = context.createUnmarshaller();
        liveticker = (Liveticker) um.unmarshal(new FileReader("/Users/djga/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker_Testdaten.xml"));

        return liveticker;

    }

    //Gibt Liveticker einer bestimmten Mannschaft zurueck
    @Path("/{id}")
    @GET
    @Produces("application/xml")
    public Liveticker getMannschaft(@PathParam("id") int team) throws JAXBException, IOException {
        Liveticker liveticker;
        ObjectFactory ob = new ObjectFactory();
        JAXBContext context = JAXBContext.newInstance(Liveticker.class);
        Unmarshaller um = context.createUnmarshaller();
        liveticker = (Liveticker) um.unmarshal(new FileReader("/Users/djga/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker.xml"));
        Liveticker rt = ob.createLiveticker();
        for (int j = 0; j < liveticker.getSpiel().size(); j++) {
            int heim = Integer.parseInt(liveticker.getSpiel().get(j).getHeimmannschaft().getMannId());
            int gast = Integer.parseInt(liveticker.getSpiel().get(j).getGastmannschaft().getMannId());
            if (heim == team || gast == team)
                rt.getSpiel().add(liveticker.getSpiel().get(j));
        }
        return rt;
    }

    @DELETE
    @Path("/{id}")
    @Produces("application/xml")
    public Liveticker deleteComment(@PathParam("id") int team) throws JAXBException, IOException {

        ObjectFactory ob = new ObjectFactory();
        Liveticker liveticker;
        JAXBContext context = JAXBContext.newInstance(Liveticker.class);
        Unmarshaller um = context.createUnmarshaller();
        liveticker = (Liveticker) um.unmarshal(new FileReader("/Users/djga/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker_Testdaten.xml"));
        Liveticker lt = ob.createLiveticker();
        int id = 0;

        lt.getSpiel().addAll(liveticker.getSpiel());
        for (int j = 0; j < liveticker.getSpiel().size(); j++) {
            int heim = Integer.parseInt(liveticker.getSpiel().get(j).getHeimmannschaft().getMannId());
            int gast = Integer.parseInt(liveticker.getSpiel().get(j).getGastmannschaft().getMannId());
                        if (heim == team || gast == team) {
                id = j;
            }
        }
        if (team != 0) {
            System.out.println("Treffer");
            int commentsize = liveticker.getSpiel().get(id).getKommentare().getKommentar().size();
            liveticker.getSpiel().remove(commentsize);
        }

        // Marshall content to XML-File.
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
        m.marshal(liveticker, System.out);

        Writer w = null;
        w = new FileWriter("/Users/djga/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker_Testdaten.xml");
        m.marshal(liveticker, w);
        w.close();
        return liveticker;
    }

    //fuegt einen Kommentar hinzu
    @POST
    @Path("/{id}")
    @Produces("application/xml")
    public Liveticker postComment(@PathParam("id") int team, @FormParam("Minute") int min, @FormParam("Kommentar") String text) throws JAXBException, IOException {
        Liveticker liveticker;
        ObjectFactory ob = new ObjectFactory();
        JAXBContext context = JAXBContext.newInstance(Liveticker.class);
        Unmarshaller um = context.createUnmarshaller();
        liveticker = (Liveticker) um.unmarshal(new FileReader("/Users/djga/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker_Testdaten.xml"));
        int id = 0;
        Liveticker.Spiel.Kommentare.Kommentar comment = new Liveticker.Spiel.Kommentare.Kommentar();


        for (int j = 0; j < liveticker.getSpiel().size(); j++) {
            int heim = Integer.parseInt(liveticker.getSpiel().get(j).getHeimmannschaft().getMannId());
            int gast = Integer.parseInt(liveticker.getSpiel().get(j).getGastmannschaft().getMannId());
            System.out.println(heim);
            if (heim == team || gast == team) {
                id = j;
            }
        }
        if (text != null) {
            int commentsize = liveticker.getSpiel().get(id).getKommentare().getKommentar().size();
            liveticker.getSpiel().get(id).getKommentare().getKommentar().add(commentsize, comment);
            liveticker.getSpiel().get(id).getKommentare().getKommentar().get(commentsize).setMinute(min);
            liveticker.getSpiel().get(id).getKommentare().getKommentar().get(commentsize).setText(text);

        }

        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
        m.marshal(liveticker, System.out);

        Writer w = null;
        w = new FileWriter("/Users/djga/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker_Testdaten.xml");
        m.marshal(liveticker, w);
        w.close();
        return liveticker;


    }

    //Setzt oder aktualisiert das Endergebnis und das Tor
    @PUT
    @Path("/{id}")
    @Produces("application/xml")
    public Liveticker setErgebnis(@PathParam("id") int team, @FormParam("Ergebnis") String erg, @FormParam("Torschuetze") String schuetze, @FormParam("Mannschaft des Torschuetzen") String mannschaft, @PathParam("Minute") int min) throws JAXBException, IOException {
        Liveticker liveticker;
        ObjectFactory ob = new ObjectFactory();
        JAXBContext context = JAXBContext.newInstance(Liveticker.class);
        Unmarshaller um = context.createUnmarshaller();
        liveticker = (Liveticker) um.unmarshal(new FileReader("/Users/djga/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker_Testdaten.xml"));
        int id = 0;

        for (int j = 0; j < liveticker.getSpiel().size(); j++) {
            int heim = Integer.parseInt(liveticker.getSpiel().get(j).getHeimmannschaft().getMannId());
            int gast = Integer.parseInt(liveticker.getSpiel().get(j).getGastmannschaft().getMannId());
            System.out.println(heim);
            if (heim == team || gast == team) {
                id = j;
            }
        }
        if (erg != null) {
            liveticker.getSpiel().get(id).getEndergebnis().setErgebnis(erg);
            liveticker.getSpiel().get(id).getEndergebnis().getTore().
        }

        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
        m.marshal(liveticker, System.out);

        Writer w;
        w = new FileWriter("/Users/djga/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker_Testdaten.xml");
        m.marshal(liveticker, w);
        w.close();
        return liveticker;
    }
}





