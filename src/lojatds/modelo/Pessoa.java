/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.modelo;

/**
 * Classe abstrata cliente com os atributos essenciais para um cliente se
 * cadastrar em uma loja.
 *
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
public abstract class Pessoa implements Comparable<Pessoa>, Cloneable {

    private String nome;
    private int codigo;

    /**
     * Construtor da classe Cliente;
     *
     * @param nome Nome do cliente a ser cadastrado
     * @param codigo Código para pesquisa ou cadastro de cliente
     * @throws Exception Verifica se está preenchido o nome
     */
    public Pessoa(String nome, int codigo) throws Exception {
        if (nome == null || nome.equals("")) {
            throw new Exception("Algo errado não esta certo");
        }
        this.nome = nome;
        this.codigo = codigo;
    }

    /**
     * Construtor default
     */
    public Pessoa() {
    }

    /**
     * Construtor de cópia;
     *
     * @param a Objeto do tipo cliente
     * @throws Exception Verifica se está preenchido o nome
     */
    public Pessoa(Pessoa a) throws Exception {
        this.nome = a.nome;
        if (nome == null || nome.equals("")) {
            throw new Exception("Algo errado não esta certo");
        }
        this.codigo = a.codigo;
    }

    /**
     * Método getNome
     *
     * @return Nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método getCodigo
     *
     * @return Código de cadastro do cliente
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método setNome
     *
     * @param nome Nome do cliente cadastrado
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método setCodigo
     *
     * @param codigo Código do cliente cadastrado
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método toString sobrescrevido
     *
     * @return Int - codigo, String - nome
     */
    @Override
    public String toString() {
        return codigo + "  " + nome;
    }

    /**
     * Método compareTo sobrescrito
     * @param o Objeto usado durante a comparação
     * @return 0 Se o objeto é igual, -1 se for menor ou 1 se for maior.
     */
    @Override
    public int compareTo(Pessoa o) {
        if (this.codigo > o.codigo) {
            return 1;
        }
        if (this.codigo < o.codigo) {
            return -1;
        }
        if (this.codigo == o.codigo) {
            return 0;
        }
        return 0;
    }

    /**
     * Método clone sobrescrito
     * @return Clone do objeto
     * @throws CloneNotSupportedException Objeto não pode ser clonado
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
