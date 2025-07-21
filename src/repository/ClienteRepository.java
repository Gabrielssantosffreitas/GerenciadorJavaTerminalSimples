package repository;
import entity.Cliente;
import entity.Produto;
import entity.abstracts.Tabela;
import repository.abstracts.RepositoryClass;
import java.util.List;

public class ClienteRepository extends RepositoryClass {
    @Override
    public void salvar(Object e) {
        this.DATABASE.clientes.add((Cliente) e);
    }

    @Override
    public void remover(int id) {
        for (int i = 0; i < this.DATABASE.clientes.size(); i++) {
            if (this.DATABASE.clientes.get(i).getId() == id) {
                this.DATABASE.clientes.remove(i);
                return;
            }
        }
        System.out.println("\nNao foi possivel encontrar esse Id \n");
    }

    @Override
    public void editar(int id,String nome) {
        for (int i = 0; i < this.DATABASE.clientes.size(); i++) {
            if (this.DATABASE.clientes.get(i).getId() == id) {
                this.DATABASE.clientes.get(i).setNome(nome);
                return;
            }
        }
    }

    @Override
    public List<Cliente> linhas() {
        return this.DATABASE.clientes;
    }
}
