package Liveticker;

import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 07.05.13
 * Time: 13:54
 * To change this template use File | Settings | File Templates.
 */
@Path("/liveticker")
public class LivetickerService {

    @Path("/{id}")
    @GET
    @Produces("application/xml")
    public Liveticker getMannschaft(@PathParam("id") int team) throws JAXBException, IOException {
        Liveticker liveticker = new Liveticker();
        ObjectFactory ob = new ObjectFactory();
        liveticker = ob.createLiveticker();
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

       lt.getSpiel().addAll(liveticker.getSpiel());
        for (int j = 0; j < liveticker.getSpiel().size(); j++) {
            int heim = Integer.parseInt(liveticker.getSpiel().get(j).getHeimmannschaft().getMannId());
            int gast = Integer.parseInt(liveticker.getSpiel().get(j).getGastmannschaft().getMannId());
            if (heim == team || gast == team)
                lt.getSpiel().remove(liveticker.getSpiel().get(team).getKommentare().getKommentar());
        }
        // Marshall content to XML-File.
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
        m.marshal(lt, System.out);

        Writer w = null;
        w = new FileWriter("/Users/djga/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker_Testdaten.xml");
        m.marshal(lt, w);
        w.close();
        return lt;
    }
}
