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
public class Livro  {

    private String isbn;
    private String nome;
    private List<Cliente> autores;
    private Genero genero;

    public Livro(String nome,String isbn, List <Cliente> autores, Genero genero) {
        this.isbn = isbn;
        this.nome = nome;
        this.autores = autores;
        

    }
    
    public Livro (){
    }
    
    public void adicionarDados(String name , String Isbn){
        this.nome=name;
        this.isbn=Isbn;
        
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getAutores() {
        return autores;
    }

    
    public void adicionar(Object objeto) {
        autores.add((Cliente) objeto);

    }

    
    public void remover(Object objeto) {
        autores.remove((Cliente) objeto);

    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return this.nome + "-"+this.isbn ;
    }

    
    
}
