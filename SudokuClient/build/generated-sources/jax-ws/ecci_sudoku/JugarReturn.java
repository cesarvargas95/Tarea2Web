
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
 *         &lt;element name="jugarResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "jugarResult"
})
@XmlRootElement(name = "jugarReturn")
public class JugarReturn {

    protected int jugarResult;

    /**
     * Gets the value of the jugarResult property.
     * 
     */
    public int getJugarResult() {
        return jugarResult;
    }

    /**
     * Sets the value of the jugarResult property.
     * 
     */
    public void setJugarResult(int value) {
        this.jugarResult = value;
    }

}
