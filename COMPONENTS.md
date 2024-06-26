![European Regional Development Fund](img/EU.png "European Regional Development Fund - DO NOT REMOVE THIS IMAGE BEFORE 01.06.2022")

# X-Road Custom Extensions

This page contains a list of reusable X-Road custom extensions implemented by the
X-Road community. If you know a tool that should be in this list you can make a
pull request or send the extension info to the NIIS by email (x-road at niis.org).
Before adding new extensions to the list please take a look at the [Extension Description Guidelines](COMPONENT_DESCRIPTION_GUIDELINES.md).

## Table of Contents
* [X-Road Personal Data Monitor](#x-road-personal-data-monitor)
* [X-Road Generator (X-tee .NET)](#x-road-generator-x-road-net)
* [J-road](#j-road)
* [SAP PI X-Road Adapter](#sap-pi-x-road-adapter)
* [XRDv4WSDLConverter](#xrdv4wsdlconverter)
* [X-Road Test Client](#x-road-test-client)
* [Qure Data Management Platform](#qure-data-management-platform)
* [X-Road File Service](#x-road-file-service)
* [X-Road E2E Client](#x-road-e2e-client)
* [X-Road End-to-End Monitoring Tool (XRdE2E)](#x-road-end-to-end-monitoring-tool-xrde2e)
* [API Catalog](#api-catalog)
* [X-Road v6 Global Configuration Parser](#x-road-v6-global-configuration-parser)
* [Systemd for X-Road v6 on Ubuntu 16.04](#systemd-for-x-road-v6-on-ubuntu-1604)
* [Security Server Log Archiver](#security-server-log-archiver)
* [X-Road Type Providers (XRoadProvider/.NET)](#x-road-type-providers-xroadprovidernet)
* [X-Road Simple Stats Collector](#x-road-simple-stats-collector)
* [XRoadLib](#xroadlib)
* [X-Road REST and SOAP adapters deployment](#x-road-rest-and-soap-adapters-deployment)
* [X-Road Drive](#x-road-drive)
* [FastAPI X-Road SOAP](#fastapi-x-road-soap)

## X-Road Personal Data Monitor

**Extension type**:
Functional extension.

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

**Extension requirements**:
Any Java application server.

## X-Road Generator (X-Road .NET)

**Extension type**:
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

**Extension requirements**:
V2.0 supports x-Road version 5 and down, V3.0 x-Road version 6 (olders are not supported). V3 is in development, v2 is up-to-date.

## J-road

**Extension type**:
Developer tool.

**Description**:
Java library which simplifies the consumption and creation of Estonian X-Road services through code generation and protocol implementation.

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

**Extension requirements**:
Spring Framework.

## SAP PI X-Road Adapter

**Extension type**:
Adapter.

**Description**:
A simple software component for converting X-Road SOAP requests between X-Road Security Server and SAP XI/PI integration platform.

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

**Extension requirements**:
Requires Java v1.6 or later, SAP XI/PI (all versions supported). PI database connection is also required (JDBC). Only X-Road v6 SOAP header elements are supported.

## XRDv4WSDLConverter

**Extension type**:
Developer tool.

**Description**:
X-Road WSDL Converter converts old version 2 and 3 WSDL files into version 4 WSDL.

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

**Extension requirements**:
Java SDK 8. Supported X-Road protocol versions: 2, 3, 4.

## X-Road Test Client

**Extension type**:
Functional extension.

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

**Extension requirements**:
The extension can be run on Linux / Windows as a standalone JAR (Java 7 or later). The extension is compatible with X-Road v6.4 and later.

## Qure Data Management Platform

**Extension type:** Functional extension.

**Description:** Qure Data Management Platform is a web-based database software for collection, handling, and analysis of data under high quality, security, and robustness requirements. The platform is well suitable for rapid building of registries, biobanks, clinical trials, data management systems, statistical surveys, and other web-based database applications. It has built-in X-Road consumer support, with user interface assisted X-Road Security Server connection setup. The X-Road queries can be defined and run directly from server side JavaScript.

**Developer:** Quretec, http://www.quretec.com/#qureplatform

**Contact info:** Margus Jäger, quretec@quretec.com

**Download location:** NA.

**Documentation:** NA.

**Development stage:** In development.

**Licence:** Commercial.

**Technology used:** Java, JavaScript.

**Extension requirements:** WildFly 10, PostgreSQL 9.5+, Linux, Java 8. X-Road version 5 supported, version 6 support is in development.

## X-Road File Service

**Extension type**:
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

**Extension requirements**:
Requires JDK 8 to build and JRE 8 to run.

## X-Road E2E Client

**Extension type**:
Functional.

**Description**:
Simple monitoring client for X-Road Security Server. Calls getRandom and helloService tests services though a Security Server and reports failures by email.

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

**Extension requirements**:
More information about the requirements: https://github.com/vrk-kpa/xroad-e2e-client#requirements

## X-Road End-to-End Monitoring Tool (XRdE2E)

**Extension type**:
Functional.

**Description**:
X-Road End-to-End Monitoring Tool (XRdE2E) is an end-to-end monitoring tool for X-Road Security Servers. Monitoring of the Security Servers is done using the listMethods meta service. If Security Server sends a valid response, it means that proxy and signer components are both working fine.

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

**Extension requirements**:
Requires JDK 8 to build, and JRE 8 or Docker to run.

## API Catalog

**Extension type**:
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

**Extension requirements**:
Vagrant (tested on 1.8.4), VirtualBox (tested on 5.0.20).

## X-Road v6 Global Configuration Parser

**Extension type**:
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

**Extension requirements**:
Web server (Apache, Nginx etc), PHP.

## Systemd for X-Road v6 on Ubuntu 16.04

**Extension type**:
Functional.

**Description**:
X-Road Security Server supports officially Ubuntu 14.04 LTS and Red Hat 7 (RHEL7) operating systems. The difference between Ubuntu 14.04 LTS and Ubuntu 16.04 LTS is that 14.04 uses upstart and 16.04 uses systemd which is why the debian packages do not run without modifications on Ubuntu 16.04 LTS. This extension provides systemctl scripts for running the Security Server on Ubuntu 16.04 LTS. **N.B.** Ubuntu 16.04 LTS is **NOT officially supported** by X-Road.

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

**Extension requirements**:
X-Road Security Server, Ubuntu 16.04 LTS.

## Security Server Log Archiver

**Extension type**:
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

**Extension requirements**:
Web server (Apache, Nginx etc), PHP.


# X-Road Type Providers (XRoadProvider/.NET)

**Extension name:**
XRoadProvider

**Extension type:**
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

**Extension requirements:**
Primary target is X-Road v6 (message protocol version 4.0); from older versions message protocol
version 3.1 is supported (document/literal); message protocol version 2.0 (rpc/encoded) is broken and
will be probably removed.

## X-Road Simple Stats Collector

**Extension type**:
Functional.

**Description**:
This is a simple statistics collector for the X-Road V6 that reads the number
of members, Security Servers, subsystems and number of members per member
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

**Extension requirements:**
X-Road v6 Protocol for Downloading Configuration V1 and V2; the script needs to
have access to the server (central server, configuration proxy) that is
distributing the global configuration (`downloadURL` element in configuration
anchor) - in some environments access to the `downloadURL` might be restricted
to registered Security Servers only.

# XRoadLib

**Extension name:**
XRoadLib

**Extension type:**
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

**Extension requirements:**
X-Road v6 (message protocol version 4.0).

## X-Road REST and SOAP adapters deployment

**Extension type**:
Adapter

**Description**:
Toolset for deploying the [X-Road REST Adapter Service](https://github.com/nordic-institute/REST-adapter-service) and [xroad-universal-soap](https://github.com/nanndoj/xroad-universal-soap) proxy in tandem, as a [system service](https://en.wikipedia.org/wiki/Systemd) with [Docker Compose](https://docs.docker.com/compose/).

**Owner (Developer)**:
[Digital Iceland](https://www.island.is/en).  (Developed by [Björn Þór Jónsson](https://about.me/bthj) / [Origo](https://www.origo.is/english/)).

**Contact info**:
[@bthj](https://github.com/bthj)

**Download location**:
https://github.com/bthj/xroad-rest-soap-adapters

**Documentation**:
https://github.com/bthj/xroad-rest-soap-adapters/blob/main/README.md

**Development stage**:
Up-to-date, last updated 2020-10-28.

**Licence**:
[MIT](https://github.com/bthj/xroad-rest-soap-adapters/blob/main/LICENSE)

**Technology used**:
GNU Bash shell, Docker Compose, systemd.

**Extension requirements**:
Ubuntu 18.04 LTS or RHEL 7 or RHEL 8; Docker and Docker Compose.

## X-Road Drive

**Extension type:** Adapter

**Description:** The X-Road Drive is a file service to manage and share files over X-Road. As a sample application, it helps you to understand the X-Road technology, and shows that the REST support potentially expands service variety on X-Road.

It also demonstrates how to use metadata on X-Road to improve your application. The X-Road Drive harmonizes in metadata service and the Security Server's REST administrative API.

**Owner (Developer):** Yamato Kataoka

**Owner contact info:** https://github.com/yamatokataoka/xroad-drive/issues

**Download location:** https://github.com/yamatokataoka/xroad-drive

**Documentation:** https://github.com/yamatokataoka/xroad-drive

**Development stage:** Up-to-date, last updated 11/2020.

**Licence:** The MIT License (MIT). https://github.com/yamatokataoka/xroad-drive/blob/develop/LICENSE

**Technology used:** Java, Vue.js, Go

**Extension requirements:** Docker and Docker Compose.

## FastAPI X-Road SOAP

**Extension type:** Library

**Description:** FastAPI X-Road SOAP is a Python library to create X-Road compatible SOAP services.

**Owner (Developer):** Centre of Registers and Information Systems, Estonia

**Owner contact info:** https://github.com/rik-ee/fastapi-xroad-soap/issues

**Download location:** https://pypi.org/project/fastapi-xroad-soap/0.4.7/

**Documentation:** https://github.com/rik-ee/fastapi-xroad-soap/wiki

**Development stage:** Up-to-date, last updated 06/2024.

**Licence:** EUPL 1.2. https://github.com/rik-ee/fastapi-xroad-soap/blob/main/LICENSE

**Technology used:** Python, FastAPI

**Extension requirements:** Python.