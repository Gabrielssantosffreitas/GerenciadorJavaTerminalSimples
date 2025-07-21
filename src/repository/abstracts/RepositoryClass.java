package repository.abstracts;

import databaseImprovised.Database;
import repository.interfaces.Repository;

import java.util.ArrayList;

public abstract  class RepositoryClass implements Repository {
    protected static final Database DATABASE = new Database();

}
