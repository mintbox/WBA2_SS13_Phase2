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
    @Path("/test/")
    @GET

    public void getMannschaft1(@PathParam("test/{id}") int follow) throws JAXBException, IOException {

        JAXBContext jc = JAXBContext.newInstance(Mannschaften.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Mannschaften mannschaft = (Mannschaften) unmarshaller.unmarshal(new File("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft.xml"));

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
        Mannschaften mannschaft = (Mannschaften) unmarshaller.unmarshal(new File("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft.xml"));

        int i = 0;
        int laufen = 0;
        String ein;
        while (laufen != 1) {
            // IOOB Exception weil Abonnent vom Typ <List>String durch minOccurs/maxOccurs
            //VERSUCH1
            ein = String.valueOf(mannschaft.getMannschaft().get(i).getAbonnent());
            //VERSUCH2
            ein = mannschaft.getMannschaft().get(i).getAbonnent().toString();
            if (ein == abo) {
                // Schleife benötigt
                System.out.println(" " + mannschaft.getMannschaft().get(i).getAbonnent());
                System.out.println(" " + mannschaft.getMannschaft().get(i).getMannschaftsname());
                laufen = 1;
            } else {
                i++;

            }

        }

    }
    @POST
    @Path("/mannschaft/user")
    @Produces("application/xml")



    public void createAbo(@PathParam("user") String x) throws JAXBException, IOException{

        File datei = new File(("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft.xml"));


        Mannschaften mannschaften = new Mannschaften();
        ObjectFactory ob = new ObjectFactory();
        mannschaften = ob.createMannschaften();
        JAXBContext jc = JAXBContext.newInstance(Mannschaften.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        mannschaften = (Mannschaften) unmarshaller.unmarshal(new File("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Mannschaft/Mannschaft.xml"));

        Writer w = new FileWriter(datei);
     //   Mannschaften.Mannschaft newAbo =





    }
    /**
    public Tests createTest(@PathParam("id") int i, @FormParam("text")String text)throws JAXBException, IOException{

        Tests test = new Tests();
        Test t = new Test();

        t.setId(i);
        t.setText(text);

        ObjectFactory ob = new ObjectFactory();
        test = ob.createTests();
        JAXBContext context = JAXBContext.newInstance(Tests.class);
        Unmarshaller um = context.createUnmarshaller();
        test = (Tests) um.unmarshal(new FileReader("/Users/FlorianWolf/Documents/workspace_WBA2_SS13/JaxRsHelloWorld/src/Test.xml"));

        test.getTest().add(test.getTest().size(), t);


        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
        m.marshal(test, System.out);

        Writer w = null;
        w = new FileWriter("/Users/FlorianWolf/Documents/workspace_WBA2_SS13/JaxRsHelloWorld/src/Test.xml");
        m.marshal(test, w);
        w.close();

        return test;

    }

     */
}
