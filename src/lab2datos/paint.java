/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2datos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author rdcamero
 */
public class paint {
    
    static void drawOval(String nombre, Graphics g, int x, int y){
        g.setColor(Color.blue);
        g.drawOval(x, y, 60, 60);
        g.drawString(nombre, x+15, y+30);
        g.dispose();
    }
    
    private void  imagen(Graphics g){
        ImageIcon mapa = new ImageIcon(new ImageIcon(getClass().getResource("imagen/bquilla.png")).getImage()); 
        g.drawImage(mapa.getImage(),0 , 0, 200,200,null);
    }
    static boolean superPosicion(){
        return false;
    }
    
    
}
