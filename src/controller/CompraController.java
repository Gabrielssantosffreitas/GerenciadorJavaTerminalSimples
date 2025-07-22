package controller;

import controller.abstracts.ControllerClass;
import entity.Compra;
import service.ClienteService;
import service.CompraService;
import service.abstracts.ServiceClass;

import java.util.List;

public class CompraController extends ControllerClass {
    private static final ServiceClass SERVICE_CLASS = new CompraService();
    public CompraController() {
        super(SERVICE_CLASS);
    }

    @Override
    public List<Compra> listar() {
        return (List<Compra>) super.listar();
    }
}
