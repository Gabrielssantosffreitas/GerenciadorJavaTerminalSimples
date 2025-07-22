package controller;

import controller.abstracts.ControllerClass;
import entity.Vendedor;
import service.VendedorService;
import service.abstracts.ServiceClass;

import java.util.List;

public class VendedorController extends ControllerClass {
    private static final VendedorService SERVICE = new VendedorService();

    public VendedorController() {
        super(SERVICE);
    }

    @Override
    public List<Vendedor> listar() {
        return (List<Vendedor>) super.listar();
    }
}
