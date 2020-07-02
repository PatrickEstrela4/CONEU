/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.modelo.memoria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lojatds.modelo.Produto;

/**
 * Classe para criar o banco de dados dos produtos
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
public class ProdutosBD implements Banco<Produto>, Cloneable{
 
    private static final ProdutosBD INSTANCE = new ProdutosBD();
    private static List<Produto> produtos;
    
    /**
     * Construtor da classe
     */
    private ProdutosBD() {
        produtos = new LinkedList <Produto>();
    }
    
    /**
     * Método getProdutos
     * @return Produtos listados
     */
    public static List<Produto> getProdutos() {
        return produtos;
    }

  
    /**
     * Retorna a instância do objeto
     * @return Retorna a instância do objeto
     */
    public static ProdutosBD getINSTANCE() {
        return INSTANCE;
    }
    

    /**
     * Construtor de cópia
     * @param a Objeto a ser copiado
     */
    private ProdutosBD(ProdutosBD a){
        produtos = new LinkedList<>(a.produtos);
    }
    
    /**
     * Metodo para efetuar uma compra de produto
     * @param quant Quantidade a ser comprada
     * @param cod Código do produto a sem comprado
     * @return Valor total da compra
     */
    public float compra(int quant, int cod){
        if (buscar(cod) != null){
            buscar(cod).setQuantidade(buscar(cod).getQuantidade() + quant);
            return  buscar(cod).getPreco_de_compra() * quant;
        }else{
            return 0;
        }
    }
    
    /**
     * Metodo para efetuar uma venda
     * @param quant Quantidade a ser vendida
     * @param cod Código do produto a ser vendido
     * @return Valor total da venda
     */
    public float venda(int quant, int cod){
        if(buscar(cod) != null){
            buscar(cod).setQuantidade(buscar(cod).getQuantidade() - quant);
            return  buscar(cod).getPreco_de_venda() * quant;
        }else{
            return 0;
        }
    }
    
    /**
     * Método para inserir um produto no banco de dados
     * @param p Produto a ser cadastrado
     * @return  Retorna true para produto cadastrado e
     * false para produto não cadastrado
     */
    @Override
    public boolean cadastrar(Produto p) {
        if (!produtos.contains(buscar(p.getCodigo()))){
            produtos.add(p);
            Collections.sort(produtos);
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Método para remover um produto no banco de dados
     * @param cod Código do produto a ser removido
     * @return Retorna o produto removido
     */
    @Override
    public Produto remover(int cod) {
        Produto a = buscar(cod);
        if(a != null){
            produtos.remove(a);
        }
        return a;
    }

    /**
     * Método para buscar um produto no banco de dados
     * @param cod Código do produto a ser buscado
     * @return Retorna o produto buscado
     */
    @Override
    public Produto buscar(int cod) {
       
       Produto p = new Produto();
       p.setCodigo(cod);
       int i = Collections.binarySearch(produtos, p);
       if (i >=0){
           return produtos.get(i);
       }else{
           //System.out.print("Produto nao cadastrado\n");
           return null;        
       }
        
    }
    /**
     * Método para clonar a lista
     * @return Clone da lista
     * @throws CloneNotSupportedException Objeto não pode ser clonado
     */
    @Override
    public Object clone() throws CloneNotSupportedException{
        ProdutosBD copia = (ProdutosBD) super.clone();
        copia.produtos = new LinkedList<>();
        for (Produto a : produtos) {
            copia.cadastrar(a);
        }
        return copia;
    }
    
    /**
     * Método para listar os clientes cadastrados no banco de dados
     * @return Todos os clientes cadastrados
     */
    @Override
    public List<Produto> listar() {
        return new LinkedList<>(produtos);
    }
}
