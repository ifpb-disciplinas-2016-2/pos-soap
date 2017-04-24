var soap = require('soap');
var url = 'http://localhost:8080/server-java/CalculadoraService?WSDL';
var primeiro = {'primeiro':2, 'segundo':4};
var segundo = {arg0:9, arg1:4};
soap.WSDL.prototype.ignoredNamespaces = [];
soap.createClient(url, function(err, client) {
    client.somarCalc(primeiro, function(err,result,res){
         console.log('Método somar:',result.valor);
    })
    client.subtrair(segundo, function(err,result,res){
         console.log('Método subtrair:',result.return);
    })
});
