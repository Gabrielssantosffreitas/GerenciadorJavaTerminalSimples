package repository;

import entity.Compra;
import entity.Produto;
import repository.abstracts.RepositoryClass;

import java.util.List;

public class CompraRepository extends RepositoryClass {
    @Override
    public void salvar(Object e) {
        this.DATABASE.compras.add((Compra) e);
    }

    @Override
    public void remover(int id) {
        for (int i = 0; i < this.DATABASE.produtos.size(); i++) {
            if (this.DATABASE.compras.get(i).getId() == id) {
                this.DATABASE.compras.remove(i);
                return;
            }
        }
    }

    @Override
    public void editar(int id, String nome) {
        System.out.println("Nao é possivel editar uma compra");
    }

    @Override
    public List<Compra> linhas() {
        return this.DATABASE.compras;
    }
}
