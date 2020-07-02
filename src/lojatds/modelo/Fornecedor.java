/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.modelo;

/**
 * Classe que define um fornecedor da loja.
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
public class Fornecedor extends Pessoa{
   
    private int CNPJ;
    
    /**
     * Construtor da classe ClienteFornecedor
     * @param nome Nome do cliente
     * @param codigo Código para identificação
     * @param CNPJ CNPJ do fornecedor
     * @exception Exception Verifica se está preenchido o nome
     */
    public Fornecedor(String nome, int codigo, int CNPJ) throws Exception {
        super(nome, codigo);
        if(nome == null || nome.equals("")){
            throw new Exception("Algo errado não esta certo");
         }
        this.CNPJ = CNPJ;
    }
    
    /**
     * Construtor default
     */
    public Fornecedor(){
        
    }
    
    /**
     * Construtor de cópia
     * @param a Objeto a ser copiado
     * @exception Exception Verifica se está preenchido o nome
     */
    public Fornecedor(Fornecedor a) throws Exception{
        super(a);
        this.CNPJ = a.CNPJ;
    }
    
       
    
    /**
     * Método getCNPJ
     * @return CNPJ Cliente cadastrado;
     */
    public int getCNPJ() {
        return CNPJ;
    }
    
    /**
     * Método setCNPJ
     * @param CNPJ CNPJ do cliente cadastrado
     */
    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * Método toString sobrescrevido
     * @return String - Nome, Int - Codigo, Int - CNPJ 
     */
    @Override
    public String toString() {
        return getNome() + " Codigo: " + getCodigo() + " CNPJ: " + CNPJ + "\n";
    }  
}
