/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.modelo;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import lojatds.modelo.memoria.ProdutosBD;

/**
 * Classe para definir os atributos de compra e venda
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
abstract class CompraEVenda {
    private int cod;
    private Date data;
    private static LinkedList<Produto> lista;


    
    
    
    /**
     * Construtor defaut
     */
    public CompraEVenda(){
       this.lista =  new LinkedList<>(); 
    }

    /**
     * Construtor defaut
     * @param cod codigo da compra
     * @param data data da compra
     */
    public CompraEVenda(int cod, Date data) {
        this.cod = cod;
        this.data = data;
        this.lista =  new LinkedList<>();
    }

    /**
     * Método getCodigo
     * @return Código da compra
     */
    public int getCod() {
        return cod;
    }

    /**
     * Método seCodigo
     * @param cod Código do compra
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * Método getData
     * @return Data da compra
     */
    public Date getData() {
        return data;
    }

    /**
     * Método setData
     * @param data Data da compra
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * Método getLista
     * @return Lista de compra
     */
    public static LinkedList<Produto> getLista() {
        return lista;
    }

    /**
     * Método setLista
     * @param lista Lista de compra
     */
    public static void setLista(LinkedList<Produto> lista) {
        CompraEVenda.lista = lista;
    }

    
    
    
}
