
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cheque complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cheque">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chequeCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="chequePaid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="order" type="{http://check_payment/}order" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cheque", propOrder = {
    "chequeCost",
    "chequePaid",
    "order"
})
public class Cheque {

    protected double chequeCost;
    protected boolean chequePaid;
    protected Order order;

    /**
     * Gets the value of the chequeCost property.
     * 
     */
    public double getChequeCost() {
        return chequeCost;
    }

    /**
     * Sets the value of the chequeCost property.
     * 
     */
    public void setChequeCost(double value) {
        this.chequeCost = value;
    }

    /**
     * Gets the value of the chequePaid property.
     * 
     */
    public boolean isChequePaid() {
        return chequePaid;
    }

    /**
     * Sets the value of the chequePaid property.
     * 
     */
    public void setChequePaid(boolean value) {
        this.chequePaid = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
    }

}
