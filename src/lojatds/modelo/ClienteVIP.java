package lojatds.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe do tipo cliente VIP, herda os métodos e 
 * parâmetros da classe cliente onde terá o tempo 
 * que o cliente é VIP. Por ser VIP terá uma porcentagem 
 * de desconto em uma compra.
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
public class ClienteVIP extends Cliente {
    private int tempo_Vip;
    private double desconto;

    /**
     * Construtor da classe ClienteVIP
     * @param nome Nome do cliente
     * @param codigo Código para identificação 
     * @param CPF CPF do cliente
     * @param tempo_Vip Número de meses que o cliente é um cliente VIP
     * @exception Exception Verifica se está preenchido o nome
     */
    public ClienteVIP(String nome, int codigo,int CPF, int tempo_Vip) throws Exception {
        super(nome, codigo, CPF);
        if(nome == null || nome.equals("")){
            throw new Exception("Nome nao Digitado");
         }
        this.tempo_Vip = tempo_Vip;
        this.desconto = tempo_Vip;
    }
    
    /**
     * Construtor de cópia
     * @param a Objeto a ser copiado
     * @exception Exception Verifica se está preenchido o nome
     */
    public ClienteVIP(ClienteVIP a) throws Exception {
        super(a);
        this.tempo_Vip = a.tempo_Vip;
        this.desconto = a.desconto;
    }
    
    /**
     * Construtor default
     */
    public ClienteVIP() {
        
    }

    
    
    /**
     * Método toString
     * @return Número de meses que um cliente é um cliente VIP
     */
    public int getTempo_Vip() {
        return tempo_Vip;
    }
    
    /**
     * Método toString
     * @return Quantidade de desconto
     */
    public double getDesconto() {
        return desconto;
    }
    
    /**
     * Método setTempo
     * @param tempo_Vip Número de meses que o cliente é VIP
     */
    public void setTempo_Vip(int tempo_Vip) {
        this.tempo_Vip = tempo_Vip;
    }

    /**
     * Método setDesconto
     * @param desconto Quantidade de desconto que um cliente tem.
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    /**
     * Método toString sobrescrevido
     * @return String - Nome, Int - Código, Int - CPF, Int - Tempo Vip, Double - Desconto
     */
    @Override
    public String toString() {
        return  getNome() + " " +getCodigo() + "  " + "CPF: " + getCPF() + 
                "Tempo de Vip " + tempo_Vip + "Desconto " + desconto;
    }
    
}
