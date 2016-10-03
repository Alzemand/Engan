/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Cliente{
    private String nome;
    private String matricula;

    public Cliente(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        
        //toUppercase - maiusculo 
        //toLowercase - minusculo
        return this.nome.toUpperCase() + ", " + this.matricula.toLowerCase();
    }

    
   
    
}
