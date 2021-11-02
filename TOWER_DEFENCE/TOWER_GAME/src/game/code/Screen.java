/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.code;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author kaliw
 */
public class Screen extends JPanel{

    public Screen() {
    }

    /**
     *
     * @param g
     */
    @Override
   protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        //g.drawRect(50, 50, 100, 100);
        g.setColor(Color.red);
        g.fillRect(0, 0, 32, 32);
        g.fillRect(32, 0, 32, 32);
    }
    
    
    
}
