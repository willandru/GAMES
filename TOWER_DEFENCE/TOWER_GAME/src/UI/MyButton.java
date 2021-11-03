/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author kaliw
 */
public class MyButton {
    
    private int x,y,width,height;
    private String text;
    private Rectangle bounds;
    boolean mouseOver, mousePressed, mouseReleased;
    
    public MyButton(String text, int x, int y, int width, int height){
        
        this.text=text;
        this.x=x;
        this.y=y;
        this.width=width;
        this.height= height;
        
        initBounds();
        
    }
    public Rectangle getBounds(){
        return bounds;
    }
    public void draw(Graphics g){
       
        
        //BODY
        drawBody(g);
        
        
        //BORDER
        drawBorder(g);
        
        //TEXT
        drawText(g);
        
    }

    private void drawBorder(Graphics g){
        
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);
        if (mousePressed ){
            g.drawRect(x+1, y+1, width-2, height-2);
            g.drawRect(x+2, y+2, width-4, height-4);
        }
        
    }
    public void setMousePressed(boolean pressed){
        this.mousePressed=pressed;
    }
    public void setMouseReleased(boolean released){
        this.mouseReleased=released;
    }
    
    private void drawBody(Graphics g){
        if(mouseOver){
            g.setColor(Color.gray);
        }
        else{
            g.setColor(Color.white);
        }
        g.fillRect(x, y, width, height);
    }
    public void setMouseOver(boolean over){
        this.mouseOver=over;
    }
    private void drawText(Graphics g){
        int w= g.getFontMetrics().stringWidth(text);
        int h= g.getFontMetrics().getHeight();
        g.drawString(text, x-w/2+width/2, y+h/2+height/2);
    }
    private void initBounds() {
    this.bounds= new Rectangle(x, y, width, height);
    }
    
    public void resetBooleans(){
        //this.mouseOver=false;
        this.mousePressed=false;
    }
    
}
