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
import lojatds.modelo.Cliente;

/**
 * Classe para criar o banco de dados dos clientes
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
public class ClientesBD implements Banco<Cliente>,Cloneable {
    
    private static final ClientesBD INSTANCE = new ClientesBD();
    private static List<Cliente> clientes;
    
    /**
     * Construtor da classe
     */
    private ClientesBD() {
        clientes = new LinkedList<>();
    }

    /**
     * Retorna a instância do objeto
     * @return Retorna a instância do objeto
     */
    public static ClientesBD getINSTANCE() {
        return INSTANCE;
    }
    
    /**
     * Construtor de cópia
     * @param a Objeto a ser copiado
     */
    private ClientesBD(ClientesBD a){
        clientes = new LinkedList<>(a.clientes);
    }

    /**
     * Método getClientes
     * @return Listas dos clientes cadastrados
     */
    public static List<Cliente> getClientes() {
        return clientes;
    }
    
    
    
    /**
     * Método para inserir um cliente no banco
     * @param c Cliente a ser cadastrado
     * @return Retorna true para cliente cadastrado e
     * false para cliente não cadastrado
     */
    @Override
    public boolean cadastrar(Cliente c) {
        if (!clientes.contains(buscar(c.getCodigo()))){    
            clientes.add(c);
            Collections.sort(clientes);
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Método para remover um cliente no banco
     * @param cod Código do cliente a ser removido
     * @return Retorna o cliente removido
     */
    @Override
    public Cliente remover(int cod) {
        Cliente a = buscar(cod);
        if(a != null){
            clientes.remove(a);
        }
        return a;
    }

    /**
     * Método para buscar um cliente no banco
     * @param cod Código do cliente a ser pesquisado
     * @return Retorna o cliente
     */
    @Override
    public Cliente buscar(int cod) {
        Cliente c = new Cliente();
        c.setCodigo(cod);
        int i = Collections.binarySearch(clientes, c);
        if (i >=0){
            return clientes.get(i);
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
        ClientesBD copia = (ClientesBD) super.clone();
        copia.clientes = new LinkedList<>();
        for (Cliente a : clientes) {
            copia.cadastrar(a);
        }
        return copia;
    }
    
    /**
     * Método para listar os clientes cadastrados
     * @return Todos os clientes cadastrados
     */
    @Override
    public List<Cliente> listar() {
        return new LinkedList<>(clientes);
    }


    
    
}
