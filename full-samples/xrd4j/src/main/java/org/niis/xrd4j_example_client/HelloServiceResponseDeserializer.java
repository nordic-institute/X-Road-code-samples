package org.niis.xrd4j_example_client;

import fi.vrk.xrd4j.client.deserializer.AbstractResponseDeserializer;

import javax.xml.soap.Node;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

public class HelloServiceResponseDeserializer extends AbstractResponseDeserializer<String, String> {
    @Override
    protected String deserializeRequestData(Node requestNode) throws SOAPException {
        for (int i = 0; i < requestNode.getChildNodes().getLength(); i++) {
            if (requestNode.getChildNodes().item(i).getLocalName().equals("name")) {
                return requestNode.getChildNodes().item(i).getTextContent();
            }
        }
        return null;
    }

    @Override
    protected String deserializeResponseData(Node responseNode, SOAPMessage message) throws SOAPException {
        for (int i = 0; i < responseNode.getChildNodes().getLength(); i++) {
            if (responseNode.getChildNodes().item(i).getLocalName().equals("message")) {
                return responseNode.getChildNodes().item(i).getTextContent();
            }
        }
        return null;
    }
}
