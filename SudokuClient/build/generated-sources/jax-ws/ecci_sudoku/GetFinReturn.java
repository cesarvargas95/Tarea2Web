
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
 *         &lt;element name="getFinResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getFinResult"
})
@XmlRootElement(name = "getFinReturn")
public class GetFinReturn {

    protected int getFinResult;

    /**
     * Gets the value of the getFinResult property.
     * 
     */
    public int getGetFinResult() {
        return getFinResult;
    }

    /**
     * Sets the value of the getFinResult property.
     * 
     */
    public void setGetFinResult(int value) {
        this.getFinResult = value;
    }

}
