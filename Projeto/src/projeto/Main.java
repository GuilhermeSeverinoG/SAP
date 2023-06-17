/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guilhe
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Admin> admins = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<CartaoCredito> cartoes = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        Admin admin = new Admin();
        Cliente cliente = new Cliente();
        Usuario usuario = new Usuario();
        Produto produto = new Produto();
        CartaoCredito cartao = new CartaoCredito();
        Pedido pedido = new Pedido();
        
        int opcao1=0,opcaoAdmin=0,opcaoCliente=0, numPedido=0;
        String login,senha;
        
        while(opcao1!=4){
            System.out.println("**** Bem vindo ao sistema da loja ***** ");
            System.out.println("-----------------------------------------");
            System.out.println("|       1- Já possui uma conta?         |");
            System.out.println("|       2- Cadastrar admin              |");
            System.out.println("|       3- Cadastrar cliente            |");
            System.out.println("|       4- Sair                         |");
            System.out.println("-----------------------------------------");
            System.out.print("Digite uma opcao:");
            opcao1 = scan.nextInt();
        
            switch(opcao1){
                case 1:
                    System.out.println("************* Login  *************");
                    System.out.print("Inserir login: ");
                    login = scan.next();
                    System.out.print("Inserir senha: ");
                    senha = scan.next();
                    System.out.println("**********************************");
                    for (int i = 0; i < admins.size(); i++) {
                        if(admins.get(i).getLogin().contains(login) && admins.get(i).getSenha().contains(senha)){
                            if(usuario.verificarLogin()==true){
                                System.out.print("Admin logado com sucesso\n");
                                while(opcaoAdmin!=3){
                                    System.out.println("1- Cadastrar produto");
                                    System.out.println("2- Atualizar produto");
                                    System.out.println("3- Sair");
                                    opcaoAdmin = scan.nextInt();
                                    switch(opcaoAdmin){
                                        case 1:                  
                                            System.out.println("************ Cadastrar produtos ***********");
                                            System.out.print("Nome do produto: ");
                                            produto.setNome(scan.next());
                                            System.out.print("Valor unitario: ");
                                            produto.setValor(scan.nextDouble());
                                            System.out.println("*****************************************\n");
                                            produtos.add(produto);
                                            System.out.print("Produtos cadastradados:");
                                            for (int j = 0; j < produtos.size(); j++) {                                                         
                                                System.out.println("\nNome do produto:"+produtos.get(j).getNome()+
                                                                   "\n Valor unitario: R$"+produtos.get(j).getValor());
                                            }
                                            break;
                                        case 2:

                                        case 3:
                                        default:
                                            System.out.println("Erro!: Opçao invalida");
                                            break;
                                    }
                                }
                            }                                   
                        }else{
                            System.out.print("Admin não cadastrado");
                        }
                    }
                    for (int i = 0; i < clientes.size(); i++) {
                        if(clientes.get(i).getLogin().contains(login) && clientes.get(i).getSenha().contains(senha)){
                            if(usuario.verificarLogin()==true){
                                System.out.print("Cliente logado com sucesso");
                                while(opcaoCliente!=5){
                                    System.out.println("1- Atualizar perfil");
                                    System.out.println("2- Imprimir dados");
                                    System.out.println("3- Visualizar pedidos");
                                    System.out.println("4- Cadastrar cartao");
                                    System.out.println("5- Realizar pedido");
                                    System.out.println("6- Sair");
                                    opcaoCliente = scan.nextInt();
                                    switch(opcaoCliente){
                                        case 1:

                                        case 2:                            
                                            System.out.println(clientes.get(i).imprimirInfo());
                                            break;
                                        case 3:
                                            for (int j = 0; j < pedidos.size(); j++) {
                                                System.out.println(admins.get(i).getLogin()+"\n"+admins.get(i).getDataRegistro());
                                            }
                                        case 4:
                                            System.out.println("************ Cadastrar cartao ***********");
                                            System.out.print("Numero do cartao: ");
                                            cartao.setNumero(scan.next());
                                            System.out.print("Data de validade: ");
                                            cartao.setDtValidade(scan.next());                                   
                                            System.out.print("CCV: ");
                                            cartao.setCcv(scan.next());
                                            System.out.print("Escolha um titular: ");
                                            for (i= 0; i < clientes.size(); i++) {
                                                System.out.println("Clientes: "+ clientes.get(i).getNomeCliente());
                                            }
                                            cartao.setTitular(scan.next());
                                            System.out.println("*****************************************\n");
                                            cartoes.add(cartao);
                                            System.out.println("Cartoes cadastrados\n");
                                            System.out.println(cartoes.get(i).imprimirInfo());
                                            break;
                                        case 5:
                                            System.out.print("\nProdutos cadastradados:");
                                            for (int j = 0; j < produtos.size(); j++) {               
                                                System.out.println("Nome do produto:"+produtos.get(j).getNome()+
                                                                   "\n Valor unitario: R$"+produtos.get(j).getValor());
                                            }
                                            System.out.println("*****************************************\n");
                                            String produtoSelecionado;
                                            System.out.println("Compras:\n");
                                            System.out.println("Digite o nome de um produto:\n");
                                            produtoSelecionado= scan.next();
                                            if(produtos.contains(produtoSelecionado)){
                                                pedido.setNumPedido(numPedido++);
                                                System.out.println("Selecione a quantidade de produtos desejada:\n");
                                                pedido.setQuantidade(scan.nextInt());
                                                System.out.println("Escolha a forma de pagamento:\n");
                                                System.out.println("1-Cartao de credito\n");
                                                System.out.println("2-PIX\n");
                                                int formaPagamento=0;
                                                switch(formaPagamento){
                                                    case 1:
                                                        pedido.setFormaPagamento("Cartao de credito");
                                                        int qtdParcelas=0;
                                                        pedido.setFormaPagamento("Escolha um cartao");
                                                        System.out.println("Cartoes disponiveis\n");
                                                        System.out.println(cartoes.get(i).imprimirInfo());

                                                        System.out.println("Escolha a quantidade de parcelas:\n");
                                                        System.out.println("1x no cartao\n");
                                                        System.out.println("2x no cartao\n");
                                                        switch(qtdParcelas){
                                                            case 1:
                                                                qtdParcelas=1;
                                                                break;
                                                            case 2:
                                                                qtdParcelas=2;
                                                                break;
                                                            default:
                                                                System.out.println("Quantidade de parcelas invalida\n");
                                                        }
                                                        break;
                                                    case 2:
                                                        pedido.setFormaPagamento("PIX");
                                                        break;
                                                    default:
                                                        System.out.println("Forma de pagamento inválida\n");
                                                }
                                                pedidos.add(pedido);
                                            }else{
                                                System.out.println("Produto não cadastrado\n");
                                            }
                                            break;

                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Erro!: Opçao invalida");
                                            break;
                                    }
                                }
                            }  

                        }else{
                            System.out.print("Cliente não cadastrado");
                        }
                    }
                    break;
                case 2:
                    System.out.println("************* Cadastrar admin *************");
                    System.out.print("Criar Login: ");
                    admin.setLogin(scan.next());
                    System.out.print("Criar Senha: ");
                    admin.setSenha(scan.next());
                    System.out.print("Email: ");
                    admin.setEmail(scan.next());
                    System.out.print("Nome de usuario: ");
                    admin.setNomeAdmin(scan.next());
                    System.out.println("*******************************************\n");
                    admins.add(admin);
                    /*for (int i = 0; i < admins.size(); i++) {
                        System.out.println((i + 1) + " - " + "id: " + admins.get(i).getLogin()+"\n"+admins.get(i).getDataRegistro());
                    }*/
                    break;
                case 3:
                    System.out.println("************* Cadastrar cliente *************");
                    System.out.print("Criar Login: ");
                    cliente.setLogin(scan.next());
                    System.out.print("Criar Senha: ");
                    cliente.setSenha(scan.next());
                    System.out.print("Email: ");
                    cliente.setEmail(scan.next());
                    System.out.print("Nome de usuario: ");
                    cliente.setNomeCliente(scan.next());
                    System.out.print("Endereco: ");
                    cliente.setEndereco(scan.next());
                    clientes.add(cliente);
                    System.out.println("*******************************************\n");
                case 4:
                    break;
                default:
                    System.out.println("Erro!: Opçaoo invalida");
                    break;

            }
        }
        
    }
    
}
