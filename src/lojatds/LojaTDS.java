/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds;

import java.util.Locale;
import lojatds.modelo.Produto;
import lojatds.modelo.memoria.Banco;
import lojatds.modelo.memoria.ClienteFornecedorBD;
import lojatds.modelo.memoria.ClientesBD;
import lojatds.modelo.memoria.ProdutosBD;
import static lojatds.modelo.memoria.ProdutosBD.getProdutos;
import lojatds.modelo.Caixa;
import lojatds.modelo.Cliente;
import lojatds.modelo.Fornecedor;
import lojatds.modelo.Compra;
import lojatds.modelo.Venda;

/**
 *
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 * 
 */
public class LojaTDS {

    /**
     * Método main
     * @param args the command line arguments
     * @throws CloneNotSupportedException objeto não pode ser clonado.
     * @throws Exception Verifica se está preenchido o nome.
     */
    public static void main(String[] args) throws CloneNotSupportedException, Exception {
       
        ProdutosBD banco_produto = ProdutosBD.getINSTANCE();
        ClientesBD banco_cliente = ClientesBD.getINSTANCE();
        ClienteFornecedorBD banco_fornecedor = ClienteFornecedorBD.getINSTANCE();
        
        try{
            banco_cliente.cadastrar(new Cliente("Cliente 1", 001, 1000));
            banco_cliente.cadastrar(new Cliente("Cliente 2", 002, 1001));
            banco_cliente.cadastrar(new Cliente("Cliente 3", 003, 1002));
            banco_cliente.cadastrar(new Cliente("Cliente 4", 004, 1003));
            banco_cliente.cadastrar(new Cliente("Cliente 5", 005, 1004));
            banco_cliente.cadastrar(new Cliente("Cliente 6", 006, 1005));

            banco_fornecedor.cadastrar(new Fornecedor("Forncedor 1", 001, 2000));
            banco_fornecedor.cadastrar(new Fornecedor("Forncedor 2", 002, 2001));
            banco_fornecedor.cadastrar(new Fornecedor("Forncedor 3", 003, 2002));
            banco_fornecedor.cadastrar(new Fornecedor("Forncedor 4", 004, 2003));
            banco_fornecedor.cadastrar(new Fornecedor("Forncedor 5", 005, 2004));
            banco_fornecedor.cadastrar(new Fornecedor("Forncedor 6", 006, 2005));
        }catch(Exception a){
            System.out.println("Nome nao cadastrado");
        }
        
        try{
        banco_produto.cadastrar(new Produto("Produto 1", 001, 5, 1, 2));
        banco_produto.cadastrar(new Produto("Produto 2", 002, 5, 2, 4));
        banco_produto.cadastrar(new Produto("Produto 3", 003, 5, 3, 6));
        banco_produto.cadastrar(new Produto("Produto 4", 004, 5, 4, 8));
        banco_produto.cadastrar(new Produto("Produto 5", 005, 5, 5, 10));
        banco_produto.cadastrar(new Produto("Produto 6", 006, 5, 6, 12));
        }catch(Exception a){
            System.out.println("Nome nao cadastrado");
        }
        
        try{
            banco_cliente.cadastrar(new Cliente("", 007, 1000));
        }catch(Exception a){
            System.out.println("Nome nao cadastrado");
        }
        
        try{
            banco_fornecedor.cadastrar(new Fornecedor("", 007, 2000));
        }catch(Exception a){
            System.out.println("Nome nao cadastrado");
        }
        
        try{
            banco_produto.cadastrar(new Produto("", 007, 5, 1, 2));
        }catch(Exception a){
            System.out.println("Nome nao cadastrado");
        }
        
        Caixa.setCaixa(500);
        Compra lista_compra = new Compra(005);
        Venda lista_venda = new Venda(006);
        
        System.out.println("Clientes: ");
        System.out.println(banco_cliente.listar());
        System.out.println("\n-----------------------------------------\n");
        System.out.println("Fornecedores: ");
        System.out.println(banco_fornecedor.listar());
        System.out.println("\n-----------------------------------------\n");
        System.out.println("Produto: ");
        System.out.println(banco_produto.listar());
        System.out.println("\n-----------------------------------------\n");
        
        banco_cliente.remover(001);
        banco_fornecedor.remover(002);
        banco_produto.remover(003);
       
        System.out.println("Clientes: ");
        System.out.println(banco_cliente.listar());
        System.out.println("\n-----------------------------------------\n");
        System.out.println("Fornecedores: ");
        System.out.println(banco_fornecedor.listar());
        System.out.println("\n-----------------------------------------\n");
        System.out.println("Produto: ");
        System.out.println(banco_produto.listar());
        System.out.println("\n-----------------------------------------\n");

        lista_compra.addLista(002, 5);
        lista_compra.addLista(004, 6);
        lista_compra.addLista(006, 4);
        
        lista_venda.addLista(1, 2);
        lista_venda.addLista(3, 3);
        lista_venda.addLista(5, 1);
        
        
        
        System.out.println("\n-----------------------------------------\n");        
        lista_compra.notaFiscal();
        lista_venda.notaFiscal();
        
        lista_compra.finalizarCompra();
        lista_venda.finalizarVenda();
        System.out.println("\n-----------------------------------------\n");
        
        System.out.println("Caixa: R$" + Caixa.getCaixa());
        
    }
    
}
