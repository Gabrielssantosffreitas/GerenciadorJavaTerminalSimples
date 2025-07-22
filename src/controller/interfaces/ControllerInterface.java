package controller.interfaces;

import repository.abstracts.RepositoryClass;
import service.abstracts.ServiceClass;

import java.util.List;


public interface ControllerInterface {
    void cadastrar( Object e);

    void editar(int id, String nome);

    void remover(int id);

    List<?> listar();

}
