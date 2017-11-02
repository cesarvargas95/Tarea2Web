
package ecci_sudoku;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
     * Gets the value of the fila property.
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
     * Sets the value of the fila property.
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
     * Gets the value of the columna property.
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
     * Sets the value of the columna property.
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
     * Gets the value of the num property.
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
     * Sets the value of the num property.
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
