/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2datos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author rdcamero
 */
public class Paint {
    
    static void drawOval(String nombre, Graphics g, int x, int y){
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 60, 60);
        g.setColor(Color.WHITE);
        g.drawString(nombre, x+15, y+30);
        g.dispose();
    }
    
        static void drawEdge(Vertice Vo, Vertice Vf/*,int costo,*/, Graphics g){
        int Xo = Vo.getX();
        int Yo = Vo.getY();
        int Xf = Vf.getX();
        int Yf = Vf.getY();
        //Double norma = Math.sqrt(Math.pow(Xf-Xo, 2)+Math.pow(Yf-Yo,2));
        g.setColor(Color.BLACK);
        g.drawLine(Xo, Yo, Xf, Yf);
            System.out.println("entro al dibujar");
        
    }
    static void drawAll(Grafo grafo, Graphics g, JPanel panel){
        //Aqui debe ir la imagen de la ciudad 
        g.clearRect(0, 0, panel.getWidth(), panel.getHeight());
        //investigar cual es el color firme 
        g.setColor(Color.gray);
        g.fillRect(0, 0, panel.getWidth(), panel.getHeight());
        Vertice vertice2 = null;
        for (Vertice vertice1 : grafo.lista) {
            for (Arista arista : vertice1.aristas) {
                vertice2 = grafo.convertirSerial(arista.getSerial());
                drawEdge(vertice1, vertice2, g);
            }
        }
        for (Vertice vertice : grafo.lista) {
            drawOval(vertice.getNombre(), g, vertice.getX(), vertice.getY());
        }
    }
    private void  imagen(Graphics g){
        ImageIcon mapa = new ImageIcon(new ImageIcon(getClass().getResource("imagen/bquilla.png")).getImage()); 
        g.drawImage(mapa.getImage(),0 , 0, 200,200,null);
    }
    
    
    
}
