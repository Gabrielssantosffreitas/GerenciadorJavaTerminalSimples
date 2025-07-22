package service;

import repository.ClienteRepository;
import repository.VendedorRepository;
import repository.abstracts.RepositoryClass;
import service.abstracts.ServiceClass;

public class VendedorService extends ServiceClass {
    private static final RepositoryClass REPOSITORY = new VendedorRepository();
    public VendedorService() {
        super(REPOSITORY);
    }
}
