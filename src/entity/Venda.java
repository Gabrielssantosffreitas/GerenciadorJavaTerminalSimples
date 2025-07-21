package entity;

import entity.abstracts.Tabela;

import java.util.Calendar;
import java.util.Date;

public class Venda extends Tabela {
    private int id;
    private final Date DATA;
    private Vendedor vendedor;
    private Produto produto;
    private String descricao;
    //Constructor
    public Venda(int id,Vendedor vendedor, Produto produto, String descricao) {
        this.id = id;
        this.vendedor = vendedor;
        this.produto = produto;
        this.descricao = descricao;

        // pegar a data na hora da criação da venda
        Calendar c = Calendar.getInstance();
        this.DATA = c.getTime();

    }

    public String conteudo() {
        return "Id: " + this.id +
                "cliente: " + this.vendedor.getNome() + " -> " + this.vendedor.getId() + " -> " +
                "produto: " + this.produto.getNome() + " -> " + this.produto.getId() + " -> " + this.produto.getDescricao() + " -> " + this.produto.getTipoProduto() +
                "descrisao: " + this.descricao;
    }


    //getter end setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDATA() {
        return DATA;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
