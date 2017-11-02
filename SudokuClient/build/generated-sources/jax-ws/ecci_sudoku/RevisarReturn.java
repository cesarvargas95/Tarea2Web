
package ecci_sudoku;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="revisarResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "revisarResult"
})
@XmlRootElement(name = "revisarReturn")
public class RevisarReturn {

    protected boolean revisarResult;

    /**
     * Gets the value of the revisarResult property.
     * 
     */
    public boolean isRevisarResult() {
        return revisarResult;
    }

    /**
     * Sets the value of the revisarResult property.
     * 
     */
    public void setRevisarResult(boolean value) {
        this.revisarResult = value;
    }

}
