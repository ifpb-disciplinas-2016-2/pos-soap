package pos.soap;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import pos.soap.domain.Animal;
import pos.soap.infrastructure.DefaultRepository;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/07/2016, 13:26:46
 */
@WebService
public class CadastroZoo {

    @EJB
    private DefaultRepository repository;

    @WebMethod
    @Oneway
    public void salvar(@WebParam(name = "animal") Animal animal) {
        repository.salvar(animal);
    }

    @WebMethod(operationName = "listarAnimal")
    @WebResult
    public List<Animal> listar() {
        return repository.listar();
    }

}
