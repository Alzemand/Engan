/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Genero;

/**
 *
 * @author acg
 */
public class daoGenero {

    private static List<Genero> generos = new ArrayList();

    public static void adicionar(Genero genero) {
        generos.add(genero);
    }

    public static void remover(Genero genero) {
        generos.remove(genero);
    }

    public static List<Genero> getGeneros() {
        return generos;
    }

}
