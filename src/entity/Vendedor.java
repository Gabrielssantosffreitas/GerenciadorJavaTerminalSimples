package entity;

import java.util.List;

public class Vendedor {
    private int id;
    private String nome;

    public Vendedor(int id, String nome) {
        this.id = id;
        this.nome = nome;

    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }



}
