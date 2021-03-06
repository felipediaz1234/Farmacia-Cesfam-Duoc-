
package servicio;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Funcionario_QNAME = new QName("http://schemas.datacontract.org/2004/07/Capa.Negocio", "Funcionario");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _UsuarioDAO_QNAME = new QName("http://schemas.datacontract.org/2004/07/Capa.Negocio", "UsuarioDAO");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _FuncionarioApPaterno_QNAME = new QName("http://schemas.datacontract.org/2004/07/Capa.Negocio", "Ap_Paterno");
    private final static QName _FuncionarioApMaterno_QNAME = new QName("http://schemas.datacontract.org/2004/07/Capa.Negocio", "Ap_Materno");
    private final static QName _FuncionarioDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Capa.Negocio", "Direccion");
    private final static QName _FuncionarioNombreFuncionario_QNAME = new QName("http://schemas.datacontract.org/2004/07/Capa.Negocio", "Nombre_Funcionario");
    private final static QName _ValidarUsuarioPas_QNAME = new QName("http://tempuri.org/", "pas");
    private final static QName _ValidarUsuarioUsu_QNAME = new QName("http://tempuri.org/", "usu");
    private final static QName _ReadUserResponseReadUserResult_QNAME = new QName("http://tempuri.org/", "ReadUserResult");
    private final static QName _UsuarioDAOPass_QNAME = new QName("http://schemas.datacontract.org/2004/07/Capa.Negocio", "Pass");
    private final static QName _UsuarioDAOUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Capa.Negocio", "User_Name");
    private final static QName _CrearMedicamentoFecVencimiento_QNAME = new QName("http://tempuri.org/", "fec_vencimiento");
    private final static QName _CrearMedicamentoNomGenerico_QNAME = new QName("http://tempuri.org/", "nomGenerico");
    private final static QName _CrearMedicamentoLaboratorio_QNAME = new QName("http://tempuri.org/", "laboratorio");
    private final static QName _CrearMedicamentoNombre_QNAME = new QName("http://tempuri.org/", "nombre");
    private final static QName _CrearFuncionarioPaterno_QNAME = new QName("http://tempuri.org/", "paterno");
    private final static QName _CrearFuncionarioMaterno_QNAME = new QName("http://tempuri.org/", "materno");
    private final static QName _CrearFuncionarioDireccion_QNAME = new QName("http://tempuri.org/", "direccion");
    private final static QName _UpdateUSerResponseUpdateUSerResult_QNAME = new QName("http://tempuri.org/", "UpdateUSerResult");
    private final static QName _CreateUserPass_QNAME = new QName("http://tempuri.org/", "Pass");
    private final static QName _CreateUserUserName_QNAME = new QName("http://tempuri.org/", "userName");
    private final static QName _UpdateMedicamentoNMedicamento_QNAME = new QName("http://tempuri.org/", "nMedicamento");
    private final static QName _UpdateMedicamentoFVencimiento_QNAME = new QName("http://tempuri.org/", "fVencimiento");
    private final static QName _UpdateMedicamentoNGenerico_QNAME = new QName("http://tempuri.org/", "nGenerico");
    private final static QName _ReadFuncionarioResponseReadFuncionarioResult_QNAME = new QName("http://tempuri.org/", "ReadFuncionarioResult");
    private final static QName _CrearReservaMedicamentoResponseCrearReservaMedicamentoResult_QNAME = new QName("http://tempuri.org/", "CrearReservaMedicamentoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearMedicamentoResponse }
     * 
     */
    public CrearMedicamentoResponse createCrearMedicamentoResponse() {
        return new CrearMedicamentoResponse();
    }

    /**
     * Create an instance of {@link UpdateUSerResponse }
     * 
     */
    public UpdateUSerResponse createUpdateUSerResponse() {
        return new UpdateUSerResponse();
    }

    /**
     * Create an instance of {@link ReadUser }
     * 
     */
    public ReadUser createReadUser() {
        return new ReadUser();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link UpdateMedicamento }
     * 
     */
    public UpdateMedicamento createUpdateMedicamento() {
        return new UpdateMedicamento();
    }

    /**
     * Create an instance of {@link DeleteFuncionario }
     * 
     */
    public DeleteFuncionario createDeleteFuncionario() {
        return new DeleteFuncionario();
    }

    /**
     * Create an instance of {@link CrearMedicamento }
     * 
     */
    public CrearMedicamento createCrearMedicamento() {
        return new CrearMedicamento();
    }

    /**
     * Create an instance of {@link ReadFuncionarioResponse }
     * 
     */
    public ReadFuncionarioResponse createReadFuncionarioResponse() {
        return new ReadFuncionarioResponse();
    }

    /**
     * Create an instance of {@link Funcionario }
     * 
     */
    public Funcionario createFuncionario() {
        return new Funcionario();
    }

    /**
     * Create an instance of {@link ValidarUsuarioResponse }
     * 
     */
    public ValidarUsuarioResponse createValidarUsuarioResponse() {
        return new ValidarUsuarioResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link ValidarUsuario }
     * 
     */
    public ValidarUsuario createValidarUsuario() {
        return new ValidarUsuario();
    }

    /**
     * Create an instance of {@link CrearFuncionario }
     * 
     */
    public CrearFuncionario createCrearFuncionario() {
        return new CrearFuncionario();
    }

    /**
     * Create an instance of {@link ReadFuncionario }
     * 
     */
    public ReadFuncionario createReadFuncionario() {
        return new ReadFuncionario();
    }

    /**
     * Create an instance of {@link UpdateUSer }
     * 
     */
    public UpdateUSer createUpdateUSer() {
        return new UpdateUSer();
    }

    /**
     * Create an instance of {@link CrearReservaMedicamentoResponse }
     * 
     */
    public CrearReservaMedicamentoResponse createCrearReservaMedicamentoResponse() {
        return new CrearReservaMedicamentoResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link UpdateMedicamentoResponse }
     * 
     */
    public UpdateMedicamentoResponse createUpdateMedicamentoResponse() {
        return new UpdateMedicamentoResponse();
    }

    /**
     * Create an instance of {@link ReadUserResponse }
     * 
     */
    public ReadUserResponse createReadUserResponse() {
        return new ReadUserResponse();
    }

    /**
     * Create an instance of {@link UsuarioDAO }
     * 
     */
    public UsuarioDAO createUsuarioDAO() {
        return new UsuarioDAO();
    }

    /**
     * Create an instance of {@link DeleteFuncionarioResponse }
     * 
     */
    public DeleteFuncionarioResponse createDeleteFuncionarioResponse() {
        return new DeleteFuncionarioResponse();
    }

    /**
     * Create an instance of {@link CrearFuncionarioResponse }
     * 
     */
    public CrearFuncionarioResponse createCrearFuncionarioResponse() {
        return new CrearFuncionarioResponse();
    }

    /**
     * Create an instance of {@link CrearReservaMedicamento }
     * 
     */
    public CrearReservaMedicamento createCrearReservaMedicamento() {
        return new CrearReservaMedicamento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Funcionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", name = "Funcionario")
    public JAXBElement<Funcionario> createFuncionario(Funcionario value) {
        return new JAXBElement<Funcionario>(_Funcionario_QNAME, Funcionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioDAO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", name = "UsuarioDAO")
    public JAXBElement<UsuarioDAO> createUsuarioDAO(UsuarioDAO value) {
        return new JAXBElement<UsuarioDAO>(_UsuarioDAO_QNAME, UsuarioDAO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", name = "Ap_Paterno", scope = Funcionario.class)
    public JAXBElement<String> createFuncionarioApPaterno(String value) {
        return new JAXBElement<String>(_FuncionarioApPaterno_QNAME, String.class, Funcionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", name = "Ap_Materno", scope = Funcionario.class)
    public JAXBElement<String> createFuncionarioApMaterno(String value) {
        return new JAXBElement<String>(_FuncionarioApMaterno_QNAME, String.class, Funcionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", name = "Direccion", scope = Funcionario.class)
    public JAXBElement<String> createFuncionarioDireccion(String value) {
        return new JAXBElement<String>(_FuncionarioDireccion_QNAME, String.class, Funcionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", name = "Nombre_Funcionario", scope = Funcionario.class)
    public JAXBElement<String> createFuncionarioNombreFuncionario(String value) {
        return new JAXBElement<String>(_FuncionarioNombreFuncionario_QNAME, String.class, Funcionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pas", scope = ValidarUsuario.class)
    public JAXBElement<String> createValidarUsuarioPas(String value) {
        return new JAXBElement<String>(_ValidarUsuarioPas_QNAME, String.class, ValidarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usu", scope = ValidarUsuario.class)
    public JAXBElement<String> createValidarUsuarioUsu(String value) {
        return new JAXBElement<String>(_ValidarUsuarioUsu_QNAME, String.class, ValidarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioDAO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReadUserResult", scope = ReadUserResponse.class)
    public JAXBElement<UsuarioDAO> createReadUserResponseReadUserResult(UsuarioDAO value) {
        return new JAXBElement<UsuarioDAO>(_ReadUserResponseReadUserResult_QNAME, UsuarioDAO.class, ReadUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", name = "Pass", scope = UsuarioDAO.class)
    public JAXBElement<String> createUsuarioDAOPass(String value) {
        return new JAXBElement<String>(_UsuarioDAOPass_QNAME, String.class, UsuarioDAO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Capa.Negocio", name = "User_Name", scope = UsuarioDAO.class)
    public JAXBElement<String> createUsuarioDAOUserName(String value) {
        return new JAXBElement<String>(_UsuarioDAOUserName_QNAME, String.class, UsuarioDAO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fec_vencimiento", scope = CrearMedicamento.class)
    public JAXBElement<String> createCrearMedicamentoFecVencimiento(String value) {
        return new JAXBElement<String>(_CrearMedicamentoFecVencimiento_QNAME, String.class, CrearMedicamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nomGenerico", scope = CrearMedicamento.class)
    public JAXBElement<String> createCrearMedicamentoNomGenerico(String value) {
        return new JAXBElement<String>(_CrearMedicamentoNomGenerico_QNAME, String.class, CrearMedicamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "laboratorio", scope = CrearMedicamento.class)
    public JAXBElement<String> createCrearMedicamentoLaboratorio(String value) {
        return new JAXBElement<String>(_CrearMedicamentoLaboratorio_QNAME, String.class, CrearMedicamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = CrearMedicamento.class)
    public JAXBElement<String> createCrearMedicamentoNombre(String value) {
        return new JAXBElement<String>(_CrearMedicamentoNombre_QNAME, String.class, CrearMedicamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paterno", scope = CrearFuncionario.class)
    public JAXBElement<String> createCrearFuncionarioPaterno(String value) {
        return new JAXBElement<String>(_CrearFuncionarioPaterno_QNAME, String.class, CrearFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "materno", scope = CrearFuncionario.class)
    public JAXBElement<String> createCrearFuncionarioMaterno(String value) {
        return new JAXBElement<String>(_CrearFuncionarioMaterno_QNAME, String.class, CrearFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "direccion", scope = CrearFuncionario.class)
    public JAXBElement<String> createCrearFuncionarioDireccion(String value) {
        return new JAXBElement<String>(_CrearFuncionarioDireccion_QNAME, String.class, CrearFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = CrearFuncionario.class)
    public JAXBElement<String> createCrearFuncionarioNombre(String value) {
        return new JAXBElement<String>(_CrearMedicamentoNombre_QNAME, String.class, CrearFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateUSerResult", scope = UpdateUSerResponse.class)
    public JAXBElement<String> createUpdateUSerResponseUpdateUSerResult(String value) {
        return new JAXBElement<String>(_UpdateUSerResponseUpdateUSerResult_QNAME, String.class, UpdateUSerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pass", scope = CreateUser.class)
    public JAXBElement<String> createCreateUserPass(String value) {
        return new JAXBElement<String>(_CreateUserPass_QNAME, String.class, CreateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userName", scope = CreateUser.class)
    public JAXBElement<String> createCreateUserUserName(String value) {
        return new JAXBElement<String>(_CreateUserUserName_QNAME, String.class, CreateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nMedicamento", scope = UpdateMedicamento.class)
    public JAXBElement<String> createUpdateMedicamentoNMedicamento(String value) {
        return new JAXBElement<String>(_UpdateMedicamentoNMedicamento_QNAME, String.class, UpdateMedicamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "laboratorio", scope = UpdateMedicamento.class)
    public JAXBElement<String> createUpdateMedicamentoLaboratorio(String value) {
        return new JAXBElement<String>(_CrearMedicamentoLaboratorio_QNAME, String.class, UpdateMedicamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fVencimiento", scope = UpdateMedicamento.class)
    public JAXBElement<String> createUpdateMedicamentoFVencimiento(String value) {
        return new JAXBElement<String>(_UpdateMedicamentoFVencimiento_QNAME, String.class, UpdateMedicamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nGenerico", scope = UpdateMedicamento.class)
    public JAXBElement<String> createUpdateMedicamentoNGenerico(String value) {
        return new JAXBElement<String>(_UpdateMedicamentoNGenerico_QNAME, String.class, UpdateMedicamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Funcionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReadFuncionarioResult", scope = ReadFuncionarioResponse.class)
    public JAXBElement<Funcionario> createReadFuncionarioResponseReadFuncionarioResult(Funcionario value) {
        return new JAXBElement<Funcionario>(_ReadFuncionarioResponseReadFuncionarioResult_QNAME, Funcionario.class, ReadFuncionarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pass", scope = UpdateUSer.class)
    public JAXBElement<String> createUpdateUSerPass(String value) {
        return new JAXBElement<String>(_CreateUserPass_QNAME, String.class, UpdateUSer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userName", scope = UpdateUSer.class)
    public JAXBElement<String> createUpdateUSerUserName(String value) {
        return new JAXBElement<String>(_CreateUserUserName_QNAME, String.class, UpdateUSer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CrearReservaMedicamentoResult", scope = CrearReservaMedicamentoResponse.class)
    public JAXBElement<String> createCrearReservaMedicamentoResponseCrearReservaMedicamentoResult(String value) {
        return new JAXBElement<String>(_CrearReservaMedicamentoResponseCrearReservaMedicamentoResult_QNAME, String.class, CrearReservaMedicamentoResponse.class, value);
    }

}
