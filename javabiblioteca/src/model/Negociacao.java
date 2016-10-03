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
    private Calendar dataPrevistaDevolucao;
    private Calendar dataDevolucao;

    public Negociacao(Cliente cliente, Acoes acoes) {
        this.cliente = cliente;
     //   acoes = new ArrayList();
        this.acoes.add(acoes);
        
        data = Calendar.getInstance();
        
        dataPrevistaDevolucao = Calendar.getInstance();
        dataPrevistaDevolucao.add(Calendar.DAY_OF_MONTH, 7);
        
        
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

    public Calendar getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    @Override
    public void adicionar(Object objeto) {
        acoes.add((Acoes) objeto);
    }

    @Override
    public void remover(Object objeto) {
        acoes.remove((Acoes) objeto);
    }
    
    public void finalizarEmprestimo() {
        this.dataDevolucao = Calendar.getInstance();
    }
    
    
    @Override
    public String toString() {
        return this.cliente.getNome();
    }
    
}
