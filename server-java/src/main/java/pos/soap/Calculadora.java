package pos.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/07/2016, 15:53:51
 */
@WebService
public class Calculadora {

    @WebMethod(operationName = "somarCalc")
    @WebResult(name = "valor")
    public int somar(@WebParam(name = "primeiro") int primeiro,
            @WebParam(name = "segundo") int segundo) {
        return primeiro + segundo;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }
}
