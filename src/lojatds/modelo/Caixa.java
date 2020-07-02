/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.modelo;

/**
 * Classe Caixa que controla o fluxo de caixa
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
public class Caixa {
    
    private static float caixa;

    /**
     * Construtor de objeto
     * @param caixa Valor inicial do Caixa
     */
    public Caixa(float caixa) {
        this.caixa = caixa;
    }

    /**
     * Método getCaixa
     * @return Valor em caixa
     */
    public static float getCaixa() {
        return caixa;
    }
    
    /**
     * Método adiciona o valor da compra no caixa
     * @param a Valor total da compra
     */
    static void compra(float a){
        Caixa.caixa -= a;
    }
    
    /**
     * Método adiciona o valor da venda no caixa
     * @param a Valor total da venda
     */
    static void venda(float a){
        Caixa.caixa += a;
    }
    
    /**
     * Método setCaixa
     * @param caixa Valor de caixa
     */
    public static void setCaixa(float caixa) {
       Caixa.caixa = caixa;
    }


}
