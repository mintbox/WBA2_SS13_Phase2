
package Spieltag;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the Spieltag package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Spieltag
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Spieltag }
     */
    public Spieltag createSpieltag() {
        return new Spieltag();
    }

    /**
     * Create an instance of {@link Spieltag.Spiel }
     */
    public Spieltag.Spiel createSpieltagSpiel() {
        return new Spieltag.Spiel();
    }

    /**
     * Create an instance of {@link Spieltag.Spiel.Endergebnis }
     */
    public Spieltag.Spiel.Endergebnis createSpieltagSpielEndergebnis() {
        return new Spieltag.Spiel.Endergebnis();
    }

    /**
     * Create an instance of {@link Spieltag.Spiel.Endergebnis.Tore }
     */
    public Spieltag.Spiel.Endergebnis.Tore createSpieltagSpielEndergebnisTore() {
        return new Spieltag.Spiel.Endergebnis.Tore();
    }

    /**
     * Create an instance of {@link Spieltag.Spiel.Endergebnis.Tore.Tor }
     */
    public Spieltag.Spiel.Endergebnis.Tore.Tor createSpieltagSpielEndergebnisToreTor() {
        return new Spieltag.Spiel.Endergebnis.Tore.Tor();
    }

}
