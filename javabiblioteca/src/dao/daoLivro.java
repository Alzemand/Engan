/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.ArrayList;
import java.util.List;
import model.Livro;


/**
 *
 * @author victor
 */
public class daoLivro {
    private static List<Livro> livros = new ArrayList<>();
    
    public static void adicionar (Livro livro){
        livros.add(livro);
    }
    
    public static void remover(Livro livro){
        livros.remove(livro);
    }
    
    public static List<Livro> getLivros(){
        return livros;
    }
}
