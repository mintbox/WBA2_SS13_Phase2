package Liveticker;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: djga
 * Date: 07.05.13
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
public class TestMain {
    public static void main(String[] args) throws JAXBException, IOException {
        LivetickerService test = new LivetickerService();
        test.getMannschaft(1);
       // test.deleteComment(1);
    }
}
