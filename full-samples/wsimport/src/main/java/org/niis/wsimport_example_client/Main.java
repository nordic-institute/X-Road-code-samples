package org.niis.wsimport_example_client;

import com.sun.xml.ws.api.message.Headers;
import org.niis.ws.TestService;
import org.niis.ws.TestServicePortType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sun.xml.ws.developer.WSBindingProvider;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPFactory;

/**
 * 1. Start Example Adapter service: docker run -p 8080:8080 niis/example-adapter
 * 2. Run: wsimport -keep -p org.niis.ws http://localhost:8080/example-adapter-x.x.x-SNAPSHOT/Endpoint?wsdl -Xnocompile -d src/main/java/
 * 3. Build the project: mvn clean install
 * 4. Run the jar: java -jar target/wsimport-example-client-0.0.1-SNAPSHOT.jar
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            TestService service = new TestService();
            TestServicePortType port = service.getTestServicePort();
            WSBindingProvider bp = (WSBindingProvider) port;

            SOAPFactory factory = SOAPFactory.newInstance();

            SOAPElement clientHeader = factory.createElement(new QName("http://x-road.eu/xsd/xroad.xsd", "client"));
            clientHeader.addNamespaceDeclaration("id", "http://x-road.eu/xsd/identifiers");
            clientHeader.addAttribute(new QName("", "objectType", "id"), "SUBSYSTEM");

            SOAPElement xRoadInstance = clientHeader.addChildElement("xRoadInstance", "id");
            xRoadInstance.addTextNode("NIIS-TEST");

            SOAPElement memberClass = clientHeader.addChildElement("memberClass", "id");
            memberClass.addTextNode("GOV");

            SOAPElement memberCode = clientHeader.addChildElement("memberCode", "id");
            memberCode.addTextNode("1234567-8");

            SOAPElement subsystem = clientHeader.addChildElement("subsystemCode", "id");
            subsystem.addTextNode("TestClient");

            // Service soap header
            SOAPElement serviceHeader = factory.createElement(new QName("http://x-road.eu/xsd/xroad.xsd", "service"));
            serviceHeader.addNamespaceDeclaration("id", "http://x-road.eu/xsd/identifiers");

            serviceHeader.addAttribute(new QName("", "objectType", "id"), "SERVICE");

            xRoadInstance = serviceHeader.addChildElement("xRoadInstance", "id");
            xRoadInstance.addTextNode("NIIS-TEST");

            memberClass = serviceHeader.addChildElement("memberClass", "id");
            memberClass.addTextNode("GOV");

            memberCode = serviceHeader.addChildElement("memberCode", "id");
            memberCode.addTextNode("1234567-8");

            subsystem = serviceHeader.addChildElement("subsystemCode", "id");
            subsystem.addTextNode("DemoService");

            SOAPElement serviceCode = serviceHeader.addChildElement("serviceCode", "id");
            serviceCode.addTextNode("helloService");

            SOAPElement serviceVersion = serviceHeader.addChildElement("serviceVersion", "id");
            serviceVersion.addTextNode("v1");

            bp.setOutboundHeaders(
                Headers.create(clientHeader),
                Headers.create(serviceHeader),
                Headers.create(new QName("http://x-road.eu/xsd/xroad.xsd", "id"), "12345"),
                Headers.create(new QName("http://x-road.eu/xsd/xroad.xsd", "userId"), "jdoe"),
                Headers.create(new QName("http://x-road.eu/xsd/xroad.xsd", "protocolVersion"), "4.0")
            );
            // Call helloService
            logger.info(port.helloService("Test User"));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}
