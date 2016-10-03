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
public class Empresa {
    private String nome;
    private String CNPJ;

    public Empresa(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    @Override
    public String toString() {
        
        //toUppercase - maiusculo 
        //toLowercase - minusculo
        return this.nome.toUpperCase() + ", " + this.CNPJ.toLowerCase();
    }

    
   
    
}
