/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author edilson
 */
public class Ordem {
    Integer quantidade; 
    Calendar data;
    Double Investimento; 

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Double getInvestimento() {
        return Investimento;
    }

    public void setInvestimento(Double Investimento) {
        this.Investimento = Investimento;
    }
    
    
}
