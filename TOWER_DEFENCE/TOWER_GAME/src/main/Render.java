/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author kaliw
 */
public class Render {
    
    private Game renderGame;
     
    
    public Render(Game game){
        this.renderGame=game;
        
       
    }
    
    public void render(Graphics g){
        
        switch(GameStates.gameState){
            case MENU:
                renderGame.getMenu().render(g);
                break;
            case PLAYIN:
                renderGame.getPlaying().render(g);
                break;
            case SETTINGS:
                renderGame.getSetts().render(g);
                break;
            
        }
    }
}
