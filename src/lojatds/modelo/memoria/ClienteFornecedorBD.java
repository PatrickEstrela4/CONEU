/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.modelo.memoria;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lojatds.modelo.Fornecedor;

/**
 * Classe para criar o banco de dados dos clientes fornecedores 
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
public class ClienteFornecedorBD implements Banco<Fornecedor>,Cloneable{
    private static final ClienteFornecedorBD INSTANCE = new ClienteFornecedorBD();
    private static List<Fornecedor> clientesFornecedores;
    
    /**
     * Construtor da classe
     */
    private ClienteFornecedorBD() {
        clientesFornecedores = new LinkedList<>();
    }

    /**
     * Construtor de cópia
     * @param a objeto a ser copiado
     */
    private ClienteFornecedorBD(ClienteFornecedorBD a){
        clientesFornecedores = new LinkedList<>(a.clientesFornecedores);
    }
    
    /**
     * Método para retornar a instância do objeto
     * @return Retorna a instância do objeto
     */
    public static ClienteFornecedorBD getINSTANCE() {
        return INSTANCE;
    }

    /**
     * Método para inserir um cliente fornecedor no banco
     * @param cf Cliente fornecedor a ser cadastrado
     * @return  Retorna true para cliente cadastrado e
     * false para cliente não cadastrado
     */
    @Override
    public boolean cadastrar(Fornecedor cf) {
        if (!clientesFornecedores.contains(buscar(cf.getCodigo()))){    
            clientesFornecedores.add(cf);
            Collections.sort(clientesFornecedores);
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Método para remover um cliente fornecedor no banco
     * @param cod Código do cliente fornecedor a ser removido
     * @return Retorna o cliente fornecedor removido
     */
    @Override
    public Fornecedor remover(int cod) {
        Fornecedor a = buscar(cod);
        if(a != null){
            clientesFornecedores.remove(a);
        }
        return a;
    }

    /**
     * Método para buscar um cliente fornecedor no banco
     * @param cod Código do cliente fornecedor a ser buscado
     * @return Retorna o cliente fornecedor buscado
     */
    @Override
    public Fornecedor buscar(int cod) {
        Fornecedor c = new Fornecedor();
        c.setCodigo(cod);
        int i = Collections.binarySearch(clientesFornecedores, c);
        if (i >=0){
            return clientesFornecedores.get(i);
        }else{
            //System.out.print("Produto nao cadastrado \n");
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
        ClienteFornecedorBD copia = (ClienteFornecedorBD) super.clone();
        copia.clientesFornecedores = new LinkedList<>();
        for (Fornecedor a : clientesFornecedores) {
            copia.cadastrar(a);
        }
        return copia;
    }
    
    
    /**
     * Método para listar os clientes fornecedores cadastrados
     * @return Todos os clientes fornecedores cadastrados
     */
    @Override
    public List<Fornecedor> listar() {
        return new LinkedList<>(clientesFornecedores);
    }

}
