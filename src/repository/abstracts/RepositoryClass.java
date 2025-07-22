package repository.abstracts;

import databaseImprovised.Database;
import repository.interfaces.Repository;

import java.util.ArrayList;
import java.util.List;

public abstract  class RepositoryClass implements Repository {
    protected static final Database DATABASE = new Database();

    @Override
    public void salvar(Object e) {

    }

    @Override
    public void remover(int id) {

    }

    @Override
    public void editar(int id, String nome) {

    }

    @Override
    public List<?> linhas() {
        return List.of();
    }
}
