# Cliente Python
Neste exemplo é utilizada a biblioteca 'suds'.
O material base, que foi adaptado para estes exemplos:
- [Documentation](https://fedorahosted.org/suds/wiki/Documentation)
- [TipsAndTricks](https://fedorahosted.org/suds/wiki/TipsAndTricks)

**Código base:**
```python
from suds.client import Client
from suds.cache import NoCache
#localização da wsdl
url="http://localhost:8088/server-java/CalculadoraService?WSDL"
client = Client(url, cache=NoCache())
```
# executar o código
Para executar os exemplos é necessário ter o ambiente python instalado. Uma vez instalado, executar o seguinte comando:

`python consumerCalculadora.py`

# listando os métodos

Listando os métodos providos pelo serviço
```python
client = Client(url, cache=NoCache())
print client
```

# invocando os métodos
```python
print 'Soma: ', client.service.somarCalc(10,2)
print 'Soma: ', client.service.subtrair(10,2)
```
