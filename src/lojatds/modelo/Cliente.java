/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.modelo;

/**
 * Classe que define um cliente com efetuação de compra na loja
 * @author Patrick, Rafael
 * @version 1.0 
 * @since 10/06/2016
 */
public class Cliente extends Pessoa{
    private int CPF;
   
    /**
     * Construtor da classe ClienteComprador
     * @param nome Nome do cliente
     * @param codigo Código para identificação 
     * @param CPF CPF do cliente
     * @exception Exception Verifica se está preenchido o nome
     */
    public Cliente(String nome, int codigo,int CPF) throws Exception {
        super(nome, codigo);
        if(nome == null || nome.equals("")){
            throw new Exception("Algo errado não esta certo");
         }
        this.CPF = CPF;
    }
    
   
    /**
     * Construtor default
     */
    public Cliente() {
        
    }

    
    
    /**
     * Construtor de cópia
     * @param a Objeto a ser copiado
     * @throws Exception Verifica se está preenchido o nome
     */
    public Cliente(Cliente a) throws Exception {
        super(a);
        this.CPF = a.CPF;
    }

    
    
    /**
     * Método getCPF
     * @return Retorna o CPF do cliente cadastrado
     */
    public int getCPF() {
        return CPF;
    }
    
    /**
     * Método setCPF 
     * @param CPF CPF do cliente cadastrado
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    /**
     * Método toString sobrescrevido
     * @return  String - nome, Int - Codigo, Int - CPF
     */
    @Override
    public String toString() {
        return getNome()+ " Codigo: " + getCodigo() + " CPF: " + CPF + "\n";
    } 
}
