package Liveticker;

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
 * User: djga
 * Date: 07.05.13
 * Time: 13:54
 * To change this template use File | Settings | File Templates.
 */
public class LivetickerService {
    @Path("/{id}")
    @GET

    public void getMannschaft(@PathParam("id") int team) throws JAXBException, IOException {
        int test = 0;

        JAXBContext jc = JAXBContext.newInstance(Liveticker.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
                /*FRAGE: Wie funktioniert das bei verteilten Systemen?*/
        Liveticker liveticker = (Liveticker) unmarshaller.unmarshal(new File("/Users/djga/Dropbox/coding/WBA2_SS13_Phase2/WBA2_Phase2/src/Liveticker/LiveTicker.xml"));
        //Evtl ID's der Mannschaften ausgeben
        int i = 0;
        while (test != 1) {
            int heimId = Integer.parseInt(liveticker.getSpiel().get(i).getHeimmannschaft().getMannId());
            int gastId = Integer.parseInt(liveticker.getSpiel().get(i).getGastmannschaft().getMannId());
            if (heimId == (team) || gastId == team) {
                System.out.println("Heimmannschaft: " + liveticker.getSpiel().get(i).getHeimmannschaft());
                System.out.println("Gastmannschaft: " + liveticker.getSpiel().get(i).getGastmannschaft());

                for (int j = 0; j < liveticker.getSpiel().size(); j++) {
                    System.out.println(liveticker.getSpiel().get(i).Endergebnis.Tore);

                }


                test = 1;
            } else
                i++;


        }

    }
}
