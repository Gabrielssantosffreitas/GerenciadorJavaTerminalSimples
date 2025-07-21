package entity;

import entity.enums.TipoProduto;
import entity.abstracts.Tabela;

public class Produto extends Tabela {
    private int id;
    private String nome;
    private String descricao;
    private TipoProduto tipoProduto;

    //constructor
    public Produto(int id, String nome, String descricao, TipoProduto tipoProduto) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tipoProduto = tipoProduto;
    }

    @Override
    public String conteudo() {
        return "id " + this.id +
                "nome: " + this.nome +
                "descriçao: " + this.descricao +
                "tipo: " + this.tipoProduto.getDescrisao();
    }

    //getter end setter
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
}
