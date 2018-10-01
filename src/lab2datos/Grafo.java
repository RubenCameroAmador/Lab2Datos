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
    LinkedList<Vertice> lista; //= new LinkedList<Vertice>();
    
    public Grafo(){
       lista = new LinkedList<>();
    }
   
    public boolean validarNombre(String nombre){
        for (Vertice vertice : lista) 
            if(vertice.getNombre().equals(nombre))
                return true;
        return false;
    }
    public void addAdyacente(String nombreOrigen, String nombreDestino, String costo){
        Vertice temp=null;
        for (Vertice vertice : lista) 
            if(nombreDestino.equals(vertice.getNombre()))
                temp=vertice;
        if(temp!=null)
            for (Vertice vertice : lista) 
            if(vertice.getNombre().equals(nombreOrigen))
                vertice.addArista(temp.getSerial(), Integer.parseInt(costo));
    }
  
}
