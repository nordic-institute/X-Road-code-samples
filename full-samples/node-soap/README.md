# node-soap

This example demonstrates how to invoke Example Adapter ```getRandom``` service
with no request parameters.

## Software Requirements

* Docker
* npm
* Node.js

## How to Try

Checkout the code, start Example Adapter Service, update the correct Example 
Adapter service URL in ```index.js:2```, install dependencies and run the code.

```
$ docker run -p 8080:8080 niis/example-adapter
$ git clone git@github.com:nordic-institute/X-Road-code-samples.git
$ cd X-Road-code-samples/full-samples/node-soap
$ npm install
$ nano index.js # update Example Adapter Service URL
$ node index.js
```
