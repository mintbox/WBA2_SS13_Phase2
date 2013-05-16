
package Mannschaft;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Mannschaft" maxOccurs="18" minOccurs="18">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Abonnent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Mann_ID" type="{http://www.w3.org/2001/XMLSchema}ID"/>
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
    "mannschaft"
})
@XmlRootElement(name = "Mannschaften")
public class Mannschaften {

    @XmlElement(name = "Mannschaft", required = true)
    protected List<Mannschaften.Mannschaft> mannschaft;

    /**
     * Gets the value of the mannschaft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mannschaft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMannschaft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mannschaften.Mannschaft }
     * 
     * 
     */
    public List<Mannschaften.Mannschaft> getMannschaft() {
        if (mannschaft == null) {
            mannschaft = new ArrayList<Mannschaften.Mannschaft>();
        }
        return this.mannschaft;
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
     *         &lt;element name="Abonnent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Mann_ID" type="{http://www.w3.org/2001/XMLSchema}ID"/>
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
    public static class Mannschaft {

        @XmlElement(name = "Abonnent")
        protected List<String> abonnent;
        @XmlElement(name = "Mann_ID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String mannID;
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
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMannID() {
            return mannID;
        }

        /**
         * Sets the value of the mannID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMannID(String value) {
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
