/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.ArrayList;
import java.util.List;
import model.Acoes;


/**
 *
 * @author victor
 */
public class daoAcoes {
    private static List<Acoes> acoess = new ArrayList<>();
    
    public static void adicionar (Acoes acoes){
        acoess.add(acoes);
    }
    
    public static void remover(Acoes acoes){
        acoess.remove(acoes);
    }
    
    public static List<Acoes> getAcoes(){
        return acoess;
    }
}
