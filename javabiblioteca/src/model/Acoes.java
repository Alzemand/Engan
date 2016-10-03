/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acg
 */
public class Acoes  {
    
    private String nome;
    private String valor;
    private List<Cliente> clientes;

    public Acoes(String nome,String Valor, List <Cliente> clientes) {
        this.valor = Valor;
        this.nome = nome;
        this.clientes = clientes;
        

    }
    
    public Acoes (){
    }
    
    public void adicionarDados(String name , String Valor){
        this.nome=name;
        this.valor=Valor;
        
    }

    public String getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    
    public void adicionar(Object objeto) {
        clientes.add((Cliente) objeto);

    }

    
    public void remover(Object objeto) {
        clientes.remove((Cliente) objeto);

    }

    @Override
    public String toString() {
        return this.nome + "-"+this.valor ;
    }

    
    
}
