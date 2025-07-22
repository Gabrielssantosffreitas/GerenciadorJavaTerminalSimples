package views;

import controller.*;
import controller.abstracts.ControllerClass;
import entity.*;
import entity.enums.TipoProduto;

import java.util.Random;
import java.util.Scanner;

public class TelaViews {
    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    public void init(){
        boolean activeLoop = true;
        while (activeLoop){
            //
            System.out.println("----| TELA INICIAL |----");
            System.out.println("1 Cadastrar cliente");
            System.out.println("2 Cadastrar vendedor ");
            System.out.println("3 Cadastrar produto");
            System.out.println("4 listar cliente");
            System.out.println("5 listar vendedor ");
            System.out.println("6 listar produto");
            System.out.println("7 efetuar venda");
            System.out.println("8 SAI ");

            // pegar o input e resertar a linha
            int opcion = 0;
            try {
                 opcion = scanner.nextInt();

            } catch (RuntimeException e) {
                System.out.println("\n ESSA ENTRA E INVADA DIGITE APANAS NUMEROS \n");;
            }finally {
                scanner.nextLine();
            }


            switch (opcion){
                case 1:
                    telaDeCadastroCliente();
                    break;
                case 2:
                    telaDeCadastroVendedor();
                    break;
                case 3:
                    telaDeCadastroProduto();
                    break;
                case 4:
                    telaListagemCliente();
                    break;
                case 5 :
                    telaListagemVendedor();
                    break;
                case 6:
                    telaListagemProduto();
                    break;
                case 7:
                    telaVenda();
                    break;
                case 8:
                    activeLoop = false;
                    break;
                default:
                    System.out.println("\n <><>\\  NUMERO INVALIDO \\<><><\n");

            }

        }
    }
    public void telaDeCadastroCliente(){
        System.out.println("-----|  CADESTRE UM CLIENTE  |-----");

        ClienteController clienteController = new ClienteController();
        Cliente cliente = null;
        try{
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Indereço: ");
            String indereco = scanner.nextLine();
            int id = random.nextInt();
            cliente = new Cliente(id,nome,indereco);

            clienteController.cadastrar(cliente);



        }catch (RuntimeException e){
            e.printStackTrace();
        }




    }
    public void telaDeCadastroVendedor(){
        System.out.println("-----|  CADESTRE UM VENDEDOR  |-----");
        Vendedor vendedor;
        VendedorController  vendedorController = new VendedorController();

        try{
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            int id = random.nextInt();
            vendedor = new Vendedor(id,nome);

            vendedorController.cadastrar(vendedor);

        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
    public void telaDeCadastroProduto(){
        System.out.println("-----|  CADESTRE UM PRODUTO  |-----");
        Produto produto;
        ControllerClass controller   = new ProdutoController();



        try{

            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("descrisao: ");
            String desc = scanner.nextLine();

            TipoProduto tipoProduto;

            System.out.println("tipo 1-casa ou 2-infromatica");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            if (tipo > 2){
                System.out.println("para o tipo escola 1 ou 2 ");

                System.out.println("tipo 1-casa ou 2-infromatica");
                tipo = scanner.nextInt();
                scanner.nextLine();
            }
            switch (tipo){
                case 1:
                    tipoProduto = TipoProduto.CASA;
                    break;
                case 2:
                    tipoProduto = TipoProduto.INFORMATICA;
                    break;
                default:
                    System.out.println("numero errado tente Novamente");
                    return;

            }
            int id = random.nextInt();

            produto = new Produto(id,nome,desc,tipoProduto);
            controller.cadastrar(produto);

        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
    public void telaListagemCliente(){
        System.out.println("-----|    CLIENTES    |-----");

        ControllerClass controller = new ClienteController();

        for (int i = 0; i <controller.listar().size(); i++) {
            System.out.println(controller.listar().get(i));

        }
    }
    public void telaListagemVendedor(){
        System.out.println("-----|     VENDEDORES    |-----");
        ControllerClass controller = new VendedorController();

        for (int i = 0; i <controller.listar().size(); i++) {
            System.out.println(controller.listar().get(i));

        }
    }
    public void telaListagemProduto(){
        System.out.println("-----|    PRODUTOS    |-----");
        ControllerClass controller = new ProdutoController();

        for (int i = 0; i <controller.listar().size(); i++) {
            System.out.println(controller.listar().get(i));

        }
    }
    public void telaVenda(){
        System.out.println("-----|FAÇA UMA BOA VENDA|-----");
        ControllerClass controllerV = new VendaController();
        ControllerClass controllerC = new CompraController();
        ControllerClass controllervendedor = new VendedorController();
        ControllerClass controllerCliente = new ClienteController();
        ControllerClass controllerP = new ProdutoController();

        Venda venda;
        Compra compra;




        try {
            System.out.println("qual vendedores fez a venda ");
            System.out.println("vendedores");
            for (int i = 0; i < controllervendedor.listar().size(); i++) {
                System.out.println(controllervendedor.listar().get(i));
            }
            System.out.println("id do vendedor: ");
            int idVendedor = scanner.nextInt();
            scanner.nextLine();
            System.out.println("nome do vendedor ");
            String nomeDoVendedor = scanner.nextLine();

            System.out.println("qual cliente  fez a compra ");
            System.out.println("clientes");
            for (int i = 0; i < controllerCliente.listar().size(); i++) {
                System.out.println(controllerCliente.listar().get(i));
            }
            System.out.println("id do cliete : ");
            int idCliente = scanner.nextInt();
            scanner.nextLine();
            System.out.println("nome do cliente");
            String nomeDoCliente = scanner.nextLine();
            System.out.println("indereco do cliente");
            String inderocoCliente = scanner.nextLine();

            System.out.println(" qual foi o produto vendido");
            for (int i = 0; i < controllerP.listar().size(); i++) {
                System.out.println(controllerP.listar().get(i));

            }

            System.out.println(" qual e o id do produto; ");
            int idProduto = scanner.nextInt();
            scanner.nextLine();
            System.out.println(" nome:  ");
            String nomeP = scanner.nextLine();
            System.out.println("qual o tipo 1-casa ou 2-informatica");
            int tipo = scanner.nextInt();
            scanner.nextLine();
            TipoProduto tipoP = null;
            if (tipo > 2 || tipo < 1){
                System.out.println("nao existe esse tipo tente novamente");
                return;
            }
            if (tipo == 1){
                tipoP = TipoProduto.CASA;
            }

            if (tipo == 2){
                tipoP = TipoProduto.CASA;
            }

            Produto produto = new Produto(idProduto,nomeP,null,tipoP);
            Vendedor vendedor = new Vendedor(idVendedor,nomeDoVendedor);
            Cliente cliente = new Cliente(idCliente,nomeDoCliente,inderocoCliente);

            String descricao = null;


            venda = new Venda(random.nextInt(),vendedor,produto,descricao);
            System.out.println(vendedor);
            compra = new Compra(random.nextInt(), cliente,produto,descricao);
            controllerV.cadastrar(venda);
            controllerC.cadastrar(compra);

            System.out.println("Relatorio venda funcionario");
            for (int i = 0; i <controllerV.listar().size(); i++) {
                System.out.println(controllerV.listar().get(i));
            }
            System.out.println("Relatorio compra  cliente ");
            for (int i = 0; i <controllerC.listar().size(); i++) {
                System.out.println(controllerC.listar().get(i));

            }


        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }
}
