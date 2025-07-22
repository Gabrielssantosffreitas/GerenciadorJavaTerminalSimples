package service.Interface;

import repository.abstracts.RepositoryClass;

import java.util.List;

public interface ServiceInterface {

    void cadastrar(Object e);


    void editar(int id, String nome);


    void remover(int id);


    List<?> listar();
}
