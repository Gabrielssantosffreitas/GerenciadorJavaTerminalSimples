package controller;

import controller.abstracts.ControllerClass;
import entity.Cliente;
import service.ClienteService;
import service.abstracts.ServiceClass;

import java.util.List;

public class ClienteController extends ControllerClass {

    private static final ServiceClass SERVICE_CLASS = new ClienteService();

    public ClienteController() {
        super(SERVICE_CLASS);
    }

    @Override
    public List<Cliente> listar() {
        return (List<Cliente>) super.listar();
    }
}
