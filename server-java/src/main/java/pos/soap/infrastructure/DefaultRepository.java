package pos.soap.infrastructure;

import pos.soap.domain.Animal;

import java.util.List;

import javax.ejb.Stateless;
import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/07/2016, 16:20:11
 */
@Stateless
@DataSourceDefinition(
        name = "java:app/jdbc/pos",
        className = "org.apache.derby.jdbc.ClientDriver",
        url = "jdbc:derby://localhost:1527/pos-soap",
        user = "soap",
        password = "12345"
)
public class DefaultRepository {

    @PersistenceContext
    private EntityManager em;

    public void salvar(Animal animal) {
        if (animal == null) {
            System.out.println("objeto null");
        } else {
            em.persist(animal);
            System.out.println(animal);
        }
    }

    public List<Animal> listar() {
        return em.createQuery("select a From Animal a", Animal.class)
                .getResultList();
    }

}
