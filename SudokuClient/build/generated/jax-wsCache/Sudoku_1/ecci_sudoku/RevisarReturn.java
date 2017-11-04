
package ecci_sudoku;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad revisarResult.
     * 
     */
    public boolean isRevisarResult() {
        return revisarResult;
    }

    /**
     * Define el valor de la propiedad revisarResult.
     * 
     */
    public void setRevisarResult(boolean value) {
        this.revisarResult = value;
    }

}
