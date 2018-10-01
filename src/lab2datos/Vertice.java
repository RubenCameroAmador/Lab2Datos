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
public class Vertice {
    final private String nombre;
    final private int x, y;
    LinkedList<Integer> adyacentes;
    
    public Vertice(String nombre, int x, int y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        adyacentes = new LinkedList<Integer>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public boolean superPosicion(int xFinal, int yFinal){
        int xInicial = this.getX();
        int yInicial = this.getY();
        Double norma = Math.sqrt(Math.pow(xFinal-xInicial, 2)+Math.pow(yFinal-yInicial,2));
        if(norma<=(2*60))
            return true;
        else            
        return false;
    }
    
}
