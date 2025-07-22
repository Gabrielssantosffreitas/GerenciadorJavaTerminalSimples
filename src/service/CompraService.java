package service;

import repository.ClienteRepository;
import repository.CompraRepository;
import repository.abstracts.RepositoryClass;
import service.abstracts.ServiceClass;

public class CompraService extends ServiceClass {
    private static final RepositoryClass REPOSITORY = new CompraRepository();
    public CompraService() {
        super(REPOSITORY);
    }
}
