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
public class Cliente {
    private String nome;
    private String Matricula;

    public Cliente(String nome, String Matricula) {
        this.nome = nome;
        this.Matricula = Matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    @Override
    public String toString() {
        
        //toUppercase - maiusculo 
        //toLowercase - minusculo
        return this.nome.toUpperCase() + ", " + this.Matricula.toLowerCase();
    }

    
   
    
}
