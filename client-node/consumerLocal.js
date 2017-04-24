var soap = require('soap');
var url = 'http://127.0.0.1:1337/testService?wsdl';
var primeiro = {'myArg1':2, 'myArg2':4};
soap.WSDL.prototype.ignoredNamespaces = ['tns']
//console.log(soap.WSDL.prototype.ignoredNamespaces);
soap.createClient(url, function(err, client) {

    MyTestService.prototype.somar(primeiro, function(err,result,res){
         console.log('Método somar:',result.valor);
    })
});
