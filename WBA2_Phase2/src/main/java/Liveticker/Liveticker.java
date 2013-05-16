
package Liveticker;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Spiel" maxOccurs="9" minOccurs="9">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Heimmannschaft">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="mann_id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Gastmannschaft">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="mann_id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Endergebnis">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Ergebnis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;sequence>
 *                               &lt;element name="Tore">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="Tor" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="Torschuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                   &lt;element name="Mannschaft_Schuetze" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                   &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Kommentare">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Kommentar" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "spiel"
})
@XmlRootElement(name = "Liveticker")
public class Liveticker {

    @XmlElement(name = "Spiel", required = true)
    protected List<Liveticker.Spiel> spiel;

    /**
     * Gets the value of the spiel property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spiel property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpiel().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Liveticker.Spiel }
     */
    public List<Liveticker.Spiel> getSpiel() {
        if (spiel == null) {
            spiel = new ArrayList<Liveticker.Spiel>();
        }
        return this.spiel;
    }


    /**
     * <p>Java class for anonymous complex type.
     * <p/>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Heimmannschaft">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="mann_id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Gastmannschaft">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="mann_id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "heimmannschaft",
            "gastmannschaft",
            "endergebnis",
            "kommentare"
    })
    public static class Spiel {

        @XmlElement(name = "Heimmannschaft", required = true)
        protected Liveticker.Spiel.Heimmannschaft heimmannschaft;
        @XmlElement(name = "Gastmannschaft", required = true)
        protected Liveticker.Spiel.Gastmannschaft gastmannschaft;
        @XmlElement(name = "Endergebnis", required = true)
        protected Liveticker.Spiel.Endergebnis endergebnis;
        @XmlElement(name = "Kommentare", required = true)
        protected Liveticker.Spiel.Kommentare kommentare;

        /**
         * Gets the value of the heimmannschaft property.
         *
         * @return possible object is
         *         {@link Liveticker.Spiel.Heimmannschaft }
         */
        public Liveticker.Spiel.Heimmannschaft getHeimmannschaft() {
            return heimmannschaft;
        }

        /**
         * Sets the value of the heimmannschaft property.
         *
         * @param value allowed object is
         *              {@link Liveticker.Spiel.Heimmannschaft }
         */
        public void setHeimmannschaft(Liveticker.Spiel.Heimmannschaft value) {
            this.heimmannschaft = value;
        }

        /**
         * Gets the value of the gastmannschaft property.
         *
         * @return possible object is
         *         {@link Liveticker.Spiel.Gastmannschaft }
         */
        public Liveticker.Spiel.Gastmannschaft getGastmannschaft() {
            return gastmannschaft;
        }

        /**
         * Sets the value of the gastmannschaft property.
         *
         * @param value allowed object is
         *              {@link Liveticker.Spiel.Gastmannschaft }
         */
        public void setGastmannschaft(Liveticker.Spiel.Gastmannschaft value) {
            this.gastmannschaft = value;
        }

        /**
         * Gets the value of the endergebnis property.
         *
         * @return possible object is
         *         {@link Liveticker.Spiel.Endergebnis }
         */
        public Liveticker.Spiel.Endergebnis getEndergebnis() {
            return endergebnis;
        }

        /**
         * Sets the value of the endergebnis property.
         *
         * @param value allowed object is
         *              {@link Liveticker.Spiel.Endergebnis }
         */
        public void setEndergebnis(Liveticker.Spiel.Endergebnis value) {
            this.endergebnis = value;
        }

        /**
         * Gets the value of the kommentare property.
         *
         * @return possible object is
         *         {@link Liveticker.Spiel.Kommentare }
         */
        public Liveticker.Spiel.Kommentare getKommentare() {
            return kommentare;
        }

        /**
         * Sets the value of the kommentare property.
         *
         * @param value allowed object is
         *              {@link Liveticker.Spiel.Kommentare }
         */
        public void setKommentare(Liveticker.Spiel.Kommentare value) {
            this.kommentare = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * <p/>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p/>
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
            protected Liveticker.Spiel.Endergebnis.Tore tore;

            /**
             * Gets the value of the ergebnis property.
             *
             * @return possible object is
             *         {@link String }
             */
            public String getErgebnis() {
                return ergebnis;
            }

            /**
             * Sets the value of the ergebnis property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setErgebnis(String value) {
                this.ergebnis = value;
            }

            /**
             * Gets the value of the tore property.
             *
             * @return possible object is
             *         {@link Liveticker.Spiel.Endergebnis.Tore }
             */
            public Liveticker.Spiel.Endergebnis.Tore getTore() {
                return tore;
            }

            /**
             * Sets the value of the tore property.
             *
             * @param value allowed object is
             *              {@link Liveticker.Spiel.Endergebnis.Tore }
             */
            public void setTore(Liveticker.Spiel.Endergebnis.Tore value) {
                this.tore = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * <p/>
             * <p>The following schema fragment specifies the expected content contained within this class.
             * <p/>
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
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "tor"
            })
            public static class Tore {

