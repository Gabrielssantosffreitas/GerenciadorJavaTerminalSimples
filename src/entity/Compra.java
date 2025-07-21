package entity;
import java.util.Calendar;
import java.util.Date;

public class Compra {

    private int id;
    private final Date DATA;
    private Cliente cliente;
    private Produto produto;
    private String descricao;

    public Compra(int id,Cliente cliente, Produto produto, String descricao) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.descricao = descricao;

        // pegar a data na hora da criação da venda
        Calendar c = Calendar.getInstance();
        this.DATA = c.getTime();

    }

}
