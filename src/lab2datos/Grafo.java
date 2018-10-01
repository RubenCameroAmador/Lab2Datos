/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2datos;

import java.util.LinkedList;

/**
 *
 * @author rdcamero
 */
public class Grafo {
    static LinkedList<Vertice> lista = new LinkedList<Vertice>();
   
    private boolean validarNombre(String nombre){
        for (Vertice vertice : lista) 
            if(vertice.getNombre().equals(nombre))
                return true;
        return false;
    }
    static void addLista(String nombre, int x, int y){
        
    }
  
}
