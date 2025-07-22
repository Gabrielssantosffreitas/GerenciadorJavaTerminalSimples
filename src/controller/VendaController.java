package controller;

import controller.abstracts.ControllerClass;
import entity.Venda;
import service.ClienteService;
import service.VendaService;
import service.abstracts.ServiceClass;

import java.util.List;

public class VendaController extends ControllerClass {
    private static final ServiceClass SERVICE_CLASS = new VendaService();
    public VendaController() {
        super(SERVICE_CLASS);
    }

    @Override
    public List<Venda> listar() {
        return (List<Venda>) super.listar();
    }
}
