var soap = require('soap');
var url = 'http://localhost:8080/example-adapter-x.x.x-SNAPSHOT/Endpoint?wsdl';
var args = {};
soap.createClient(url, function(err, client) {

  client.addSoapHeader({
    "xrd:client": {
      "namespace": "xmlns:tns",
      xRoadInstance: 'NIIS-TEST',
      memberClass: 'GOV',
      memberCode: '1234567-8',
      subsystemCode: 'TestClient',
      attributes: {
        "id:objectType": 'SUBSYSTEM'
      }
    },
    "xrd:service": {
      xRoadInstance: 'NIIS-TEST',
      memberClass: 'GOV',
      memberCode: '9876543-1',
      subsystemCode: 'DemoService',
      serviceCode: 'getRandom',
      serviceVersion: 'v1',
      attributes: {
        "id:objectType": 'SERVICE'
      }
    },
    "xrd:id": 'ID11234',
    "xrd:userId": 'EE1234567890',
    "xrd:protocolVersion": '4.0'
    },
    null, null, null
  );
  client.getRandom(args, function(err, result) {
    console.log(result);
  });
});
