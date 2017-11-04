
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
     * Obtiene el valor de la propiedad jugarResult.
     * 
     */
    public int getJugarResult() {
        return jugarResult;
    }

    /**
     * Define el valor de la propiedad jugarResult.
     * 
     */
    public void setJugarResult(int value) {
        this.jugarResult = value;
    }

}
