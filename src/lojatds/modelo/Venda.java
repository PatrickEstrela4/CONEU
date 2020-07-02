/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.modelo;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import static lojatds.modelo.memoria.ClientesBD.getClientes;
import lojatds.modelo.memoria.ProdutosBD;
import static lojatds.modelo.memoria.ProdutosBD.getProdutos;
import static lojatds.modelo.CompraEVenda.getLista;

/**
 * Classe que cria o objeto Venda
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
public class Venda extends CompraEVenda {  
    private Cliente cliente;

    /**
     * Construtor da classe
     * @param cod Código do cliente que realizou a venda 
     */
    public Venda(int cod) {
        this.cliente = buscaClienteNoBD(cod);
    }

    /**
     * Construtor defaut
     */
    public Venda() {
    }
    
    /**
     * Método para adicionar um produto na lista de venda
     * @param cod Código do produto
     * @param quant Quantidade do produto
     * @return True se produto cadastrado, false se produto não cadastrado
     * @throws CloneNotSupportedException Objeto não clonável
     */
    public boolean addLista(int cod,int quant) throws CloneNotSupportedException{
        if (getProdutos().contains(buscaProdutoNoBD(cod))){
            Produto a = (Produto) buscaProdutoNoBD(cod).clone();
            a.setQuantidade(quant);
            getLista().add(a);
            Collections.sort(getLista());
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Método para finalizar a compra e inserir 
     * os dados para o banco de dados
     */
    public void finalizarVenda(){
        for (Iterator<Produto> iterator = getLista().iterator(); iterator.hasNext();) {
            Produto next = iterator.next();
            buscaProdutoNoBD(next.getCodigo()).setQuantidade(buscaProdutoNoBD(next.getCodigo()).getQuantidade()
                    - next.getQuantidade());
        }
    }
    
    /**
     * Método para buscar o cliente no banco de dados
     * @param cod Código do cliente desejado
     * @return Cliente pesquisado no banco
     */
    public Cliente buscaClienteNoBD(int cod){
        for (Iterator<Cliente> iterator = getClientes().iterator(); iterator.hasNext();) {
                Cliente next = iterator.next();
                if (next.getCodigo() == cod){
                    return next;
                }
            }
        return null;
    }
    
    /**
     * Método para buscar o produto no banco de dados
     * @param cod Código do produto desejado
     * @return Produto pesquisado no banco
     */
    public Produto buscaProdutoNoBD(int cod) {
        for (Iterator<Produto> iterator = getProdutos().iterator(); iterator.hasNext();) {
            Produto next = iterator.next();
            if (next.getCodigo() == cod){
                return next;
            }
        }
        return null;
    }
    
    /**
     * Método para remover um produto no banco de dados
     * @param cod Código do produto a ser removido
     * @return Retorna o produto removido
     */
    public Produto remover(int cod) {
        Produto a = new Produto();
        for (Iterator<Produto> iterator = getLista().iterator(); iterator.hasNext();) {
            Produto next = iterator.next();
            if (next.getCodigo() == cod){
                a = next;
            }
        }
        
        if (a != null){
            getLista().remove(a);      
        }
        return a;
    }

    /**
     * Imprime uma nota fiscal da compra e 
     * os dados nescessarios
     */
    public void notaFiscal(){
        float total = 0;
        System.out.println("--------------");
        System.out.println(" Nota fistcal de venda");
        System.out.println("--------------");
        System.out.println("Cliente: " +  cliente.getNome()+ "  " + cliente.getCodigo());
        System.out.println("Produtos: ");
        for (Iterator<Produto> iterator = getLista().iterator(); iterator.hasNext();) {
                Produto next = iterator.next();
            System.out.println(next.getNome() + " " + next.getQuantidade() + " X " +
                                next.getPreco_de_venda() + " = " +
                                (next.getQuantidade() * next.getPreco_de_venda()));
            total= total + (next.getQuantidade() * next.getPreco_de_venda());
        }
        Caixa.venda(total);
        System.out.println("Total: " + total);
    } 
}
