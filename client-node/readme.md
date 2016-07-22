# Cliente Nodejs
Neste exemplo é utilizada a biblioteca 'soap'.
O material base, que foi adaptado para estes exemplos:
- [node-soap](https://github.com/vpulim/node-soap)

**Código base:**
```js
var soap = require('soap');
var url = 'http://localhost:8088/server-java/CalculadoraService?WSDL';
soap.WSDL.prototype.ignoredNamespaces = [];
soap.createClient(url, function(err, client) {
    client.somarCalc(function(err,result,res){
         console.log('Resposta:',result);
    })
});
```
# executar o código
Para executar os exemplos é necessário ter o ambiente `node` instalado.
Uma vez instalado, executar os seguintes comando:
- `npm install`
- `node consumerCalculadora.js`

# listando os métodos

Listando os métodos providos pelo serviço
```js
soap.createClient(url, function(err, client) {
    client.listarPessoa(function(err,result,res){
         console.log('serviços:',client.describe());
    })    
});
```

# invocando os métodos
```js
var primeiro = {'primeiro':2, 'segundo':4};
soap.createClient(url, function(err, client) {
  client.somarCalc(primeiro, function(err,result,res){
       console.log('Somar:',result);
  })    
});
```
