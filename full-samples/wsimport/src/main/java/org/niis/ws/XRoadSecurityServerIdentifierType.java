
package org.niis.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRoadSecurityServerIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRoadSecurityServerIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://x-road.eu/xsd/identifiers}XRoadIdentifierType">
 *       &lt;sequence>
 *         &lt;element ref="{http://x-road.eu/xsd/identifiers}xRoadInstance"/>
 *         &lt;element ref="{http://x-road.eu/xsd/identifiers}memberClass"/>
 *         &lt;element ref="{http://x-road.eu/xsd/identifiers}memberCode"/>
 *         &lt;element ref="{http://x-road.eu/xsd/identifiers}serverCode"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://x-road.eu/xsd/identifiers}objectType use="required" fixed="SERVER""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRoadSecurityServerIdentifierType")
public class XRoadSecurityServerIdentifierType
    extends XRoadIdentifierType
{


}
