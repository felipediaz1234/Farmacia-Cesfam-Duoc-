
package servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="ReadUserResult" type="{http://schemas.datacontract.org/2004/07/Capa.Negocio}UsuarioDAO" minOccurs="0"/>
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
    "readUserResult"
})
@XmlRootElement(name = "ReadUserResponse")
public class ReadUserResponse {

    @XmlElementRef(name = "ReadUserResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<UsuarioDAO> readUserResult;

    /**
     * Obtiene el valor de la propiedad readUserResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UsuarioDAO }{@code >}
     *     
     */
    public JAXBElement<UsuarioDAO> getReadUserResult() {
        return readUserResult;
    }

    /**
     * Define el valor de la propiedad readUserResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UsuarioDAO }{@code >}
     *     
     */
    public void setReadUserResult(JAXBElement<UsuarioDAO> value) {
        this.readUserResult = value;
    }

}
