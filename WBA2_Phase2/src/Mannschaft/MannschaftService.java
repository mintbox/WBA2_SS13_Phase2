package Mannschaft;


import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

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

    public void getMannschaft(@PathParam("mannschaft/id") int follow) throws JAXBException, IOException {

        JAXBContext jc = JAXBContext.newInstance(Mannschaften.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Mannschaften mannschaft = (Mannschaften) unmarshaller.unmarshal(new File("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft_Test.xml"));

        int i = 0;
        int laufen = 0;
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

    public void getUser(@PathParam("mannschaft/user") String abo) throws JAXBException, IOException {

        JAXBContext jc = JAXBContext.newInstance(Mannschaften.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Mannschaften mannschaft = (Mannschaften) unmarshaller.unmarshal(new File("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft_Test.xml"));

        int i = 0;
        int laufen = 0;
        // Jeder User nur 1 Abo. Muss noch geändert werden.
        while (laufen != 1) {
            ;
            if (mannschaft.getMannschaft().get(i).getAbonnent().equals(abo)) {
                System.out.println(" " + mannschaft.getMannschaft().get(i).getAbonnent());
                System.out.println(" " + mannschaft.getMannschaft().get(i).getMannschaftsname());
                laufen = 1;
            } else {
                i++;

            }

        }


    }














    @DELETE
    @Path("mannschaft/user")
    @Produces("application/xml")
    public Mannschaften deleteAbo(@PathParam("user") String x) throws JAXBException, IOException {
        ObjectFactory ob = new ObjectFactory();
        Mannschaften man = ob.createMannschaften();
        JAXBContext context = JAXBContext.newInstance(Mannschaften.class);
        Unmarshaller um = context.createUnmarshaller();
        Mannschaften mannschaften = (Mannschaften) um.unmarshal(new FileReader("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft_Test.xml"));

        int i = 0;

        //löscht noch eine komplette mannschaft inkl abonnent

        if (mannschaften.getMannschaft().get(i).getAbonnent().equalsIgnoreCase(x)) {
            man.getMannschaft().addAll(mannschaften.getMannschaft());
            man.getMannschaft().remove(mannschaften.getMannschaft().get(i));

            // Marshall content to XML-File.
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
            m.marshal(man, System.out);


            Writer w = new FileWriter("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft_Test.xml");
            m.marshal(man, w);
            w.close();
            return man;
        }
        return man;

    }

}
