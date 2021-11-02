/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.code;

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
    
    private Random rdm;
    private BufferedImage img;
    private ArrayList<BufferedImage> sprites = new ArrayList<>();
  
   private Dimension size;

    public Screen(BufferedImage image) {
        rdm = new Random();
        this.img=image;
        loadSprites();
    
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
       
       //g.drawRect(50, 50, 100, 100);
        
        for (int x=0; x<20; x++){
            for(int y=0; y<20; y++){ 
              g.drawImage(sprites.get(getRndInt()),x*32,y*32,null);
            }
        }   
        
       
      
        

    }
   
  
    
    private Color getRndColor(){
        int r,g,b;
        r=rdm.nextInt(255);
        g=rdm.nextInt(255);
        b=rdm.nextInt(255);
        
        return new Color(r,g,b);
    }
    
    private int getRndInt(){
        return rdm.nextInt(100)  ;
    }

    private void loadSprites() {
for (int y=0; y<10; y++){
            for(int x=0; x<10; x++){ 
            sprites.add(img.getSubimage(x*32, y*32, 32, 32));
            }
        }
    }
    
}
