package org.niis.jaxws_example_client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;
import javax.xml.soap.*;
import javax.xml.ws.Dispatch;
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            QName SERVICE_NAME = new QName("http://test.x-road.fi/producer", "testService");
            QName SERVICE_PORT = new QName("http://test.x-road.fi/producer", "testServicePort");

            String url = "http://localhost:8080/example-adapter-x.x.x-SNAPSHOT/Endpoint?wsdl";

            // Create a service and add at least one port to it.
            Service service = Service.create(SERVICE_NAME);
            service.addPort(SERVICE_PORT, SOAPBinding.SOAP11HTTP_BINDING, url);

            // Create a Dispatch instance from a service.
            Dispatch<SOAPMessage> dispatch = service.createDispatch(SERVICE_PORT, SOAPMessage.class, Service.Mode.MESSAGE);

            // Create SOAPMessage request. **/
            MessageFactory mf = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);

            // Create a message.  This example works with the SOAPPart.
            SOAPMessage request = mf.createMessage();
            SOAPPart part = request.getSOAPPart();

            // Obtain the SOAPEnvelope and header and body elements.
            SOAPEnvelope env = part.getEnvelope();
            SOAPHeader header = env.getHeader();
            SOAPBody body = env.getBody();

            env.addNamespaceDeclaration("id", "http://x-road.eu/xsd/identifiers");
            env.addNamespaceDeclaration("xrd", "http://x-road.eu/xsd/xroad.xsd");

            // Start by defining client soap header
            SOAPElement clientHeader = header.addChildElement("client", "xrd");
            clientHeader.addAttribute(env.createQName("objectType", "id"), "SUBSYSTEM");

            SOAPElement xRoadInstance = clientHeader.addChildElement("xRoadInstance", "id");
            xRoadInstance.addTextNode("NIIS-TEST");

            SOAPElement memberClass = clientHeader.addChildElement("memberClass", "id");
            memberClass.addTextNode("GOV");

            SOAPElement memberCode = clientHeader.addChildElement("memberCode", "id");
            memberCode.addTextNode("1234567-8");

            SOAPElement subsystem = clientHeader.addChildElement("subsystemCode", "id");
            subsystem.addTextNode("TestClient");


            // Service soap header
            SOAPElement serviceHeader = header.addChildElement("service", "xrd");
            serviceHeader.addAttribute(env.createQName("objectType", "id"), "SERVICE");

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

            // Rest of the header elements
            SOAPElement id = header.addChildElement("id", "xrd");
            id.addTextNode("12345");

            SOAPElement userId = header.addChildElement("userId", "xrd");
            userId.addTextNode("jdoe");

            SOAPElement protocolVersion = header.addChildElement("protocolVersion", "xrd");
            protocolVersion.addTextNode("4.0");

            // Construct the message payload.
            SOAPElement operation = body.addChildElement("helloService", "ns1", "http://test.x-road.fi/producer");
            SOAPElement value = operation.addChildElement("name");
            value.addTextNode("Test User");
            request.saveChanges();

            // Invoke the service endpoint.
            SOAPMessage response = dispatch.invoke(request);

            // Get response: Body -> helloServiceResponse -> message -> <response>
            logger.info("{}",response.getSOAPBody().getChildNodes().item(0).getChildNodes().item(0).getTextContent());

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}
