/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2datos;

/**
 *
 * @author Ruben Camero
 */
public class Arista {
    final private int serial, costo;
    
    public Arista(int serial, int costo){
        this.serial=serial;
        this.costo=costo;
    }

    public int getSerial() {
        return serial;
    }

    public int getCosto() {
        return costo;
    }
    
}
