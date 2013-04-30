
package JAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;sequence>
 *           &lt;element name="Spiel">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Heimmannschaft" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="Gastmannschaft" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="Tipp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "spiel"
})
@XmlRootElement(name = "Tippspiel")
public class Tippspiel {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Spiel", required = true)
    protected Tippspiel.Spiel spiel;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the spiel property.
     * 
     * @return
     *     possible object is
     *     {@link Tippspiel.Spiel }
     *     
     */
    public Tippspiel.Spiel getSpiel() {
        return spiel;
    }

    /**
     * Sets the value of the spiel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tippspiel.Spiel }
     *     
     */
    public void setSpiel(Tippspiel.Spiel value) {
        this.spiel = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Heimmannschaft" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Gastmannschaft" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Tipp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "heimmannschaft",
        "gastmannschaft",
        "tipp"
    })
    public static class Spiel {

        @XmlElement(name = "Heimmannschaft", required = true)
        protected String heimmannschaft;
        @XmlElement(name = "Gastmannschaft", required = true)
        protected String gastmannschaft;
        @XmlElement(name = "Tipp", required = true)
        protected String tipp;

        /**
         * Gets the value of the heimmannschaft property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeimmannschaft() {
            return heimmannschaft;
        }

        /**
         * Sets the value of the heimmannschaft property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeimmannschaft(String value) {
            this.heimmannschaft = value;
        }

        /**
         * Gets the value of the gastmannschaft property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGastmannschaft() {
            return gastmannschaft;
        }

        /**
         * Sets the value of the gastmannschaft property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGastmannschaft(String value) {
            this.gastmannschaft = value;
        }

        /**
         * Gets the value of the tipp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipp() {
            return tipp;
        }

        /**
         * Sets the value of the tipp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipp(String value) {
            this.tipp = value;
        }

    }

}
