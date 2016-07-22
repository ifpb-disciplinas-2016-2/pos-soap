package pos.soap.consumer;

import pos.soap.calculadora.Calculadora;
import pos.soap.calculadora.CalculadoraService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/07/2016, 16:44:03
 */
public class ConsumerCalculadora {
    public static void main(String[] args) {
        CalculadoraService service = new CalculadoraService();
        Calculadora calculadora = service.getCalculadoraPort();
        System.out.println("somar: "+calculadora.somarCalc(1, 2));
        System.out.println("subtrair: "+calculadora.subtrair(3, 2));
    }
}
