package Mannschaft;


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
 * Time: 13:12
 * To change this template use File | Settings | File Templates.
 */
public class MannschaftService {
    // never used?
    @Path("/test/{id}")
    @GET

    public void getMannschaft1(@PathParam("test/id") int follow) throws JAXBException, IOException {

        JAXBContext jc = JAXBContext.newInstance(Mannschaften.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Mannschaften mannschaft = (Mannschaften) unmarshaller.unmarshal(new File("/Users/djga/Dropbox/coding/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft.xml"));

        int i = 0;
        int laufen = 0;
        String ein;
        while (laufen != 1) {
            int mannId = Integer.parseInt(mannschaft.getMannschaft().get(i).getMannID());
            if (mannId == follow) {
                System.out.println(" " + mannschaft.getMannschaft().get(i).getMannschaftsname());
                System.out.println(" " + mannschaft.getMannschaft().get(i).getAbonnent());
                laufen = 1;
            } else {
                i++;

            }

        }

    }

    public void getMannschaft2(@PathParam("test/user") String abo) throws JAXBException, IOException {

        JAXBContext jc = JAXBContext.newInstance(Mannschaften.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Mannschaften mannschaft = (Mannschaften) unmarshaller.unmarshal(new File("/Users/djga/Dropbox/coding/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft.xml"));

        int i = 0;
        int laufen = 0;
        String ein;
        while (laufen != 1) {
            // IOOB Exception weil Abonnent vom Typ <List>String durch minOccurs/maxOccurs
            //VERSUCH1
            ein = String.valueOf(mannschaft.getMannschaft().get(i).getAbonnent());
            //VERSUCH2
            //         ein = mannschaft.getMannschaft().get(i).getAbonnent().toString();
            if (ein == abo) {
                System.out.println(" " + mannschaft.getMannschaft().get(i).getAbonnent());
                System.out.println(" " + mannschaft.getMannschaft().get(i).getMannschaftsname());
                laufen = 1;
            } else {
                i++;

            }

        }

    }


}
