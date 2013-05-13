package Spieltag;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 11.05.13
 * Time: 19:47
 * To change this template use File | Settings | File Templates.
 */
public class SpieltagTest {
    public static void main(String[] args) throws JAXBException, IOException {
        SpieltagService test = new SpieltagService();
        test.getSpieltag(1);

    }
}
