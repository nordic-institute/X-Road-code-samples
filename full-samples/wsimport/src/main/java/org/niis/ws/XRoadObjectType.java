
package org.niis.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRoadObjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XRoadObjectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MEMBER"/>
 *     &lt;enumeration value="SUBSYSTEM"/>
 *     &lt;enumeration value="SERVER"/>
 *     &lt;enumeration value="GLOBALGROUP"/>
 *     &lt;enumeration value="LOCALGROUP"/>
 *     &lt;enumeration value="SECURITYCATEGORY"/>
 *     &lt;enumeration value="SERVICE"/>
 *     &lt;enumeration value="CENTRALSERVICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XRoadObjectType")
@XmlEnum
public enum XRoadObjectType {

    MEMBER,
    SUBSYSTEM,
    SERVER,
    GLOBALGROUP,
    LOCALGROUP,
    SECURITYCATEGORY,
    SERVICE,
    CENTRALSERVICE;

    public String value() {
        return name();
    }

    public static XRoadObjectType fromValue(String v) {
        return valueOf(v);
    }

}
