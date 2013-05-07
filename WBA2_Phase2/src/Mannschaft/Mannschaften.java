
package Mannschaft;

import javax.xml.bind.annotation.*;
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
 *         &lt;element name="Abonnent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Mannschaft" maxOccurs="18" minOccurs="18">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Mannschaftsname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;any/>
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
        "abonnent",
        "mannschaft"
})
@XmlRootElement(name = "Mannschaften")
public class Mannschaften {

    @XmlElement(name = "Abonnent")
    protected List<String> abonnent;
    @XmlElement(name = "Mannschaft", required = true)
    protected List<Mannschaften.Mannschaft> mannschaft;

    /**
     * Gets the value of the abonnent property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abonnent property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbonnent().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getAbonnent() {
        if (abonnent == null) {
            abonnent = new ArrayList<String>();
        }
        return this.abonnent;
    }

    /**
     * Gets the value of the mannschaft property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mannschaft property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMannschaft().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Mannschaften.Mannschaft }
     */
    public List<Mannschaften.Mannschaft> getMannschaft() {
        if (mannschaft == null) {
            mannschaft = new ArrayList<Mannschaften.Mannschaft>();
        }
        return this.mannschaft;
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
     *         &lt;element name="Mannschaftsname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;any/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "mannschaftsname",
            "any"
    })
    public static class Mannschaft {

        @XmlElement(name = "Mannschaftsname", required = true)
        protected String mannschaftsname;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the mannschaftsname property.
         *
         * @return possible object is
         *         {@link String }
         */
        public String getMannschaftsname() {
            return mannschaftsname;
        }

        /**
         * Sets the value of the mannschaftsname property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMannschaftsname(String value) {
            this.mannschaftsname = value;
        }

        /**
         * Gets the value of the any property.
         *
         * @return possible object is
         *         {@link Object }
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         *
         * @param value allowed object is
         *              {@link Object }
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
