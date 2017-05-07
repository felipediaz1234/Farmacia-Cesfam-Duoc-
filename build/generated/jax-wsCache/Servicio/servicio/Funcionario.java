
package servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Funcionario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Funcionario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ap_Materno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ap_Paterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cod_Funcionario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre_Funcionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Funcionario", namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", propOrder = {
    "apMaterno",
    "apPaterno",
    "codFuncionario",
    "direccion",
    "nombreFuncionario",
    "telefono"
})
public class Funcionario {

    @XmlElementRef(name = "Ap_Materno", namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apMaterno;
    @XmlElementRef(name = "Ap_Paterno", namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apPaterno;
    @XmlElement(name = "Cod_Funcionario")
    protected Integer codFuncionario;
    @XmlElementRef(name = "Direccion", namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccion;
    @XmlElementRef(name = "Nombre_Funcionario", namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreFuncionario;
    @XmlElement(name = "Telefono")
    protected Integer telefono;

    /**
     * Obtiene el valor de la propiedad apMaterno.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApMaterno() {
        return apMaterno;
    }

    /**
     * Define el valor de la propiedad apMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApMaterno(JAXBElement<String> value) {
        this.apMaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad apPaterno.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApPaterno() {
        return apPaterno;
    }

    /**
     * Define el valor de la propiedad apPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApPaterno(JAXBElement<String> value) {
        this.apPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad codFuncionario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    /**
     * Define el valor de la propiedad codFuncionario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodFuncionario(Integer value) {
        this.codFuncionario = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccion(JAXBElement<String> value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreFuncionario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreFuncionario() {
        return nombreFuncionario;
    }

    /**
     * Define el valor de la propiedad nombreFuncionario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreFuncionario(JAXBElement<String> value) {
        this.nombreFuncionario = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTelefono(Integer value) {
        this.telefono = value;
    }

}
