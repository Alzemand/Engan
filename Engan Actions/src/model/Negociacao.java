/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.ManipulaNegociacao;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author acg
 */
public class Negociacao implements ManipulaNegociacao{
    private Cliente cliente;
    private List<Acoes> acoes;
    private Calendar data;

    public Negociacao(Cliente cliente, Acoes acoes) {
        this.cliente = cliente;
     //   acoes = new ArrayList();
        this.acoes.add(acoes);
        
        data = Calendar.getInstance();
        
        
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Acoes> getAcoes() {
        return acoes;
    }

    public Calendar getData() {
        return data;
    }

    @Override
    public void adicionar(Object objeto) {
        acoes.add((Acoes) objeto);
    }

    @Override
    public void remover(Object objeto) {
        acoes.remove((Acoes) objeto);
    }
    
    @Override
    public String toString() {
        return this.cliente.getNome();
    }
    
}
