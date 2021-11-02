/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author kaliw
 */
public class Screen extends JPanel{
    
    
   
    private Game game;
   private Dimension size;
   
   private Render render;

    public Screen(Game game) {
        
      
        render= new Render(this);
        this.game=game;
        
        
    
        setPanelSize();
        
        
    }
    
    private void setPanelSize(){
      size= new Dimension(640,640);
        setMaximumSize(size);
        setPreferredSize(size);
        setMinimumSize(size);
    }

    /**
     *
     * @param g
     */
    @Override
   protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
       
        render.render(g);
       //g.drawRect(50, 50, 100, 100);
        
          

    }
   
  
 
 
    
    
}
