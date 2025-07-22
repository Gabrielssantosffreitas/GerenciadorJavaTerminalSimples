package repository;

import entity.Venda;
import repository.abstracts.RepositoryClass;

import java.util.List;

public class VendaRepository extends RepositoryClass {
    @Override
    public void salvar(Object e) {
        Venda venda = (Venda) e;
        this.DATABASE.vendas.add(venda);
    }

    @Override
    public void remover(int id) {
        for (int i = 0; i < this.DATABASE.produtos.size(); i++) {
            if (this.DATABASE.vendas.get(i).getId() == id) {
                this.DATABASE.vendas.remove(i);
                return;
            }
        }
    }

    @Override
    public void editar(int id, String nome) {
        System.out.println(" nao  e possivel editar uma compra");
    }

    @Override
    public List<Venda> linhas() {
        return this.DATABASE.vendas;
    }
}
