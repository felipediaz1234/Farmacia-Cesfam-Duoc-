
package servicio;

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
 *         &lt;element name="cod_Reserva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cod_Funcionario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cod_Paciente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cod_Medicamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cant" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "codReserva",
    "codFuncionario",
    "codPaciente",
    "codMedicamento",
    "cant"
})
@XmlRootElement(name = "CrearReservaMedicamento")
public class CrearReservaMedicamento {

    @XmlElement(name = "cod_Reserva")
    protected Integer codReserva;
    @XmlElement(name = "cod_Funcionario")
    protected Integer codFuncionario;
    @XmlElement(name = "cod_Paciente")
    protected Integer codPaciente;
    @XmlElement(name = "cod_Medicamento")
    protected Integer codMedicamento;
    protected Integer cant;

    /**
     * Obtiene el valor de la propiedad codReserva.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodReserva() {
        return codReserva;
    }

    /**
     * Define el valor de la propiedad codReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodReserva(Integer value) {
        this.codReserva = value;
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
     * Obtiene el valor de la propiedad codPaciente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodPaciente() {
        return codPaciente;
    }

    /**
     * Define el valor de la propiedad codPaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodPaciente(Integer value) {
        this.codPaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad codMedicamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMedicamento() {
        return codMedicamento;
    }

    /**
     * Define el valor de la propiedad codMedicamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMedicamento(Integer value) {
        this.codMedicamento = value;
    }

    /**
     * Obtiene el valor de la propiedad cant.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCant() {
        return cant;
    }

    /**
     * Define el valor de la propiedad cant.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCant(Integer value) {
        this.cant = value;
    }

}
