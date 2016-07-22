from suds.client import Client
from suds.cache import NoCache
url="http://localhost:8088/server-java/CadastroZooService?WSDL"
client = Client(url, cache=NoCache())
print client
print 'Lista: ', client.service.listarAnimal()
animal = {
    'id': 0,
    'nome':'Rex',
    'raca':'viralata'
}
client.service.salvar(animal)
