/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.modelo.memoria;

import java.util.List;

/**
 * Classe do tipo interface para criar o banco de dados
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
public interface Banco<B>  {
    
    
     /**
     * Método para inserir um produto no banco de dados
     * @param b Produto a ser cadastrado
     * @return  Retorna true para produto cadastrado e
     * false para produto não cadastrado
     */
    boolean cadastrar(B b);
    
    /**
     * Método para remover um produto no banco de dados
     * @param cod Código do produto a ser removido
     * @return Retorna o produto removido
     */
    B remover(int cod);
    
    /**
     * Método para buscar um produto no banco de dados
     * @param cod Código do produto a ser buscado
     * @return Int - Produto buscado
     */
    B buscar(int cod); 
    
    /**
     * Método para listar os clientes cadastrados
     * @return Todos os clientes cadastrados
     */
    List<B> listar();
    
}
