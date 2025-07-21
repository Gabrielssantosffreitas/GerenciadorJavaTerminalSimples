package entity;

public class Cliente {
    private int id;
    private String nome;
    private String indereco;

    public Cliente(int id, String nome, String indereco) {
        this.id = id;
        this.nome = nome;
        this.indereco = indereco;
    }

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
