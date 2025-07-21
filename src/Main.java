import entity.Cliente;
import repository.ClienteRepository;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.salvar(new Cliente(1, "carlos", "rua maria silvana 192"));
        for (int i = 0; i < clienteRepository.linhas().size(); i++) {
            System.out.println(clienteRepository.linhas().get(i).conteudo());
        }

        clienteRepository.editar(1, "mario");
        for (int i = 0; i < clienteRepository.linhas().size(); i++) {
            System.out.println(clienteRepository.linhas().get(i).conteudo());
        }
        clienteRepository.remover(1);
        for (int i = 0; i < clienteRepository.linhas().size(); i++) {
            System.out.println(clienteRepository.linhas().get(i).conteudo());
        }


    }
}