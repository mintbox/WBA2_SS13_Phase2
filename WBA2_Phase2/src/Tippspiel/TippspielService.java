package Tippspiel;


import Liveticker.Liveticker;

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
 * Time: 13:16
 * To change this template use File | Settings | File Templates.
 */
public class TippspielService {

    @Path("/test/")
    @GET

    public void getTippspiel(@PathParam("tipp/user") String tipp) throws JAXBException, IOException {

        JAXBContext jc = JAXBContext.newInstance(Tippspiel.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Tippspiel tippspiel = (Tippspiel) unmarshaller.unmarshal(new File("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Tippspiel/Tippspiel.xml"));

        int i = 0;
        int laufen = 0;
        String ein;
        while (laufen != 1) {
            ein = tippspiel.getTipp().getName();
            if (tippspiel.getTipp().getName().equalsIgnoreCase(tipp)) {
                // Schleife benötigt
                System.out.println("Heimmannschaft: " + tippspiel.getTipp().getSpiel().getHeimmannschaft());
                System.out.println("Gastmannschaft: " + tippspiel.getTipp().getSpiel().getGastmannschaft());
                System.out.println("Ergebnis: " + tippspiel.getTipp().getSpiel().getErgebnis());
                laufen = 1;
            } else {
                i++;

            }

        }

    }

    @Path("/test/")
    @GET

    public void getErgebnis(@PathParam("tipp/ergebnis") String erg) throws JAXBException, IOException {

        JAXBContext jc = JAXBContext.newInstance(Tippspiel.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Tippspiel tippspiel = (Tippspiel) unmarshaller.unmarshal(new File("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Tippspiel/Tippspiel.xml"));

        int i = 0;
        int laufen = 0;
        String ein;
        while (laufen != 1) {
            ein = tippspiel.getTipp().getName();
           // for (int j = 0; j < 10; j++) {
                if (tippspiel.getTipp().getSpiel().getErgebnis().compareTo(erg) == 0) {
                    System.out.println("Tipper: " + tippspiel.getTipp().getName());
                    laufen = 1;
                } else {
                  //  j++;

                }
           // }
        }

    }
    @DELETE
    @Path("tippspiel/user")
    @Produces("application/xml")
    public Tippspiel deleteTipp(@PathParam("user") String x) throws JAXBException, IOException {
        ObjectFactory ob = new ObjectFactory();
        Tippspiel ts = ob.createTippspiel();
        JAXBContext context = JAXBContext.newInstance(Tippspiel.class);
        Unmarshaller um = context.createUnmarshaller();
        Tippspiel tippspiel = (Tippspiel) um.unmarshal(new FileReader("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Tippspiel/Tippspiel_Test.xml"));

       // for (int i = 0; i < ts.getTipp().SIZE; i++) {
        int laufen2 = 0;
        int y=0;
        while(laufen2 != 1){
        if (tippspiel.getTipp().getName() == x){
            ts.getTipp().setName("TestName");
            ts.getTipp().getSpiel().setErgebnis("TestErgebnis");
            laufen2 = 1;
        }
        }
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
        m.marshal(ts, System.out);

        Writer w;
        w = new FileWriter("/Users/Oli/git/WBA2_SS13_Phase2/WBA2_Phase2/src/Tippspiel/Tippspiel_Test.xml");
        m.marshal(ts, w);
        w.close();


        return ts;
        }

}
