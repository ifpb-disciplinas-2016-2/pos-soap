from suds.client import Client
from suds.cache import NoCache
url="http://localhost:8080/server-java/CalculadoraService?WSDL"
client = Client(url, cache=NoCache())
#invocando os metodos
print 'Soma: ', client.service.somarCalc(11,2)
print 'Soma: ', client.service.subtrair(10,12)
