package pos.soap.consumer;

import pos.soap.cadastro.Animal;
import pos.soap.cadastro.CadastroZoo;
import pos.soap.cadastro.CadastroZooService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/07/2016, 16:44:03
 */
public class ConsumerCadastroZoo {

    public static void main(String[] args) {
        CadastroZooService service = new CadastroZooService();
        CadastroZoo cadastro = service.getCadastroZooPort();
        
        System.out.println("--Listagem--");
        cadastro.listarAnimal().forEach(animalResult -> {
            System.out.println(
                    String.format("Id: %d \t Nome: %s \tRaça: %s",
                            animalResult.getId(), animalResult.getNome(), animalResult.getRaca())
            );
        });
        
        Animal animal = new Animal();
        animal.setId(90);
        animal.setNome("Totó");
        animal.setRaca("pitch");
        
        cadastro.salvar(animal);
        
        System.out.println("--Depois--");
        cadastro.listarAnimal().forEach(animalResult -> {
            System.out.println(
                    String.format("Id: %d \t Nome: %s \tRaça: %s",
                            animalResult.getId(), animalResult.getNome(), animalResult.getRaca())
            );
        });
    }
}
