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
    LinkedList<Arista> aristas;
    public static int contID=0;
    int serial;
    
    public Vertice(String nombre, int x, int y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        aristas = new LinkedList<>();
        this.serial=contID++;
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

    public int getSerial() {
        return serial;
    }
    public void addArista(int serial, int costo){
        this.aristas.add(new Arista(serial, costo));
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
