
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
 *         &lt;element name="isPuntuacionResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isPuntuacionResult"
})
@XmlRootElement(name = "isPuntuacionReturn")
public class IsPuntuacionReturn {

    protected boolean isPuntuacionResult;

    /**
     * Gets the value of the isPuntuacionResult property.
     * 
     */
    public boolean isIsPuntuacionResult() {
        return isPuntuacionResult;
    }

    /**
     * Sets the value of the isPuntuacionResult property.
     * 
     */
    public void setIsPuntuacionResult(boolean value) {
        this.isPuntuacionResult = value;
    }

}
