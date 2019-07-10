![European Regional Development Fund](img/EU.png "European Regional Development Fund - DO NOT REMOVE THIS IMAGE BEFORE 01.06.2022")

# X-Road Components

This page contains a list of reusable X-Road components implemented by the
X-Road community. If you know a tool that should be in this list you can make a
pull request or send the component info to the NIIS by email (community at niis.org).
Before adding new components to the list please take a look at the [Component Description Guidelines](COMPONENT_DESCRIPTION_GUIDELINES.md).

## Table of Contents
* [X-Road Portal MISP2](#x-road-portal-misp2)
* [X-Road Personal Data Monitor](#x-road-personal-data-monitor)
* [X-Road Generator (X-tee .NET)](#x-road-generator-x-road-net)
* [J-road](#j-road)
* [REST Adapter Service](#rest-adapter-service)
* [XRd4J](#xrd4j)
* [SAP PI X-Road Adapter](#sap-pi-x-road-adapter)
* [XRDv4WSDLConverter](#xrdv4wsdlconverter)
* [X-Road Adapter Example](#x-road-adapter-example)
* [X-Road Test Service](#x-road-test-service)
* [X-Road Test Client](#x-road-test-client)
* [Qure Data Management Platform](#qure-data-management-platform)
* [X-Road File Service](#x-road-file-service)
* [X-Road E2E Client](#x-road-e2e-client)
* [XRdE2E](#xrde2e)
* [API Catalog](#api-catalog)
* [X-Road v6 Global Configuration Parser](#x-road-v6-global-configuration-parser)
* [Systemd for X-Road v6 on Ubuntu 16.04](#systemd-for-x-road-v6-on-ubuntu-1604)
* [Security Server Log Archiver](#security-server-log-archiver)
* [X-Road Type Providers (XRoadProvider/.NET)](#x-road-type-providers-xroadprovidernet)
* [X-Road Simple Stats Collector](#x-road-simple-stats-collector)
* [XRoadLib](#xroadlib)

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
https://x-tee.ee/packages/live/misp2/

**Documentation**:
https://x-tee.ee/docs/live/misp2/ (ENG + EST)

**Development stage**:
Up-to-date, last updated 10.07.2019.

**Licence**:
Unknown.

**Technology used**:
Java, Orbeon, PostgreSQL.

**Component requirements**:
Ubuntu Server 14.04 LTS, 64 bit; X-Road v5/v6; Java 6, PostgreSQL 8.4.

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
Up-to-date, last updated 01/2018.

**Licence**:
Apache License 2.0.

**Technology used**:
Java.

**Component requirements**:
Spring Framework.

## REST Adapter Service

**Component type**:
Adapter.

**Description**:
REST Adapter Service is a component that sits between X-Road Security Server and a REST service. REST Adapter Service implements X-Road v4.0 SOAP profile and it's compatible with X-Road v6.4 and above. The component makes the integration of REST services to X-Road fast and easy automating REST-SOAP and SOAP-REST conversions.

**Developer**:
Nordic Institute for Interoperability Solutions (NIIS)

**Contact info**:
info@niis.org

**Download location**:
https://github.com/nordic-institute/REST-adapter-service

**Documentation**:
https://github.com/nordic-institute/REST-adapter-service/tree/master/documentation

**Development stage**:
Up-to-date, last updated 07/2018.

**Licence**:
The MIT License (MIT). https://github.com/nordic-institute/REST-adapter-service/blob/master/LICENSE

**Technology used**:
Java.

**Component requirements**:
The component can be run on Linux / Windows as a standalone JAR (Java 7 or later), Tomcat (Tomcat 7 or later) web app or Docker container. The component is compatible with X-Road v6.4 and later.

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
Nordic Institute for Interoperability Solutions (NIIS)

**Contact info**:
info@niis.org

**Download location**:
https://github.com/nordic-institute/xrd4j/

**Documentation**:
https://github.com/nordic-institute/xrd4j/

**Development stage**:
Up-to-date, last updated 07/2018.

**Licence**:
The MIT License (MIT). https://github.com/nordic-institute/xrd4j/blob/master/LICENSE

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
Up-to-date, last updated 08/2016.

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
Nordic Institute for Interoperability Solutions (NIIS)

**Contact info**:
info@niis.org

**Download location**:
https://github.com/nordic-institute/xrd4j/tree/master/example-adapter

**Documentation**:
https://github.com/nordic-institute/xrd4j/tree/master/example-adapter

**Development stage**:
Up-to-date, last updated 07/2018.

**Licence**:
The MIT License (MIT). https://github.com/nordic-institute/xrd4j/blob/master/LICENSE

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
Nordic Institute for Interoperability Solutions (NIIS)

**Contact info**:
info@niis.org

**Download location**:
https://github.com/nordic-institute/x-road-test-service

**Documentation**:
https://github.com/nordic-institute/x-road-test-service

**Development stage**:
Up-to-date, last updated 09/2018.

**Licence**:
MIT
https://github.com/nordic-institute/x-road-test-service/blob/master/LICENSE

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

**Download location**:
https://github.com/petkivim/x-road-test-client/releases

**Documentation**:
https://github.com/petkivim/x-road-test-client

**Development stage**:
Up-to-date, last updated 06/2017.

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

## X-Road File Service

**Component type**:
Adapter.

**Description**:
X-Road File Service is a sample web service for transferring files over X-Road. Currently supports only serving files. The file contents are returned using MTOM.

**Developer**:
Finnish Population Register Centre (VRK)

**Contact info**:


**Download location**:
https://github.com/vrk-kpa/xroad-fileservice

**Documentation**:
https://github.com/vrk-kpa/xroad-fileservice

**Development stage**:
Up-to-date, last updated 01/2018.

**Licence**:
The MIT License (MIT). https://github.com/vrk-kpa/xroad-fileservice/blob/master/LICENSE

**Technology used**:
Java.

**Component requirements**:
Requires JDK 8 to build and JRE 8 to run.

## X-Road E2E Client

**Component type**:
Functional.

**Description**:
Simple monitoring client for X-Road security server. Calls getRandom and helloService tests services though a security server and reports failures by email.

**Developer**:
Finnish Population Register Centre (VRK)

**Contact info**:


**Download location**:
https://github.com/vrk-kpa/xroad-e2e-client

**Documentation**:
https://github.com/vrk-kpa/xroad-e2e-client

**Development stage**:
Up-to-date, last updated 07/2016.

**Licence**:
The MIT License (MIT). https://github.com/vrk-kpa/xroad-e2e-client/blob/master/LICENSE

**Technology used**:
Perl.

**Component requirements**:
More information about the requirements: https://github.com/vrk-kpa/xroad-e2e-client#requirements

## XRdE2E

**Component type**:
Functional.

**Description**:
XRdE2E is an end-to-end monitoring tool for X-Road security servers. Monitoring of the security servers is done using the listMethods meta service. If security server sends a valid response, it means that proxy and signer components are both working fine.

**Developer**:
Petteri Kivimäki

**Contact info**:


**Download location**:
https://github.com/petkivim/xrde2e

**Documentation**:
https://github.com/petkivim/xrde2e

**Development stage**:
Up-to-date, last updated 02/2017.

**Licence**:
The MIT License (MIT). https://github.com/petkivim/xrde2e/blob/master/LICENSE

**Technology used**:
Java, AngularJS, MongoDB, Docker.

**Component requirements**:
Requires JDK 8 to build, and JRE 8 or Docker to run.

## API Catalog

**Component type**:
Functional.

**Description**:
API Catalog is a web portal that provides a search engine for the interfaces available on X-Road. In addition, API Catalog provides metadata about each interface in a human readable format. API Catalog is used by the Finnish National Data Exchange Layer (Suomi.fi palveluväylä) that is based on X-Road. The service is accessible at https://liityntakatalogi.suomi.fi/en_GB/.

**Developer**:
Finnish Population Register Centre (VRK)

**Contact info**:


**Download location**:
https://github.com/vrk-kpa/api-catalog

**Documentation**:
https://github.com/vrk-kpa/api-catalog

**Development stage**:
Up-to-date, last updated 03/2018.

**Licence**:
The MIT License (MIT). https://github.com/vrk-kpa/api-catalog/blob/master/LICENSE

**Technology used**:
Perl.

**Component requirements**:
Vagrant (tested on 1.8.4), VirtualBox (tested on 5.0.20).

## X-Road v6 Global Configuration Parser

**Component type**:
Functional.

**Description**:
PHP/AJAX snippet that parses X-Road version 6 global configuration and returns information about the Security Server of the selected subsystem. **N.B.** This tool can be used only if global configuration is accessible from the Internet without restrictions.

**Developer**:
Marko Valing

**Contact info**:
https://github.com/tuudik/xroad6parser/issues

**Download location**:
https://github.com/tuudik/xroad6parser

**Documentation**:
https://github.com/tuudik/xroad6parser

**Development stage**:
Up-to-date, last updated 02/2018.

**Licence**:
GNU General Public License v3.0. https://github.com/tuudik/xroad6parser/blob/master/LICENSE

**Technology used**:
PHP, JavaScript, AJAX.

**Component requirements**:
Web server (Apache, Nginx etc), PHP.

## Systemd for X-Road v6 on Ubuntu 16.04

**Component type**:
Functional.

**Description**:
X-Road Security Server supports officially Ubuntu 14.04 LTS and Red Hat 7 (RHEL7) operating systems. The difference between Ubuntu 14.04 LTS and Ubuntu 16.04 LTS is that 14.04 uses upstart and 16.04 uses systemd which is why the debian packages do not run without modifications on Ubuntu 16.04 LTS. This component provides systemctl scripts for running the Security Server on Ubuntu 16.04 LTS. **N.B.** Ubuntu 16.04 LTS is **NOT officially supported** by X-Road.

**Developer**:
Marko Valing

**Contact info**:
https://github.com/tuudik/xroad_systemd/issues

**Download location**:
https://github.com/tuudik/xroad_systemd/

**Documentation**:
https://github.com/tuudik/xroad_systemd/

**Development stage**:
Up-to-date, last updated 02/2018.

**Licence**:
The MIT License (MIT). https://github.com/tuudik/xroad_systemd/blob/master/LICENSE

**Technology used**:
Bash, systemd.

**Component requirements**:
X-Road Security Server, Ubuntu 16.04 LTS.

## Security Server Log Archiver

**Component type**:
Functional.

**Description**:
This is a PHP script for archiving X-Road v6 Security Server logs over HTTP.
In addition, the script works also with X-Road v5 Security Server.

The script will create a hierarchical folder structure where the logs are
archived. It will create folder structure with hostname, year and month.

**Developer**:
Marko Valing

**Contact info**:
https://github.com/tuudik/archiver/issues

**Download location**:
https://github.com/tuudik/archiver/

**Documentation**:
https://github.com/tuudik/archiver/

**Development stage**:
Up-to-date, last updated 03/2018.

**Licence**:
GNU General Public License v3.0. https://github.com/tuudik/archiver/blob/master/LICENSE

**Technology used**:
PHP, Nginx/Apache.

**Component requirements**:
Web server (Apache, Nginx etc), PHP.


# X-Road Type Providers (XRoadProvider/.NET)

**Component name:**
XRoadProvider

**Component type:**
Developer tool

**Description:**
Collection of F# type providers which offer easier integration with X-Road web services
on .NET platform. Available type providers offer service interface generation from service description
documents (WSDL) and exploration of X-Road environment instance by supporting development environment
features through X-Road metaservices.

**Owner (Developer):**
Janno Põldma

**Owner contact info:**
[@janno-p](https://github.com/janno-p)

**Download location:**

* [NuGet](https://www.nuget.org/packages/XRoadProvider/)
* [GitHub](https://github.com/janno-p/XRoadProvider/releases)

**Documentation:**
http://janno-p.github.io/XRoadProvider/

**Development stage:**
up-to-date (last modified 10.04.2018)

**Licence:**
[MIT](http://janno-p.github.io/XRoadProvider/articles/license.html)

**Technology used:**
F#, .NET, Mono

**Component requirements:**
Primary target is X-Road v6 (message protocol version 4.0); from older versions message protocol
version 3.1 is supported (document/literal); message protocol version 2.0 (rpc/encoded) is broken and
will be probably removed.

## X-Road Simple Stats Collector

**Component type**:
Functional.

**Description**:
This is a simple statistics collector for the X-Road V6 that reads the number
of members, security servers, subsystems and number of members per member
class from global configuration. The results are returned as a JSON object.

**Developer**:
Petteri Kivimäki

**Contact info**:
https://github.com/petkivim/x-road-simple-stats-collector/issues

**Download location**:
https://github.com/petkivim/x-road-simple-stats-collector/

**Documentation**:
https://github.com/petkivim/x-road-simple-stats-collector/

**Development stage**:
Up-to-date, last updated 05/2018.

**Licence**:
The MIT License (MIT). https://github.com/petkivim/x-road-simple-stats-collector/blob/master/LICENSE.txt

**Technology used**:
Node.js, npm.

**Component requirements:**
X-Road v6 Protocol for Downloading Configuration V1 and V2; the script needs to
have access to the server (central server, configuration proxy) that is
distributing the global configuration (`downloadURL` element in configuration
anchor) - in some environments access to the `downloadURL` might be restricted
to registered security servers only.

# XRoadLib

**Component name:**
XRoadLib

**Component type:**
Developer tool

**Description:**
XRoadLib is a .NET library for implementing service interfaces of X-Road
providers using Code-First Development approach. Main focus of the library is to
support easier service development on X-Road provider side, by extracting service
descriptions and serialization logic from types and methods that are described as
service contracts.

**Owner (Developer):**
Janno Põldma

**Owner contact info:**
[@janno-p](https://github.com/janno-p)

**Download location:**

* [NuGet](https://www.nuget.org/packages/XRoadLib/)
* [GitHub](https://github.com/janno-p/XRoadLib/releases)

**Documentation:**
http://janno-p.github.io/XRoadLib/

**Development stage:**
Up-to-date, last updated 09/2018.

**Licence:**
[MIT](http://janno-p.github.io/XRoadLib/articles/license.html)

**Technology used:**
.NET

**Component requirements:**
X-Road v6 (message protocol version 4.0).
