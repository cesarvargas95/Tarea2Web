
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
 *         &lt;element name="fila" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="columna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "fila",
    "columna",
    "num"
})
@XmlRootElement(name = "jugar")
public class Jugar {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer fila;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer columna;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer num;

    /**
     * Obtiene el valor de la propiedad fila.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFila() {
        return fila;
    }

    /**
     * Define el valor de la propiedad fila.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFila(Integer value) {
        this.fila = value;
    }

    /**
     * Obtiene el valor de la propiedad columna.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColumna() {
        return columna;
    }

    /**
     * Define el valor de la propiedad columna.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColumna(Integer value) {
        this.columna = value;
    }

    /**
     * Obtiene el valor de la propiedad num.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNum() {
        return num;
    }

    /**
     * Define el valor de la propiedad num.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNum(Integer value) {
        this.num = value;
    }

}
