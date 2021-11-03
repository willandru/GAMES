/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenes;

import UI.MyButton;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import main.Game;

import static main.GameStates.*;

/**
 *
 * @author kaliw
 */
public class Menu extends Scene implements SceneMethods{

    private BufferedImage img;
    private ArrayList<BufferedImage> sprites = new ArrayList<>();
    private Random rdm;
    private MyButton btnPlay, btnSetts, btnQuit;
    
    public Menu(Game gm) {
        super(gm);
        rdm = new Random();
         importImage();
        loadSprites();
        initButtons();
    }

    private void initButtons(){
        int w=150;
        int h=w/3;
        int x=640/2 - w/2;
        int y=150;
        int yOff=100;
        
        btnPlay= new MyButton("PLAY", x, y, w, h);
         btnSetts= new MyButton("SETTINGS", x, y+ yOff, w, h);
          btnQuit= new MyButton("MENU", x, y+2*yOff, w, h);
    }
    private void drawButtons(Graphics g){
        btnPlay.draw(g);
        btnSetts.draw(g);
        btnQuit.draw(g);
    }
    
    @Override
    public void render(Graphics g) {
         
        drawButtons(g);
        
        
    }
    
     private void loadSprites() {
for (int y=0; y<10; y++){
            for(int x=0; x<10; x++){ 
            sprites.add(img.getSubimage(x*32, y*32, 32, 32));
            }
        }
    }
    
       
    private int getRndInt(){
        return rdm.nextInt(100)  ;
    }
    
     private void importImage() {
        InputStream is = getClass().getResourceAsStream("/res/sprite.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void mouseClick(int x, int y) {
        if(btnPlay.getBounds().contains(x,y)){
            SetGameState(PLAYIN);
        }
        else if(btnSetts.getBounds().contains(x,y)){
            SetGameState(SETTINGS);
        }
        else if (btnQuit.getBounds().contains(x,y)){
            SetGameState(MENU);
        }
    }

    @Override
    public void mouseMov(int x, int y) {
       btnPlay.setMouseOver(false);
        btnSetts.setMouseOver(false);
         btnQuit.setMouseOver(false);
        if(btnPlay.getBounds().contains(x,y)){
            btnPlay.setMouseOver(true);
        }
        else if (btnSetts.getBounds().contains(x,y)){
             btnSetts.setMouseOver(true);
        }
        else if(btnQuit.getBounds().contains(x,y)){
            btnQuit.setMouseOver(true);
        }
        
    }

    @Override
    public void mousePress(int x, int y) {
        if(btnPlay.getBounds().contains(x,y)){
            btnPlay.setMousePressed(true);
        }
        else if (btnSetts.getBounds().contains(x,y)){
             btnSetts.setMousePressed(true);
        }
        else if(btnQuit.getBounds().contains(x,y)){
            btnQuit.setMousePressed(true);
        }
    }

    @Override
    public void mouseReleas(int x, int y) {
        resetButtons();

    }

    private void resetButtons() {
        btnPlay.resetBooleans();
        btnSetts.resetBooleans();
        btnQuit.resetBooleans();
    }
    
}
