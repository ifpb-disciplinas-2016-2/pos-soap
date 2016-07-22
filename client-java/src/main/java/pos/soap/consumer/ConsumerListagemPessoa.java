package pos.soap.consumer;

import pos.soap.listagem.ListagemPessoa;
import pos.soap.listagem.ListagemPessoaService;
import pos.soap.listagem.Pessoa;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 22/07/2016, 16:44:03
 */
public class ConsumerListagemPessoa {

    public static void main(String[] args) {
        ListagemPessoaService service = new ListagemPessoaService();
        ListagemPessoa listagemPessoa = service.getListagemPessoaPort();

        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(12);
        pessoa.setNome("Chaves");

        listagemPessoa.validar(pessoa);

        listagemPessoa.listarPessoa().forEach(pessoaResult -> {
            System.out.println(
                    String.format("Idade: %d \t Nome: %s",
                            pessoaResult.getIdade(), pessoaResult.getNome())
            );
        });

    }
}
