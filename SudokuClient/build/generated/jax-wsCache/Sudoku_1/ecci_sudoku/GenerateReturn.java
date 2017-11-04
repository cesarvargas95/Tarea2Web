
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
 *         &lt;element name="generateResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "generateResult"
})
@XmlRootElement(name = "generateReturn")
public class GenerateReturn {

    @XmlElement(required = true)
    protected String generateResult;

    /**
     * Obtiene el valor de la propiedad generateResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerateResult() {
        return generateResult;
    }

    /**
     * Define el valor de la propiedad generateResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerateResult(String value) {
        this.generateResult = value;
    }

}
