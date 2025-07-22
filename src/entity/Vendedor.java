package entity;

import entity.abstracts.Tabela;

public class Vendedor extends Tabela {

    private String nome;

    public Vendedor(int id, String nome) {
        this.id = id;
        this.nome = nome;

    }

    @Override
    public String toString() {
        return "Id: " + this.id +" "+
                "nome: "+ this.nome;
    }

    @Override


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
