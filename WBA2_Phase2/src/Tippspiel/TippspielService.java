package Tippspiel;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Oli
 * Date: 08.05.13
 * Time: 13:16
 * To change this template use File | Settings | File Templates.
 */
public class TippspielService {

    @Path("/test/")
    @GET

    public void getTippspiel(@PathParam("tipp/user") String tipp) throws JAXBException, IOException {

        JAXBContext jc = JAXBContext.newInstance(Tippspiel.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Tippspiel tippspiel = (Tippspiel) unmarshaller.unmarshal(new File("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Tippspiel.xml/Mannschaft.xml"));

        int i = 0;
        int laufen = 0;
        String ein;
        while (laufen != 1) {
            ein = tippspiel.getName();
            if (ein == tipp) {
                // Schleife benötigt
                System.out.println("Heimmannschaft: " + tippspiel.getSpiel().getHeimmannschaft());
                System.out.println("Gastmannschaft: " + tippspiel.getSpiel().getGastmannschaft());
                laufen = 1;
            } else {
                i++;

            }

        }

    }
}
