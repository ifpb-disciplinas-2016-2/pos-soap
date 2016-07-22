var soap = require('soap');
var url = 'http://localhost:8088/server-java/ListagemPessoaService?WSDL';
soap.WSDL.prototype.ignoredNamespaces = [];
var pessoa = {
    'nome':'Chaves',
    'idade':26
}
soap.createClient(url, function(err, client) {
    client.listarPessoa(function(err,result,res){
         console.log('Lista:',result);
    })
    client.validar(pessoa, function(err,result,res){
         console.log('Método validar, sem retorno:',result);
    })
});
