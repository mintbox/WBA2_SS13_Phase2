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
public class Testing {
    public static void main(String[] args) throws JAXBException, IOException {
        MannschaftService test = new MannschaftService();
        //test.getMannschaft(16);
        //test.getUser("Oli");
        //test.deleteAbo("Hans");
        test.newAbo("Ich", "11", "Mein Verein");
    }
}
