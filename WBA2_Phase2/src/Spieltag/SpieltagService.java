package Spieltag;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 11.05.13
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */

@Path("/spieltag")
public class SpieltagService {

    @GET
    @Produces("application/xml")
    public Spieltag getSpieltag(@QueryParam("spieltagsnummer") int x) throws JAXBException, FileNotFoundException {

        Spieltag spieltag = new Spieltag();
        ObjectFactory ob = new ObjectFactory();
        spieltag = ob.createSpieltag();
        JAXBContext context = JAXBContext.newInstance(Spieltag.class);
        Unmarshaller um = context.createUnmarshaller();
        spieltag = (Spieltag) um.unmarshal(new FileReader("/Users/djga/Dropbox/coding/WBA2_SS13/WBA2_SS13_Phase2/WBA2_Phase2/src/Spieltag/Spieltag1.xml"));
        Spieltag st = ob.createSpieltag();
        if (x != 0) {
            for (int i = 0; i < spieltag.getSpiel().size(); i++) {
                int tagnr = (Integer) spieltag.getSpieltagsnummer();
                if (tagnr == x) {
                    st.getSpiel().add(spieltag.getSpiel().get(i));
                }
            }
            return st;
        }

        return spieltag;
    }
}
