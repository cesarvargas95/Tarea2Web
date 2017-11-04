
package ecci_sudoku;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="solveResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "solveResult"
})
@XmlRootElement(name = "solveReturn")
public class SolveReturn {

    @XmlElement(required = true)
    protected String solveResult;

    /**
     * Obtiene el valor de la propiedad solveResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolveResult() {
        return solveResult;
    }

    /**
     * Define el valor de la propiedad solveResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolveResult(String value) {
        this.solveResult = value;
    }

}
