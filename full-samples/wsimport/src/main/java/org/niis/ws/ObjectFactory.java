
package org.niis.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.niis.ws package. 
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

    private final static QName _ServiceVersion_QNAME = new QName("http://x-road.eu/xsd/identifiers", "serviceVersion");
    private final static QName _ServerCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "serverCode");
    private final static QName _Id_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "id");
    private final static QName _ProtocolVersion_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "protocolVersion");
    private final static QName _Client_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "client");
    private final static QName _XRoadInstance_QNAME = new QName("http://x-road.eu/xsd/identifiers", "xRoadInstance");
    private final static QName _Service_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "service");
    private final static QName _GroupCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "groupCode");
    private final static QName _SubsystemCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "subsystemCode");
    private final static QName _MemberCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "memberCode");
    private final static QName _UserId_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "userId");
    private final static QName _Version_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "version");
    private final static QName _ServiceCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "serviceCode");
    private final static QName _CentralService_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "centralService");
    private final static QName _GetRandom_QNAME = new QName("http://test.x-road.fi/producer", "getRandom");
    private final static QName _Issue_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "issue");
    private final static QName _MemberClass_QNAME = new QName("http://x-road.eu/xsd/identifiers", "memberClass");
    private final static QName _SecurityCategoryCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "securityCategoryCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.niis.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRandomResponse }
     * 
     */
    public GetRandomResponse createGetRandomResponse() {
        return new GetRandomResponse();
    }

    /**
     * Create an instance of {@link GetRandom }
     * 
     */
    public GetRandom createGetRandom() {
        return new GetRandom();
    }

    /**
     * Create an instance of {@link HelloServiceResponse }
     * 
     */
    public HelloServiceResponse createHelloServiceResponse() {
        return new HelloServiceResponse();
    }

    /**
     * Create an instance of {@link HelloService }
     * 
     */
    public HelloService createHelloService() {
        return new HelloService();
    }

    /**
     * Create an instance of {@link TechNotes }
     * 
     */
    public TechNotes createTechNotes() {
        return new TechNotes();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link XRoadServiceIdentifierType }
     * 
     */
    public XRoadServiceIdentifierType createXRoadServiceIdentifierType() {
        return new XRoadServiceIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadClientIdentifierType }
     * 
     */
    public XRoadClientIdentifierType createXRoadClientIdentifierType() {
        return new XRoadClientIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadCentralServiceIdentifierType }
     * 
     */
    public XRoadCentralServiceIdentifierType createXRoadCentralServiceIdentifierType() {
        return new XRoadCentralServiceIdentifierType();
    }

    /**
     * Create an instance of {@link RequestHash }
     * 
     */
    public RequestHash createRequestHash() {
        return new RequestHash();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link XRoadGlobalGroupIdentifierType }
     * 
     */
    public XRoadGlobalGroupIdentifierType createXRoadGlobalGroupIdentifierType() {
        return new XRoadGlobalGroupIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadLocalGroupIdentifierType }
     * 
     */
    public XRoadLocalGroupIdentifierType createXRoadLocalGroupIdentifierType() {
        return new XRoadLocalGroupIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadIdentifierType }
     * 
     */
    public XRoadIdentifierType createXRoadIdentifierType() {
        return new XRoadIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadSecurityCategoryIdentifierType }
     * 
     */
    public XRoadSecurityCategoryIdentifierType createXRoadSecurityCategoryIdentifierType() {
        return new XRoadSecurityCategoryIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadSecurityServerIdentifierType }
     * 
     */
    public XRoadSecurityServerIdentifierType createXRoadSecurityServerIdentifierType() {
        return new XRoadSecurityServerIdentifierType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "serviceVersion")
    public JAXBElement<String> createServiceVersion(String value) {
        return new JAXBElement<String>(_ServiceVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "serverCode")
    public JAXBElement<String> createServerCode(String value) {
        return new JAXBElement<String>(_ServerCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "protocolVersion")
    public JAXBElement<String> createProtocolVersion(String value) {
        return new JAXBElement<String>(_ProtocolVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XRoadClientIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "client")
    public JAXBElement<XRoadClientIdentifierType> createClient(XRoadClientIdentifierType value) {
        return new JAXBElement<XRoadClientIdentifierType>(_Client_QNAME, XRoadClientIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "xRoadInstance")
    public JAXBElement<String> createXRoadInstance(String value) {
        return new JAXBElement<String>(_XRoadInstance_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XRoadServiceIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "service")
    public JAXBElement<XRoadServiceIdentifierType> createService(XRoadServiceIdentifierType value) {
        return new JAXBElement<XRoadServiceIdentifierType>(_Service_QNAME, XRoadServiceIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "groupCode")
    public JAXBElement<String> createGroupCode(String value) {
        return new JAXBElement<String>(_GroupCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "subsystemCode")
    public JAXBElement<String> createSubsystemCode(String value) {
        return new JAXBElement<String>(_SubsystemCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "memberCode")
    public JAXBElement<String> createMemberCode(String value) {
        return new JAXBElement<String>(_MemberCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "userId")
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "serviceCode")
    public JAXBElement<String> createServiceCode(String value) {
        return new JAXBElement<String>(_ServiceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XRoadCentralServiceIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "centralService")
    public JAXBElement<XRoadCentralServiceIdentifierType> createCentralService(XRoadCentralServiceIdentifierType value) {
        return new JAXBElement<XRoadCentralServiceIdentifierType>(_CentralService_QNAME, XRoadCentralServiceIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRandom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.x-road.fi/producer", name = "getRandom")
    public JAXBElement<GetRandom> createGetRandom(GetRandom value) {
        return new JAXBElement<GetRandom>(_GetRandom_QNAME, GetRandom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "issue")
    public JAXBElement<String> createIssue(String value) {
        return new JAXBElement<String>(_Issue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "memberClass")
    public JAXBElement<String> createMemberClass(String value) {
        return new JAXBElement<String>(_MemberClass_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "securityCategoryCode")
    public JAXBElement<String> createSecurityCategoryCode(String value) {
        return new JAXBElement<String>(_SecurityCategoryCode_QNAME, String.class, null, value);
    }

}
