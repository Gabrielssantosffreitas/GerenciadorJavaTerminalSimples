package repository.interfaces;
import entity.Cliente;
import entity.abstracts.Tabela;

import java.util.List;

public interface Repository {
    void salvar(Object e);
    void remover(int id);
    void editar(int id,String nome);
    List<?> linhas();
}
