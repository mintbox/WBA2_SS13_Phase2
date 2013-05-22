package Mannschaft;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
 * Date: 22.05.13
 * Time: 15:18
 * To change this template use File | Settings | File Templates.
 */
public class MannTestDennis {
    @POST
    @Path("mannschaft/user/id")
    @Produces("application/xml")
    public Mannschaften newAbo(@FormParam("Abonnent") String abo, @FormParam("Mann_ID") int team) throws JAXBException, IOException {

        Mannschaften mannschaften;
        //Mannschaften.Abonnement mannschaft = new Mannschaften.Abonnement();
        JAXBContext context = JAXBContext.newInstance(Mannschaften.class);
        Unmarshaller um = context.createUnmarshaller();
        mannschaften = (Mannschaften) um.unmarshal(new FileReader("/Users/djga/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft_Test.xml"));
        int id = 0;
        Mannschaften.Abonnement abonnement = new Mannschaften.Abonnement();

       /* int z = 0;
        int i = 0;
        while (z != 1) {
            if (mannschaften.getAbonnement().get(i).getMannID() == id) {
                System.out.println("HALLO");
                for (int j = 0; j < mannschaft.getAbonnent().size(); j++) {
                    System.out.println("GEHT DOCH");
                    mannschaft.getAbonnent().add(mannschaft.getAbonnent().size(), abo);
                }
                z = 1;
            } else {
                i++;
            }
        }
*/

        for (int j = 0; j < mannschaften.getAbonnement().size(); j++) {
            int heim = mannschaften.getAbonnement().get(j).getMannID();
            if (heim == team) {
                id = j;
            }
        }

        if(team !=0){
        int abosize = mannschaften.getAbonnement().get(id).getAbonnent().size();
        mannschaften.getAbonnement().get(id).getAbonnent().add(abosize, abo);
        }

        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
        m.marshal(mannschaften, System.out);

        Writer w = new FileWriter("/Users/djga/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft_Test.xml");
        m.marshal(mannschaften, w);
        w.close();

        return mannschaften;


    }
}
