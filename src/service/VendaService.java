package service;

import entity.Venda;
import repository.ClienteRepository;
import repository.VendaRepository;
import repository.VendedorRepository;
import repository.abstracts.RepositoryClass;
import service.abstracts.ServiceClass;

public class VendaService extends ServiceClass {
    private static final RepositoryClass REPOSITORY = new VendaRepository();
    public VendaService() {
        super(REPOSITORY);
    }
}
