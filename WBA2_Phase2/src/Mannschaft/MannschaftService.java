package Mannschaft;


import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import Mannschaft.Mannschaften.Abonnement.*;

/**
 * Created with IntelliJ IDEA.
 * User: Oli
 * Date: 08.05.13
 * Time: 13:12
 * To change this template use File | Settings | File Templates.
 */
public class MannschaftService {
    @Path("/mannschaft")
    @GET
    @Produces("application/xml")

    public Mannschaften getMannschaft(@PathParam("id") int follow) throws JAXBException, IOException {

        JAXBContext jc = JAXBContext.newInstance(Mannschaften.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Mannschaften mannschaft = (Mannschaften) unmarshaller.unmarshal(new File("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft_Test.xml"));

        int i = 0;
        int laufen = 0;
        while (laufen != 1) {
            //int mannId = Integer.parseInt(mannschaft.getAbonnement().get(i).getMannID());
            if (mannschaft.getAbonnement().get(i).getMannID() == follow) {
                System.out.println("Mannschaft: " + mannschaft.getAbonnement().get(i).getMannschaftsname());
                System.out.println("Follower:");
                for (int j = 0; j < mannschaft.getAbonnement().get(i).getAbonnent().size(); j++) {

                    System.out.println(" " + mannschaft.getAbonnement().get(i).getAbonnent().get(j));
                }
                laufen = 1;
            } else {
                i++;

            }
        }
        return mannschaft;

    }
    /*
    public void getUser(@PathParam("mannschaft/user") String abo) throws JAXBException, IOException {

        JAXBContext jc = JAXBContext.newInstance(Mannschaften.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Mannschaften mannschaft = (Mannschaften) unmarshaller.unmarshal(new File("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft_Test.xml"));

        int i = 0;
        int laufen = 0;
        // Jeder User nur 1 Abo. Muss noch geändert werden.
        while (laufen != 1) {
            ;
            if (mannschaft.getAbonnement().get(i).getAbonnent().equals(abo)) {
                System.out.println(" " + mannschaft.getAbonnement().get(i).getAbonnent());
                System.out.println(" " + mannschaft.getAbonnement().get(i).getMannschaftsname());
                laufen = 1;
            } else {
                i++;

            }

        }


    }
    */


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
            return mannschaften;
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


        man.getAbonnement().addAll(mannschaften.getAbonnement());
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < man.getAbonnement().get(i).getAbonnent().size(); j++) {
                if (mannschaften.getAbonnement().get(i).getAbonnent().get(j).equals(x)) {
                    man.getAbonnement().get(i).getAbonnent().remove(j);
                }
            }
        }


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

}