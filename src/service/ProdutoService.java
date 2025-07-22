package service;

import repository.ProdutoRepository;
import repository.abstracts.RepositoryClass;
import service.abstracts.ServiceClass;

public class ProdutoService extends ServiceClass {
    public  static final ProdutoRepository REPOSITORY = new ProdutoRepository();
    public ProdutoService() {
        super(REPOSITORY);
    }
}
