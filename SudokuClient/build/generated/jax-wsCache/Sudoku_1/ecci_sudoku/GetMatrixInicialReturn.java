
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
 *         &lt;element name="getMatrixInicialResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "getMatrixInicialResult"
})
@XmlRootElement(name = "getMatrixInicialReturn")
public class GetMatrixInicialReturn {

    @XmlElement(required = true)
    protected String getMatrixInicialResult;

    /**
     * Obtiene el valor de la propiedad getMatrixInicialResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetMatrixInicialResult() {
        return getMatrixInicialResult;
    }

    /**
     * Define el valor de la propiedad getMatrixInicialResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetMatrixInicialResult(String value) {
        this.getMatrixInicialResult = value;
    }

}
