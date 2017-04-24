var soap = require('soap');
var url = 'http://localhost:8080/server-java/CadastroZooService?WSDL';
soap.WSDL.prototype.ignoredNamespaces = [];
var animal = {
    'id': 0,
    'nome':'Rexy',
    'raca':'pug'
}
soap.createClient(url, function(err, client) {
    client.listarAnimal(function(err,result,res){        
        console.log('Lista:',result.return);
    })
    client.salvar(animal, function(err,result,res){
         console.log('Método salvar, sem retorno:',result);
    })
});
