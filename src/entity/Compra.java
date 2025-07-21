package entity;

import entity.abstracts.Tabela;

import java.util.Calendar;
import java.util.Date;

public class Compra extends Tabela {

    private int id;
    private final Date DATA;
    private Cliente cliente;
    private Produto produto;
    private String descricao;

    //Constructor
    public Compra(int id, Cliente cliente, Produto produto, String descricao) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.descricao = descricao;

        // pegar a data na hora da criação da venda
        Calendar c = Calendar.getInstance();
        this.DATA = c.getTime();

    }

    @Override
    public String conteudo() {
        return "Id: " + this.id +
                "cliente: " + this.cliente.getNome() + " -> " + this.cliente.getId() + " -> " + this.cliente.getIndereco() +
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
