package service.abstracts;

import repository.abstracts.RepositoryClass;
import service.Interface.ServiceInterface;

import java.sql.SQLOutput;
import java.util.List;

public class ServiceClass implements ServiceInterface {
    protected RepositoryClass repositoryClass;

    public ServiceClass(RepositoryClass repositoryClass) {
        this.repositoryClass = repositoryClass;
    }



    @Override
    public void cadastrar( Object e) {
        if (e == null){
            System.out.println("nao foi possivel salvar");
        }
        System.out.println(e.getClass());

        repositoryClass.salvar(e);
    }

    @Override
    public void editar(int id, String nome)  {
        if (id < 0 || nome == null){
            System.out.println("erro no cadastro");
            return;
        }
        repositoryClass.editar(id,nome);
    }

    @Override
    public void remover(int id) {
        if (id < 0){
            System.out.println("nao foi possivel remover");
            return;
        }
        repositoryClass.remover(id);
    }

    @Override
    public List<?> listar() {
        return repositoryClass.linhas();
    }
}
