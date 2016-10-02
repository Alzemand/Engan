/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author acg
 */
public class Autor {
    private String nome;
    private String sobreNome;

    public Autor(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    @Override
    public String toString() {
        
        //toUppercase - maiusculo 
        //toLowercase - minusculo
        return this.nome.toUpperCase() + ", " + this.sobreNome.toLowerCase();
    }

    
   
    
}