                @XmlElement(name = "Tor")
                protected List<Liveticker.Spiel.Endergebnis.Tore.Tor> tor;

                /**
                 * Gets the value of the tor property.
                 * <p/>
                 * <p/>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tor property.
                 * <p/>
                 * <p/>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTor().add(newItem);
                 * </pre>
                 * <p/>
                 * <p/>
                 * <p/>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Liveticker.Spiel.Endergebnis.Tore.Tor }
                 */
                public List<Liveticker.Spiel.Endergebnis.Tore.Tor> getTor() {
                    if (tor == null) {
                        tor = new ArrayList<Liveticker.Spiel.Endergebnis.Tore.Tor>();
                    }
                    return this.tor;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * <p/>
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * <p/>
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
                     * @return possible object is
                     *         {@link String }
                     */
                    public String getTorschuetze() {
                        return torschuetze;
                    }

                    /**
                     * Sets the value of the torschuetze property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setTorschuetze(String value) {
                        this.torschuetze = value;
                    }

                    /**
                     * Gets the value of the mannschaftSchuetze property.
                     *
                     * @return possible object is
                     *         {@link String }
                     */
                    public String getMannschaftSchuetze() {
                        return mannschaftSchuetze;
                    }

                    /**
                     * Sets the value of the mannschaftSchuetze property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setMannschaftSchuetze(String value) {
                        this.mannschaftSchuetze = value;
                    }

                    /**
                     * Gets the value of the minute property.
                     */
                    public int getMinute() {
                        return minute;
                    }

                    /**
                     * Sets the value of the minute property.
                     */
                    public void setMinute(int value) {
                        this.minute = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p/>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="mann_id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "mannId",
                "name"
        })
        public static class Gastmannschaft {

            @XmlElement(name = "mann_id", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String mannId;
            @XmlElement(required = true)
            protected String name;

            /**
             * Gets the value of the mannId property.
             *
             * @return possible object is
             *         {@link String }
             */
            public String getMannId() {
                return mannId;
            }

            /**
             * Sets the value of the mannId property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMannId(String value) {
                this.mannId = value;
            }

            /**
             * Gets the value of the name property.
             *
             * @return possible object is
             *         {@link String }
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setName(String value) {
                this.name = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p/>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p/>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="mann_id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "mannId",
                "name"
        })
        public static class Heimmannschaft {

            @XmlElement(name = "mann_id", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String mannId;
            @XmlElement(required = true)
            protected String name;

            /**
             * Gets the value of the mannId property.
             *
             * @return possible object is
             *         {@link String }
             */
            public String getMannId() {
                return mannId;
            }

            /**
             * Sets the value of the mannId property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMannId(String value) {
                this.mannId = value;
            }

            /**
             * Gets the value of the name property.
             *
             * @return possible object is
             *         {@link String }
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setName(String value) {
                this.name = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p/>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p/>
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
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "kommentar"
        })
        public static class Kommentare {

            @XmlElement(name = "Kommentar")
            protected List<Liveticker.Spiel.Kommentare.Kommentar> kommentar;

            /**
             * Gets the value of the kommentar property.
             * <p/>
             * <p/>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the kommentar property.
             * <p/>
             * <p/>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKommentar().add(newItem);
             * </pre>
             * <p/>
             * <p/>
             * <p/>
             * Objects of the following type(s) are allowed in the list
             * {@link Liveticker.Spiel.Kommentare.Kommentar }
             */
            public List<Liveticker.Spiel.Kommentare.Kommentar> getKommentar() {
                if (kommentar == null) {
                    kommentar = new ArrayList<Liveticker.Spiel.Kommentare.Kommentar>();
                }
                return this.kommentar;
            }


            /**
             * <p>Java class for anonymous complex type.
             * <p/>
             * <p>The following schema fragment specifies the expected content contained within this class.
             * <p/>
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
                 */
                public int getMinute() {
                    return minute;
                }

                /**
                 * Sets the value of the minute property.
                 */
                public void setMinute(int value) {
                    this.minute = value;
                }

                /**
                 * Gets the value of the text property.
                 *
                 * @return possible object is
                 *         {@link String }
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Sets the value of the text property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setText(String value) {
                    this.text = value;
                }

            }

        }

    }

}
