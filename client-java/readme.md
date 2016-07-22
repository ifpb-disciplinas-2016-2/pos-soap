# Cliente Java
Neste exemplo é utilizado uma configuração no `pom.xml` de tal forma que possibilite uma geração de código a partir de um arquivo `wsdl`.

**Código base:**
```java
public class ConsumerCalculadora {
    public static void main(String[] args) {
        CalculadoraService service = new CalculadoraService();
        Calculadora calculadora = service.getCalculadoraPort();
    }
}
```
# executar o código
Para executar os exemplos é necessário ter o ambiente `maven` instalado. Uma vez instalado, executar o seguinte comando:
- `mvn clean package`


# invocando os métodos
```java
CalculadoraService service = new CalculadoraService();
Calculadora calculadora = service.getCalculadoraPort();
System.out.println("somar: "+calculadora.somarCalc(1, 2));
System.out.println("subtrair: "+calculadora.subtrair(3, 2));
```
