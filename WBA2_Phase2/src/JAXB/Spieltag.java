
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
 *         &lt;element name="Spieltagsnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Spiel" maxOccurs="9" minOccurs="9">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Heimmannschaft" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Gastmannschaft" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Endergebnis">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Ergebnis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Tore">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Tor" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Torschuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Mannschaft_Schuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
    "spieltagsnummer",
    "spiel"
})
@XmlRootElement(name = "Spieltag")
public class Spieltag {

    @XmlElement(name = "Spieltagsnummer")
    protected int spieltagsnummer;
    @XmlElement(name = "Spiel", required = true)
    protected List<Spieltag.Spiel> spiel;

    /**
     * Gets the value of the spieltagsnummer property.
     * 
     */
    public int getSpieltagsnummer() {
        return spieltagsnummer;
    }

    /**
     * Sets the value of the spieltagsnummer property.
     * 
     */
    public void setSpieltagsnummer(int value) {
        this.spieltagsnummer = value;
    }

    /**
     * Gets the value of the spiel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spiel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpiel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Spieltag.Spiel }
     * 
     * 
     */
    public List<Spieltag.Spiel> getSpiel() {
        if (spiel == null) {
            spiel = new ArrayList<Spieltag.Spiel>();
        }
        return this.spiel;
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
     *         &lt;element name="Endergebnis">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Ergebnis" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Tore">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Tor" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Torschuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Mannschaft_Schuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
        "endergebnis"
    })
    public static class Spiel {

        @XmlElement(name = "Heimmannschaft", required = true)
        protected String heimmannschaft;
        @XmlElement(name = "Gastmannschaft", required = true)
        protected String gastmannschaft;
        @XmlElement(name = "Endergebnis", required = true)
        protected Spieltag.Spiel.Endergebnis endergebnis;

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
         *     {@link Spieltag.Spiel.Endergebnis }
         *     
         */
        public Spieltag.Spiel.Endergebnis getEndergebnis() {
            return endergebnis;
        }

        /**
         * Sets the value of the endergebnis property.
         * 
         * @param value
         *     allowed object is
         *     {@link Spieltag.Spiel.Endergebnis }
         *     
         */
        public void setEndergebnis(Spieltag.Spiel.Endergebnis value) {
            this.endergebnis = value;
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
         *         &lt;element name="Tore">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Tor" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Torschuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Mannschaft_Schuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "ergebnis",
            "tore"
        })
        public static class Endergebnis {

            @XmlElement(name = "Ergebnis", required = true)
            protected String ergebnis;
            @XmlElement(name = "Tore", required = true)
            protected Spieltag.Spiel.Endergebnis.Tore tore;

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
             *     {@link Spieltag.Spiel.Endergebnis.Tore }
             *     
             */
            public Spieltag.Spiel.Endergebnis.Tore getTore() {
                return tore;
            }

            /**
             * Sets the value of the tore property.
             * 
             * @param value
             *     allowed object is
             *     {@link Spieltag.Spiel.Endergebnis.Tore }
             *     
             */
            public void setTore(Spieltag.Spiel.Endergebnis.Tore value) {
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
                protected List<Spieltag.Spiel.Endergebnis.Tore.Tor> tor;

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
                 * {@link Spieltag.Spiel.Endergebnis.Tore.Tor }
                 * 
                 * 
                 */
                public List<Spieltag.Spiel.Endergebnis.Tore.Tor> getTor() {
                    if (tor == null) {
                        tor = new ArrayList<Spieltag.Spiel.Endergebnis.Tore.Tor>();
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

    }

}
