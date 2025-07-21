package repository;

import entity.Cliente;
import entity.Produto;
import repository.abstracts.RepositoryClass;

import java.util.List;

public class ProdutoRepository extends RepositoryClass {
    @Override
    public void salvar(Object e) {
        this.DATABASE.produtos.add((Produto) e);
    }

    @Override
    public void remover(int id) {
        for (int i = 0; i < this.DATABASE.produtos.size(); i++) {
            if (this.DATABASE.clientes.get(i).getId() == id) {
                this.DATABASE.clientes.remove(i);
                return;
            }
        }
    }

    @Override
    public void editar(int id, String nome) {
        for (int i = 0; i < this.DATABASE.clientes.size(); i++) {
            if (this.DATABASE.produtos.get(i).getId() == id) {
                this.DATABASE.produtos.get(i).setNome(nome);
                return;
            }
        }
    }

    @Override
    public List<Produto> linhas() {
        return this.DATABASE.produtos;
    }
}
