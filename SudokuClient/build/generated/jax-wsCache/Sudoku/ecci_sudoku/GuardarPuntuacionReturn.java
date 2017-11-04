
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
 *         &lt;element name="guardarPuntuacionResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "guardarPuntuacionResult"
})
@XmlRootElement(name = "guardarPuntuacionReturn")
public class GuardarPuntuacionReturn {

    protected boolean guardarPuntuacionResult;

    /**
     * Gets the value of the guardarPuntuacionResult property.
     * 
     */
    public boolean isGuardarPuntuacionResult() {
        return guardarPuntuacionResult;
    }

    /**
     * Sets the value of the guardarPuntuacionResult property.
     * 
     */
    public void setGuardarPuntuacionResult(boolean value) {
        this.guardarPuntuacionResult = value;
    }

}
