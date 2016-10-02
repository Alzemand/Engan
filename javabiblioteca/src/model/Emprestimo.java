/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author acg
 */
public class Emprestimo  {
    private Cliente cliente;
    private List<Livro> livros;
    private Calendar data;
    private Calendar dataPrevistaDevolucao;
    private Calendar dataDevolucao;

    public Emprestimo(Cliente cliente, Livro livro) {
        this.cliente = cliente;
        livros = new ArrayList();
        this.livros.add(livro);
        
        data = Calendar.getInstance();
        
        dataPrevistaDevolucao = Calendar.getInstance();
        dataPrevistaDevolucao.add(Calendar.DAY_OF_MONTH, 7);
        
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Livro> getLivros() {
        return livros;
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

    public void adicionar(Object objeto) {
        livros.add((Livro) objeto);
    }

 
    public void remover(Object objeto) {
        livros.remove((Livro) objeto);
    }
    
    
    
    
}
