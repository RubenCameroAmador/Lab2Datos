/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2datos;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Ruben Camero
 */
public class Imagen extends javax.swing.JPanel {
    
    public Imagen(int x, int y){
        this.setSize(x, y);
    }
    public void paint(Graphics g){
        Dimension height = getSize();
        ImageIcon Img = new ImageIcon(getClass().getResource("/Imagen/bquilla.png"));
        g.drawImage(Img.getImage(), 0, 0, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
