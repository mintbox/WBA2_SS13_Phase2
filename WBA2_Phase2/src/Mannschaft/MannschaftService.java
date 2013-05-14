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
            int mannId = Integer.parseInt(mannschaft.getAbonnement().get(i).getMannID());
            if (mannId == follow) {
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
    public Mannschaften newAbo(@FormParam("Abonnent") String abo, @FormParam("Mann_ID") int id) throws JAXBException, IOException {

        Mannschaften mannschaften = new Mannschaften();
        Mannschaften.Abonnement mannschaft = new Mannschaften.Abonnement();

        ObjectFactory ob = new ObjectFactory();
        mannschaften = ob.createMannschaften();
        JAXBContext context = JAXBContext.newInstance(Mannschaften.class);
        Unmarshaller um = context.createUnmarshaller();
        mannschaften = (Mannschaften) um.unmarshal(new FileReader("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft_Test.xml"));
        mannschaften.getAbonnement().add(mannschaften.getAbonnement().size(), mannschaft);
        //Die Restriction mit 18 Mannschaften macht nur Sinn wenn Datenbank vorhanden bzw. die Möglichkeit irgendwie auf die IDs zuzugreifen und mehrere Abonnenten abzuspeichern.
        // Evtl ist es sinnvoller die 18 Mannschaftsnamen festzulegen mit einer Art Pulldown und jedes Abo neu anzulegen. Dann bräuchte man beim GET allerdings eine weitere Schleife

        int z = 0;
        int i = 0;
        while (z != 1) {
            int mannId = Integer.parseInt(mannschaften.getAbonnement().get(i).getMannID());
            if (mannId == id) {
                for (int j = 0; j < mannschaft.getAbonnent().size(); j++) {
                    mannschaft.getAbonnent().add(mannschaft.getAbonnent().size(), abo);
                }
                z = 1;
            } else {
                i++;
            }
        }

    /*    mannschaft.getAbonnent().set(0, abo);
        mannschaft.setMannID(id);
        mannschaft.setMannschaftsname(mn);       */

        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
        m.marshal(mannschaften, System.out);

        Writer w = new FileWriter("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft_Test.xml");
        m.marshal(mannschaften, w);
        w.close();

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