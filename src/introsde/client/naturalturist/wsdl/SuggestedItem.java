
package introsde.client.naturalturist.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suggestedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suggestedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="park" type="{http://soap.parks.APP1.introsde/}park" minOccurs="0"/>
 *         &lt;element name="shed" type="{http://soap.sheds.APP2.introsde/}shed" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suggestedItem", propOrder = {
    "park",
    "shed",
    "reason"
})
public class SuggestedItem {

    protected Park park;
    protected Shed shed;
    protected String reason;

    /**
     * Gets the value of the park property.
     * 
     * @return
     *     possible object is
     *     {@link Park }
     *     
     */
    public Park getPark() {
        return park;
    }

    /**
     * Sets the value of the park property.
     * 
     * @param value
     *     allowed object is
     *     {@link Park }
     *     
     */
    public void setPark(Park value) {
        this.park = value;
    }

    /**
     * Gets the value of the shed property.
     * 
     * @return
     *     possible object is
     *     {@link Shed }
     *     
     */
    public Shed getShed() {
        return shed;
    }

    /**
     * Sets the value of the shed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shed }
     *     
     */
    public void setShed(Shed value) {
        this.shed = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
