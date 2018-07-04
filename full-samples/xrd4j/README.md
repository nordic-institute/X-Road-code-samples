# XRd4J

This example demonstrates how to invoke Example Adapter ```helloService```
service with one request parameter.

## Software Requirements

* Docker
* Java 8
* Maven 3.X

## How to Try

Checkout the code, start Example Adapter service, update the correct Example
Adapter service URL in ```Main.java:18```, compile the code and execute
the generated ```xrd4j-example-client-0.0.1-SNAPSHOT.jar``` file.

```
$ docker run -p 8080:8080 niis/example-adapter
$ git clone git@github.com:nordic-institute/X-Road-code-samples.git
$ cd X-Road-code-samples/full-samples/xrd4j
$ nano src/main/java/org/niis/xrd4j_example_client/Main.java # update Example Adapter Service URL
$ mvn clean install
$ java -jar target/xrd4j-example-client-0.0.1-SNAPSHOT.jar
```
