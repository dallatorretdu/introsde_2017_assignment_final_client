
package introsde.client.naturalturist.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suggestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="suggestedItems" type="{http://soap.orchestrator.APP4.introsde/}suggestedItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suggestion", propOrder = {
    "suggestedItems",
    "message"
})
public class Suggestion {

    @XmlElement(nillable = true)
    protected List<SuggestedItem> suggestedItems;
    protected String message;

    /**
     * Gets the value of the suggestedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuggestedItem }
     * 
     * 
     */
    public List<SuggestedItem> getSuggestedItems() {
        if (suggestedItems == null) {
            suggestedItems = new ArrayList<SuggestedItem>();
        }
        return this.suggestedItems;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
