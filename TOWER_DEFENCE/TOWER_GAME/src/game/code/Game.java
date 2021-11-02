/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.code;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author kaliw
 */
public class Game extends JFrame{
    
    private Screen gameScreen;
    private BufferedImage img;
    
    public static void main(String[] args) {
        new Game();
    }
    public Game(){
        
        importImage();
        setSize(640,640);      
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        gameScreen= new Screen(img);
        add(gameScreen);
        
        
        setVisible(true);
        
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
