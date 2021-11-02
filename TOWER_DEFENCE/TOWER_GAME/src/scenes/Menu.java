/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import main.Game;

/**
 *
 * @author kaliw
 */
public class Menu extends Scene implements SceneMethods{

    private BufferedImage img;
    private ArrayList<BufferedImage> sprites = new ArrayList<>();
    private Random rdm;
    
    
    public Menu(Game gm) {
        super(gm);
        rdm = new Random();
         importImage();
        loadSprites();
    }

    
    
    @Override
    public void render(Graphics g) {
         for (int x=0; x<20; x++){
            for(int y=0; y<20; y++){ 
              g.drawImage(sprites.get(getRndInt()),x*32,y*32,null);
            }
        }
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
    
}
