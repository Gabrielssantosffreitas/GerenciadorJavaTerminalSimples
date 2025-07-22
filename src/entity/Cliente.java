package entity;

import entity.abstracts.Tabela;

public class Cliente extends Tabela {

    private String nome;
    private String indereco;

    //CONSTRUCTOR
    public Cliente(int id, String nome, String indereco) {
        this.id = id;
        this.nome = nome;
        this.indereco = indereco;
    }

    @Override
    public String toString() {

            return "Nome: " + this.nome + " " +
                    "indereco: " + this.indereco + " " +
                    "id: " + this.id;

    }

    // GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndereco() {
        return indereco;
    }

    public int getId() {
        return id;
    }
}
