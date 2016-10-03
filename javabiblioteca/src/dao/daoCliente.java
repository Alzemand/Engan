/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author victor
 */
public class daoCliente {
     private static List<Cliente> clientes= new ArrayList();

    public static void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public static void remover(Cliente cliente) {
        clientes.remove(cliente);
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }
    
     @Override
     public String toString(){
        String retornadado = "vazio";
        for(int i=0;this.clientes.get(i) != null;i++){
            retornadado = this.clientes.get(i).getNome() + " " +this.clientes.get(i).getMatricula() +";";
    }
        return retornadado;
    }

    
    
    
    
}
