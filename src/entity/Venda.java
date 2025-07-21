package entity;

import java.util.Calendar;
import java.util.Date;

public class Venda {
    private int id;
    private final Date DATA;
    private Vendedor vendedor;
    private Produto produto;
    private String descricao;

    public Venda(int id,Vendedor vendedor, Produto produto, String descricao) {
        this.id = id;
        this.vendedor = vendedor;
        this.produto = produto;
        this.descricao = descricao;

        // pegar a data na hora da criação da venda
        Calendar c = Calendar.getInstance();
        this.DATA = c.getTime();

    }
}
