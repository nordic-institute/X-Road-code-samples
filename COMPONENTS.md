# X-Road Components

## Table of Contents
* [X-Road Portal MISP2](#x-road-portal-misp2)
* [X-Road WSDL validator](#x-road-wsdl-validator)
* [X-Road Personal Data Monitor](#x-road-personal-data-monitor)
* [X-Road Generator (X-tee .NET)](#x-road-generator-x-road-net)
* [J-road](#j-road)
* [REST-Gateway](#rest-gateway)
* [XRd4J](#xrd4j)
* [SAP PI X-Road Adapter](#sap-pi-x-road-adapter)
* [XRDv4WSDLConverter](#xrdv4wsdlconverter)
* [X-Road Adapter Example](#x-road-adapter-example)
* [X-Road Test Service](#x-road-test-service)
* [X-Road Test Client](#x-road-test-client)
* [Qure Data Management Platform](#qure-data-management-platform)


## X-Road Portal MISP2

**Component type**: 
Adapter, functional component, developer tool.

**Description**: 
MISP2 portal can be used for consuming X-Road services both for production environments and testing of services.

**Developer**: 
RIA. (Developed by AKTORS OÜ - https://www.aktors.ee/).

**Contact info**:
Information System Authority Helpdesk, help@ria.ee

**Download location**: 
http://x-road.ee/misp2/

**Documentation**: 
http://x-road.ee/misp2/docs/ (ENG + EST)

Installation manual: http://x-road.ee/misp2/docs/eng/misp2_installation_manual_en.pdf

**Development stage**: 
Up-to-date, last updated 30.12.2015.

**Licence**: 
Unknown.

**Technology used**: 
Java, Orbeon, PostgreSQL.

**Component requirements**: 
Ubuntu Server 14.04 LTS, 64 bit; X-Road v5/v6; Java 6, PostgreSQL 8.4.

## X-Road WSDL validator

**Component type**: 
Functional component, developer tool.

**Description**: 
WSDL validator can be used by developers to validate X-Road service WSDL. Validator is also used by Security Server to validate service WSDL.

**Developer**: 
RIA. (Apache CXF Community; X-Road specific additions by Actors OÜ https://www.aktors.ee/).

**Contact info**:
Information System Authority Helpdesk, help@ria.ee

**Download location**: 
http://x-road.ee/valid/

**Documentation**: 
User guide: http://x-road.ee/valid/X-road_WSDLvalidator_user_guide.pdf 

**Development stage**: 
Up-to-date, last updated 22.01.2016.

**Licence**: 
Apache.

**Technology used**: 
Java, Apache CXF.

**Component requirements**: 
Apache CXF 3.0.1, Linux (Debian), Windows, Java JRE 6+.

## X-Road Personal Data Monitor

**Component type**: 
Functional component.

**Description**: 
Personal Data Monitor can be used to automatically log personal data transfered with X-Road messages or to log personal data usage in information systems. A person can also query his data usage log with a specific X-Road service.

**Developer**: 
RIA. (Developed by Degeetia OÜ).

**Contact info**:
Information System Authority Helpdesk, help@ria.ee

**Download location**: 
https://github.com/e-gov/AJ/releases

**Documentation**: 
https://github.com/e-gov/AJ/blob/master/README.md

**Development stage**: 
In development.

**Licence**: 
MIT.

**Technology used**: 
Java.

**Component requirements**: 
Any Java application server.

## X-Road Generator (X-Road .NET)

**Component type**: 
Developer tool.

**Description**: 
X-Road generator created by the Centre of Registers and Information Systems is meant for software developers who work on information systems that use X-Road services. The solution has been developed to simplify interfacing with X-Road projects on .NET platform and is available to everyone free of charge.

X-Road generator allows to generate a list of data objects used on the basis of a list of services (wsdl) offered by any information system providing X-Road services of the public or private sector, thus making the use of those services notably easier as the developer does not have to try to make sense of the list of services and all the information needed in his work is in a readily usable form.

**Developer**: 
Centre of Registers and Information Systems.

**Contact info**:
+372 680 3160, rik.info@just.ee.

**Download location**: 
http://xtee.codeplex.com/ 

**Documentation**: 
http://www.rik.ee/et/muud-teenused/x-tee-generaator

http://xtee.codeplex.com/documentation 

**Development stage**: 
Up-to-date, last updated 21.04.2015 (v2).

**Licence**: 
Apache License 2.0
http://xtee.codeplex.com/license 

**Technology used**: 
.NET.

**Component requirements**: 
V2.0 supports x-Road version 5 and down, V3.0 x-Road version 6 (olders are not supported). V3 is in development, v2 is up-to-date.

## J-road

**Component type**: 
Developer tool.

**Description**: 
Java library which simplifies the consumption and creation of Estonian X-road services through code generation and protocol implementation.

**Developer**: 
Nortal.

**Contact info**:
Priit Liivak, Priit.Liivak@nortal.com

**Download location**: 
https://github.com/nortal/j-road

**Documentation**: 
https://github.com/nortal/j-road

**Development stage**: 
Up-to-date, last updated 20.04.2016.

**Licence**: 
Apache License 2.0.

**Technology used**: 
Java.

**Component requirements**: 
Spring Framework.

## REST-Gateway

**Component type**: 
Adapter.

**Description**: 
REST Gateway is a component that sits between X-Road Security Server and a REST service. REST Gateway implements X-Road v4.0 SOAP profile and it's compatible with X-Road v6.4 and above. The component makes the integration of REST services to X-Road fast and easy automating REST-SOAP and SOAP-REST conversions.

**Developer**: 
Petteri Kivimäki

**Contact info**:
Petteri Kivimäki, petteri.kivimaki@vrk.fi

**Download location**: 
https://github.com/educloudalliance/xroad-rest-gateway/releases

**Documentation**: 
https://github.com/educloudalliance/xroad-rest-gateway/wiki 

**Development stage**: 
Up-to-date, last updated 30.04.2016.

**Licence**: 
European Union Public Licence V. 1.1
https://github.com/educloudalliance/xroad-rest-gateway/blob/master/LICENSE 

**Technology used**: 
Java.

**Component requirements**: 
The component can be run on Linux / Windows as a standalone JAR (Java 7 or later), Tomcat (Tomcat 7 or later) web app or Docker container. The component is compatible with X-Road v6.4 and later.
See also: https://github.com/educloudalliance/xroad-rest-gateway/wiki/Requirements

## XRd4J

**Component type**: 
Developer tool.

**Description**: 
XRd4J is a Java library for building X-Road v6 Adapter Servers and clients. The library implements X-Road v6 SOAP profile v4.0 and Service Metadata Protocol. The library takes care of serialization and deserialization of SOAP messages: built-in support for standard X-Road SOAP headers, only processing of application specific request and response elements must be implemented.

Modules:

- client : SOAP client that generates X-Road v6 SOAP messages that can be sent to X-Road Security Server. Includes request serializer and response deserializer.
- server : Provides abstract servlet that can be use as a base class for Adapter Server implementation. Includes request deserializer and response serializer.
- common : General purpose utilities for processing SOAP messages and X-Road v6 message data models.
- rest : HTTP clients that can be used for sending requests to web services from Adapter Server.

**Developer**: 
Petteri Kivimäki

**Contact info**:
Petteri Kivimäki, petteri.kivimaki@vrk.fi

**Download location**: 
https://github.com/petkivim/xrd4j/releases

**Documentation**: 
https://github.com/petkivim/xrd4j 

**Development stage**: 
Up-to-date, last updated April 2016.

**Licence**: 
The MIT License (MIT). https://github.com/petkivim/xrd4j/blob/master/LICENSE 

**Technology used**: 
Java.

**Component requirements**: 
Java 7 or later.

## SAP PI X-Road Adapter

**Component type**: 
Adapter.

**Description**: 
A simple software component for converting X-road SOAP requests between X-road security server and SAP XI/PI integration platform.

**Developer**: 
Eesti Haigekassa (developed by Intelsys OÜ).

**Contact info**:
Eesti Haigekassa helpdesk, info@haigekassa.ee

**Download location**: 
Available on request.

**Documentation**: 
Available on request.

**Development stage**: 
In development

**Licence**: 
Open Source (EUPL).

**Technology used**: 
Java.

**Component requirements**: 
Requires Java v1.6 or later, SAP XI/PI (all versions supported). PI database connection is also required (JDBC). Only X-Road v6 SOAP header elements are supported.

## XRDv4WSDLConverter 

**Component type**: 
Developer tool.

**Description**: 
X-road WSDL Converter converts old version 2 and 3 WSDL files into version 4 WSDL.

**Developer**: 
RMIT

**Contact info**:
Alar Saat, alar.saat@rmit.ee

**Download location**: 
https://github.com/alar-saat/XRDv4WSDLConverter 

**Documentation**: 
https://github.com/alar-saat/XRDv4WSDLConverter 

**Development stage**: 
Up-to-date, last updated 30.03.2016.

**Licence**: 
https://github.com/alar-saat/XRDv4WSDLConverter/blob/master/LICENSE.md 

**Technology used**: 
Java.

**Component requirements**: 
Java SDK 8. Supported X-road protocol versions: 2, 3, 4.

## X-Road Adapter Example

**Component type**: 
Adapter.

**Description**: 
X-Road Adapter Example provides an example implementation of a web service that's compatible with X-Road version 6.4 and later. The implementation is based on XRd4J library. The service contains a single class that implements two services:

- getRandom : returns a random number between 1-100
- helloService : returns a hello message with the given name

**Developer**: 
Petteri Kivimäki

**Contact info**:
Petteri Kivimäki, petteri.kivimaki@vrk.fi

**Download location**: 
https://github.com/petkivim/x-road-adapter-example/releases

**Documentation**: 
https://github.com/petkivim/x-road-adapter-example

**Development stage**: 
Up-to-date, last updated 30.04.2016.

**Licence**: 
MIT
https://github.com/petkivim/x-road-adapter-example/blob/master/LICENSE

**Technology used**: 
Java.

**Component requirements**: 
The component can be run on Linux / Windows as a standalone JAR (Java 7 or later), Tomcat (Tomcat 7 or later) web app or Docker container. The component is compatible with X-Road v6.4 and later.

## X-Road Test Service

**Component type**: 
Functional component.

**Description**: 
X-Road Test Service is a testing tool for X-Road v6.4 and above. The implementation is based on XRd4J library. Test Service application provides a single service that takes as parameters the size of the response body and the size of the response attachment part. The size defines the number of characters in the response.

**Developer**: 
Petteri Kivimäki

**Contact info**:
Petteri Kivimäki, petteri.kivimaki@vrk.fi

**Download location**: 
https://github.com/petkivim/x-road-test-service/releases

**Documentation**: 
https://github.com/petkivim/x-road-test-service

**Development stage**: 
Up-to-date, last updated April 2016.

**Licence**: 
MIT
https://github.com/petkivim/x-road-test-service/blob/master/LICENSE

**Technology used**: 
Java.

**Component requirements**: 
The component can be run on Linux / Windows as a standalone JAR (Java 7 or later), Tomcat (Tomcat 7 or later) web app or Docker container. The component is compatible with X-Road v6.4 and later.

## X-Road Test Client

**Component type**: 
Functional component.

**Description**: 
X-Road Test Client is a testing tool and load generator for X-Road v6.4 and above. The implementation is based on XRd4J library.

By default Test Client calls testService service of X-Road Test Service project according to given parameters that include: message body size, message attachment size, response body size, response attachment size, number of client threads, interval between messages, number of messages to be sent per client and maximum run time per client. A random String is used as a payload and the same String is used in all the requests in a single execution. However, unique message ID is automatically generated for each request.

**Developer**: 
Petteri Kivimäki

**Contact info**:
Petteri Kivimäki, petteri.kivimaki@vrk.fi

**Download location**: 
https://github.com/petkivim/x-road-test-client/releases

**Documentation**: 
https://github.com/petkivim/x-road-test-client

**Development stage**: 
Up-to-date, last updated December 2015.

**Licence**: 
MIT
https://github.com/petkivim/x-road-test-client/blob/master/LICENSE

**Technology used**: 
Java.

**Component requirements**: 
The component can be run on Linux / Windows as a standalone JAR (Java 7 or later). The component is compatible with X-Road v6.4 and later.

## Qure Data Management Platform

**Component type:** Functional component.

**Description:** Qure Data Management Platform is a web-based database software for collection, handling, and analysis of data under high quality, security, and robustness requirements. The platform is well suitable for rapid building of registries, biobanks, clinical trials, data management systems, statistical surveys, and other web-based database applications. It has built-in X-Road consumer support, with user interface assisted X-Road security server connection setup. The X-Road queries can be defined and run directly from server side JavaScript. 

**Developer:** Quretec, http://www.quretec.com/#qureplatform

**Contact info:** Margus Jäger, quretec@quretec.com

**Download location:** NA.

**Documentation:** NA.

**Development stage:** In development. 

**Licence:** Commercial.

**Technology used:** Java, JavaScript.

**Component requirements:** WildFly 10, PostgreSQL 9.5+, Linux, Java 8. X-Road version 5 supported, version 6 support is in development.
