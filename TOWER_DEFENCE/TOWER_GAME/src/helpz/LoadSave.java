/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpz;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author kaliw
 */
public class LoadSave {
    
    
    public static BufferedImage getSpriteAtlas(){
        BufferedImage img= null;
        
        InputStream is = LoadSave.class.getClassLoader().getResourceAsStream("res/sprite.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return img;
    }
}
