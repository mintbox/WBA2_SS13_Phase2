
package Mannschaft;

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
 *         &lt;element name="Abonnement" maxOccurs="18" minOccurs="18">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Abonnent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="Mann_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Mannschaftsname" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "abonnement"
})
@XmlRootElement(name = "Mannschaften")
public class Mannschaften {

    @XmlElement(name = "Abonnement", required = true)
    protected List<Mannschaften.Abonnement> abonnement;

    /**
     * Gets the value of the abonnement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abonnement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbonnement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mannschaften.Abonnement }
     * 
     * 
     */
    public List<Mannschaften.Abonnement> getAbonnement() {
        if (abonnement == null) {
            abonnement = new ArrayList<Mannschaften.Abonnement>();
        }
        return this.abonnement;
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
     *         &lt;element name="Abonnent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="Mann_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Mannschaftsname" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "abonnent",
        "mannID",
        "mannschaftsname"
    })
    public static class Abonnement {

        @XmlElement(name = "Abonnent", required = true)
        protected List<String> abonnent;
        @XmlElement(name = "Mann_ID")
        protected int mannID;
        @XmlElement(name = "Mannschaftsname", required = true)
        protected String mannschaftsname;

        /**
         * Gets the value of the abonnent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the abonnent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAbonnent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAbonnent() {
            if (abonnent == null) {
                abonnent = new ArrayList<String>();
            }
            return this.abonnent;
        }

        /**
         * Gets the value of the mannID property.
         * 
         */
        public int getMannID() {
            return mannID;
        }

        /**
         * Sets the value of the mannID property.
         * 
         */
        public void setMannID(int value) {
            this.mannID = value;
        }

        /**
         * Gets the value of the mannschaftsname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMannschaftsname() {
            return mannschaftsname;
        }

        /**
         * Sets the value of the mannschaftsname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMannschaftsname(String value) {
            this.mannschaftsname = value;
        }

    }

}
