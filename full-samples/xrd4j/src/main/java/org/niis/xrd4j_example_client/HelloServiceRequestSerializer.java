package org.niis.xrd4j_example_client;

import fi.vrk.xrd4j.client.serializer.AbstractServiceRequestSerializer;
import fi.vrk.xrd4j.common.message.ServiceRequest;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;

public class HelloServiceRequestSerializer extends AbstractServiceRequestSerializer {
    @Override
    protected void serializeRequest(ServiceRequest request, SOAPElement soapRequest, SOAPEnvelope envelope) throws SOAPException {
        SOAPElement data = soapRequest.addChildElement(envelope.createName("name"));
        data.addTextNode((String) request.getRequestData());
    }
}
