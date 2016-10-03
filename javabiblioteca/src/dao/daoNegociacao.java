/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Negociacao;
import model.Acoes;

/**
 *
 * @author acg
 */
public class daoNegociacao {

    private static List<Negociacao> negociacoes = new ArrayList();

    public static void adicionar(Negociacao negociacao) {
        negociacoes.add(negociacao);
    }

    public static void remover(Negociacao negociacao) {
        negociacoes.remove(negociacao);
    }

    public static List<Negociacao> getNegociacao() {
        return negociacoes;
    }

    

}
