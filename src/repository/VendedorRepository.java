package repository;

import entity.Produto;
import entity.Vendedor;
import repository.abstracts.RepositoryClass;

import java.util.List;

public class VendedorRepository extends RepositoryClass {
    @Override
    public void salvar(Object e) {
        this.DATABASE.vendedores.add((Vendedor) e);
    }

    @Override
    public void remover(int id) {
        for (int i = 0; i < this.DATABASE.produtos.size(); i++) {
            if (this.DATABASE.vendedores.get(i).getId() == id) {
                this.DATABASE.vendedores.remove(i);
                return;
            }
        }
    }

    @Override
    public void editar(int id, String nome) {
        for (int i = 0; i < this.DATABASE.clientes.size(); i++) {
            if (this.DATABASE.vendedores.get(i).getId() == id) {
                this.DATABASE.vendedores.get(i).setNome(nome);
                return;
            }
        }
    }

    @Override
    public List<Vendedor> linhas() {
        return this.DATABASE.vendedores;
    }
}
