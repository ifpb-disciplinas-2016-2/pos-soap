package pos.soap;

import pos.soap.domain.Pessoa;
 
import java.util.ArrayList;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/07/2016, 15:53:51
 */
@WebService
public class ListagemPessoa {

    @WebMethod(operationName = "validar")
    @Oneway
    public void validar(Pessoa pessoa) {
        if (pessoa == null) {
            System.out.println("null");
        } else {
            System.out.println(
                    String.format("Nome: %s, idade: %d",
                            pessoa.getNome(), pessoa.getIdade())
            );
        }
    }

    @WebMethod(operationName = "listarPessoa")
    @WebResult(name = "pessoa")
    public List<Pessoa> listarPessoa() {
        List<Pessoa> pessoas = new ArrayList<>();
            pessoas.add(new Pessoa());
            pessoas.add(new Pessoa("Chaves", 8));
            pessoas.add(new Pessoa("Chiquinha", 14));
        return pessoas;
    }
}
