package service;

import repository.ClienteRepository;
import repository.abstracts.RepositoryClass;
import service.abstracts.ServiceClass;

public class ClienteService extends ServiceClass {
    private static final RepositoryClass REPOSITORY = new ClienteRepository();
    public ClienteService() {
        super(REPOSITORY);
    }
}
