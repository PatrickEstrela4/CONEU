/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.modelo;

/**
 * Classe que especifíca um produto cadastrado no estoque
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
public class Produto implements Comparable<Produto>, Cloneable {
    
    private String nome;
    private int quantidade;
    private int codigo;
    private float preco_de_compra;
    private float preco_de_venda;

    /**
     * Construtor default
     */
    public Produto() {
    }

    /**
     * Método para clonar o objeto
     * @return Clone do objeto
     * @throws CloneNotSupportedException Nao epossivel clonar um objeto
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    
    /**
     * Construtor da classe Produto, que define as principais características dos produtos
     * @param nome Nome do produto a cadastrar
     * @param codigo Código do produto a cadastrar
     * @param quantidade Quantidade do produto a cadastrar
     * @param preco_de_compra Preço do produto que foi comprado
     * @param preco_de_venda Preço do produto a ser vendido
     * @exception Exception Verifica se está preenchido o nome
     */
    public Produto(String nome, int codigo, int quantidade, float preco_de_compra, float preco_de_venda) throws Exception {
        this.nome = nome;
        if(nome == null || nome.equals("")){
            throw new Exception("Algo errado não esta certo");
        }
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.preco_de_compra = preco_de_compra;
        this.preco_de_venda = preco_de_venda;
    }

    /**
     * Construtor de cópia
     * @param a Objeto a ser copiado
     */
    public Produto(Produto a){
        this.nome = a.nome;
        this.quantidade = a.quantidade;
        this.codigo = a.codigo;
        this.preco_de_compra = a.preco_de_compra;
        this.preco_de_venda = a.preco_de_venda;
    }
    
    /**
     * Método getNome
     * @return Nome do produto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método setNome
     * @param nome Nome do produto cadastrado
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método getQuantidade
     * @return Quantidade do produto em estoque
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Metodo setQuantidade
     * @param quantidade Quantidade de produto no estoque
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Método getCodigo
     * @return Código do produto cadastrado
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método setCodigo
     * @param codigo Código do produto cadastrado
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método getPreço_de_compra 
     * @return Preço do produto que foi comprado
     */
    public float getPreco_de_compra() {
        return preco_de_compra;
    }

    /**
     * Método setPreco_de_compra
     * @param preco_de_compra valor do produto comprado
     */
    public void setPreco_de_compra(float preco_de_compra) {
        this.preco_de_compra = preco_de_compra;
    }

    /**
     * Método getPreco_de_venda
     * @return Retorna o valor que o produto será vendido
     */
    public float getPreco_de_venda() {
        return preco_de_venda;
    }

    /**
     * Método setPreco_de_venda
     * @param preco_de_venda Valor do produto que será venddo
     */
    public void setPreco_de_venda(float preco_de_venda) {
        this.preco_de_venda = preco_de_venda;
    }

    /**
     * Método toString sobrescrito
     * @return String - Nome, Int - Código, Int - Quantidade, Float - Preço de compra, Float - Preço de venda
     * EX: Caderno: 002 Quantidade: 5 Preço de compra: 10,00 Preço de venda: 15,00
     */
    @Override
    public String toString() {
        return  nome + " " + "Codigo: " +codigo + " Quantidade: " + quantidade + " Preco de Compra: "
                + preco_de_compra + " Preco de Venda: " + preco_de_venda + "\n";
    }
    
    /**
     * Método compareTo sobrescrito
     * @param o Objeto usado durante a comparação
     * @return 0 se o objeto é igual, -1 se for menor ou 1 se for maior.
     */
    @Override
    public int compareTo(Produto o) {
        if(this.codigo > o.codigo){
            return 1;
        }
        if(this.codigo < o.codigo){
            return -1;
        }
        if(this.codigo == o.codigo){
            return 0;
        }
        return 0;  
    }  
}
