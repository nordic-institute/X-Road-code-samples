# Jax-ws

This example demonstrates how to use jax-ws API for invoking
Example Adapter ```helloService``` service with one request
parameter.

## Software Requirements

* Java 8
* Maven 3.X

## How to Try

Checkout the code, start Example Adapter service, update the Example Adapter
URL to the code, build the project and run the generated jar.

1. Start Example Adapter service: `docker run -p 8080:8080 niis/example-adapter`
2. Update the Example Adapter URL to the code.
3. Build the project: `mvn clean install`
4. Run the generated jar: `java -jar target/jaxws-example-client-0.0.1-SNAPSHOT.jar`
