/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Autor;

/**
 *
 * @author victor
 */
public class daoAutor {
     private static List<Autor> autores= new ArrayList();

    public static void adicionar(Autor autor) {
        autores.add(autor);
    }
    
    public static void remover(Autor autor) {
        autores.remove(autor);
    }

    public static List<Autor> getAutores() {
        return autores;
    }
    
    // O motivo de utilizar esse for , é converter o a lista em String ;
    // porém não funciona jajajajaj.
    
     @Override
     public String toString(){
        String retornadado = "vazio";
        for(int i=0;this.autores.get(i) != null;i++){
            retornadado = this.autores.get(i).getNome() + " " +this.autores.get(i).getSobreNome() +";";
    }
        return retornadado;
    }

    
    
    
    
}
