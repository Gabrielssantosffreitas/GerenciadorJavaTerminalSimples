import entity.Cliente;
import repository.ClienteRepository;
import views.TelaViews;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        TelaViews tela = new TelaViews();
        tela.init();
        ClienteRepository r = new ClienteRepository();


        // 1 cadastra cliente
        // 2 cadastra Produto
        // 3 cadastra vendedor
        // 4 lista cliente
        // 5 lista produtos
        // 6 lista vendedor
        // 7 venda -> cliente, produto e vendedor
    }
}