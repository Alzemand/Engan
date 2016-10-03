/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Empresa;

/**
 *
 * @author victor
 */
public class daoEmpresa {
     private static List<Empresa> empresas= new ArrayList();

    public static void adicionar(Empresa empresa) {
        empresas.add(empresa);
    }
    
    public static void remover(Empresa empresa) {
        empresas.remove(empresa);
    }

    public static List<Empresa> getEmpresas() {
        return empresas;
    }
    
    // O motivo de utilizar esse for , é converter o a lista em String ;
    // porém não funciona jajajajaj.
    
     @Override
     public String toString(){
        String retornadado = "vazio";
        for(int i=0;this.empresas.get(i) != null;i++){
            retornadado = this.empresas.get(i).getNome() + " " +this.empresas.get(i).getCNPJ() +";";
    }
        return retornadado;
    }

    
    
    
    
}
