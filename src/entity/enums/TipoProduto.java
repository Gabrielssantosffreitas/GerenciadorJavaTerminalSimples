package entity.enums;

public enum TipoProduto {
    CASA(1,"casa"),
    INFORMATICA(2,"informatica e gamers"),
    ;
    private int id;
    private String descrisao;
    TipoProduto(int id,String descrisao) {
        this.id = id;
        this.descrisao = descrisao;
    }

    public int getId() {
        return id;
    }

    public String getDescrisao() {
        return descrisao;
    }
}
