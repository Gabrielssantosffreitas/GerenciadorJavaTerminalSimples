package controller;

import controller.abstracts.ControllerClass;
import entity.Produto;
import service.ProdutoService;
import service.abstracts.ServiceClass;

import java.util.List;

public class ProdutoController extends ControllerClass {
    private  static  final ProdutoService SERVICE = new ProdutoService();
    public ProdutoController() {
        super(SERVICE);
    }

    @Override
    public List<Produto> listar() {
        return  (List<Produto>) super.listar();
    }
}
