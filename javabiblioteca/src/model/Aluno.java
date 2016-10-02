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
public class Aluno extends Cliente{
    private Integer matricula;

    public Aluno(Integer matricula, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return matricula;
    }
    

    
    
    
}
