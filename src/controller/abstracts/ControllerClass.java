package controller.abstracts;

import controller.interfaces.ControllerInterface;

import service.abstracts.ServiceClass;

import java.util.List;

public class ControllerClass implements ControllerInterface {
    protected ServiceClass service;

    public ControllerClass(ServiceClass service) {
        this.service = service;
    }

    @Override
    public void cadastrar( Object e) {
        service.cadastrar(e);
    }

    @Override
    public void editar(int id, String nome) {
        service.editar(id, nome);
    }

    @Override
    public void remover( int id) {
        service.remover(id);
    }

    @Override
    public List<?> listar() {
        return service.listar();
    }
}
