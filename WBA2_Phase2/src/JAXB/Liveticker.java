
package JAXB;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Heimmannschaft" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Gastmannschaft" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Endergebnis">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Ergebnis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;sequence>
 *                     &lt;element name="Tore">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Tor" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="Torschuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="Mannschaft_Schuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Kommentare">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Kommentar" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "endergebnis",
    "kommentare"
})
@XmlRootElement(name = "Liveticker")
public class Liveticker {

    @XmlElement(name = "Heimmannschaft", required = true)
    protected String heimmannschaft;
    @XmlElement(name = "Gastmannschaft", required = true)
    protected String gastmannschaft;
    @XmlElement(name = "Endergebnis", required = true)
    protected Liveticker.Endergebnis endergebnis;
    @XmlElement(name = "Kommentare", required = true)
    protected Liveticker.Kommentare kommentare;

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
     * Gets the value of the endergebnis property.
     * 
     * @return
     *     possible object is
     *     {@link Liveticker.Endergebnis }
     *     
     */
    public Liveticker.Endergebnis getEndergebnis() {
        return endergebnis;
    }

    /**
     * Sets the value of the endergebnis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Liveticker.Endergebnis }
     *     
     */
    public void setEndergebnis(Liveticker.Endergebnis value) {
        this.endergebnis = value;
    }

    /**
     * Gets the value of the kommentare property.
     * 
     * @return
     *     possible object is
     *     {@link Liveticker.Kommentare }
     *     
     */
    public Liveticker.Kommentare getKommentare() {
        return kommentare;
    }

    /**
     * Sets the value of the kommentare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Liveticker.Kommentare }
     *     
     */
    public void setKommentare(Liveticker.Kommentare value) {
        this.kommentare = value;
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
     *         &lt;element name="Ergebnis" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;sequence>
     *           &lt;element name="Tore">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="Tor" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="Torschuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="Mannschaft_Schuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
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
        "ergebnis",
        "tore"
    })
    public static class Endergebnis {

        @XmlElement(name = "Ergebnis", required = true)
        protected String ergebnis;
        @XmlElement(name = "Tore", required = true)
        protected Liveticker.Endergebnis.Tore tore;

        /**
         * Gets the value of the ergebnis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErgebnis() {
            return ergebnis;
        }

        /**
         * Sets the value of the ergebnis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErgebnis(String value) {
            this.ergebnis = value;
        }

        /**
         * Gets the value of the tore property.
         * 
         * @return
         *     possible object is
         *     {@link Liveticker.Endergebnis.Tore }
         *     
         */
        public Liveticker.Endergebnis.Tore getTore() {
            return tore;
        }

        /**
         * Sets the value of the tore property.
         * 
         * @param value
         *     allowed object is
         *     {@link Liveticker.Endergebnis.Tore }
         *     
         */
        public void setTore(Liveticker.Endergebnis.Tore value) {
            this.tore = value;
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
         *         &lt;element name="Tor" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Torschuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Mannschaft_Schuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "tor"
        })
        public static class Tore {

            @XmlElement(name = "Tor")
            protected List<Liveticker.Endergebnis.Tore.Tor> tor;

            /**
             * Gets the value of the tor property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tor property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Liveticker.Endergebnis.Tore.Tor }
             * 
             * 
             */
            public List<Liveticker.Endergebnis.Tore.Tor> getTor() {
                if (tor == null) {
                    tor = new ArrayList<Liveticker.Endergebnis.Tore.Tor>();
                }
                return this.tor;
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
             *         &lt;element name="Torschuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Mannschaft_Schuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
                "torschuetze",
                "mannschaftSchuetze",
                "minute"
            })
            public static class Tor {

                @XmlElement(name = "Torschuetze", required = true)
                protected String torschuetze;
                @XmlElement(name = "Mannschaft_Schuetze", required = true)
                protected String mannschaftSchuetze;
                @XmlElement(name = "Minute")
                protected int minute;

                /**
                 * Gets the value of the torschuetze property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTorschuetze() {
                    return torschuetze;
                }

                /**
                 * Sets the value of the torschuetze property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTorschuetze(String value) {
                    this.torschuetze = value;
                }

                /**
                 * Gets the value of the mannschaftSchuetze property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMannschaftSchuetze() {
                    return mannschaftSchuetze;
                }

                /**
                 * Sets the value of the mannschaftSchuetze property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMannschaftSchuetze(String value) {
                    this.mannschaftSchuetze = value;
                }

                /**
                 * Gets the value of the minute property.
                 * 
                 */
                public int getMinute() {
                    return minute;
                }

                /**
                 * Sets the value of the minute property.
                 * 
                 */
                public void setMinute(int value) {
                    this.minute = value;
                }

            }

        }

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
     *         &lt;element name="Kommentar" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "kommentar"
    })
    public static class Kommentare {

        @XmlElement(name = "Kommentar")
        protected List<Liveticker.Kommentare.Kommentar> kommentar;

        /**
         * Gets the value of the kommentar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kommentar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKommentar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Liveticker.Kommentare.Kommentar }
         * 
         * 
         */
        public List<Liveticker.Kommentare.Kommentar> getKommentar() {
            if (kommentar == null) {
                kommentar = new ArrayList<Liveticker.Kommentare.Kommentar>();
            }
            return this.kommentar;
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
         *         &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "minute",
            "text"
        })
        public static class Kommentar {

            @XmlElement(name = "Minute")
            protected int minute;
            @XmlElement(name = "Text", required = true)
            protected String text;

            /**
             * Gets the value of the minute property.
             * 
             */
            public int getMinute() {
                return minute;
            }

            /**
             * Sets the value of the minute property.
             * 
             */
            public void setMinute(int value) {
                this.minute = value;
            }

            /**
             * Gets the value of the text property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

        }

    }

}
