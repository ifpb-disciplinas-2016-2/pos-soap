from suds.client import Client
from suds.cache import NoCache
url="http://localhost:8080/server-java/ListagemPessoaService?WSDL"
client = Client(url, cache=NoCache())
print 'Lista: ', client.service.listarPessoa()
#criando o objeto
pessoa = {
    'nome':'Chaves',
    'idade':26
}
client.service.validar(pessoa)
