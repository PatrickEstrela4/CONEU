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
import lojatds.modelo.ClienteVIP;

/**
 * Classe para criar o banco de dados dos clientes VIP
 * @author Patrick, Rafael
 * @version 1.0
 * @since 10/06/2016
 */
public class ClientesVIPBD implements Banco<ClienteVIP>,Cloneable {
        
    private static final ClientesVIPBD INSTANCE = new ClientesVIPBD();
    private static List<ClienteVIP> clientesvip;
    
    /**
     * Construtor da classe
     */
    private ClientesVIPBD() {
        clientesvip = new LinkedList<>();
    }

    /**
     * Construtor de cópia
     * @param a Objeto a ser copiado
     */
    private ClientesVIPBD(ClientesVIPBD a){
        clientesvip = new LinkedList<>(a.clientesvip);
    }
    
    /**
     * Retorna a instância do objeto
     * @return Retorna a instância do objeto
     */
    public static ClientesVIPBD getINSTANCE() {
        return INSTANCE;
    }

    /**
     * Método para inserir um cliente VIP no banco de dados
     * @param cv Cliente VIP a ser cadastrado
     * @return  Retorna true para cliente VIP cadastrado e
     * false para cliente VIP não cadastrado
     */
    @Override
    public boolean cadastrar(ClienteVIP cv) {
        if (!clientesvip.contains(buscar(cv.getCodigo()))){    
            clientesvip.add(cv);
            Collections.sort(clientesvip);
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Método para remover um cliente VIP no banco de dados
     * @param cod Código do cliente VIP a ser removido
     * @return Retorna o cliente removido
     */
    @Override
    public ClienteVIP remover(int cod) {
        ClienteVIP a = buscar(cod);
        if(a != null){
            clientesvip.remove(a);
        }
        return a;
    }

    /**
     * Método para buscar um cliente VIP no banco de dados
     * @param cod Código do cliente VIP a ser buscado
     * @return Retorna o cliente VIP buscado
     */
    @Override
    public ClienteVIP buscar(int cod) {     
        ClienteVIP cv = new ClienteVIP();
        cv.setCodigo(cod);
        int i = Collections.binarySearch(clientesvip, cv);
        if (i >=0){
            return clientesvip.get(i);
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
        ClientesVIPBD copia = (ClientesVIPBD) super.clone();
        copia.clientesvip = new LinkedList<>();
        for (ClienteVIP a : clientesvip) {
            copia.cadastrar(a);
        }
        return copia;
    }

    /**
     * Método para listar os clientes VIP cadastrados no banco de dados
     * @return Todos os clientes VIP cadastrados
     */
    @Override
    public List<ClienteVIP> listar() {
        return new LinkedList<>(clientesvip);
    }
}
