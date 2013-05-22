package Mannschaft;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Oli
 * Date: 08.05.13
 * Time: 14:09
 * To change this template use File | Settings | File Templates.
 */
public class MannschaftTest {
    public static void main(String[] args) throws JAXBException, IOException {
        MannschaftService test = new MannschaftService();
        MannTestDennis blaa = new MannTestDennis();
        //test.getMannschaft(1);
        //test.getUser("Oli");
        //test.deleteAbo("Alf");
        //test.newAbo("Ich", 2);
        blaa.newAbo("Dennis", 3);

    }
}
