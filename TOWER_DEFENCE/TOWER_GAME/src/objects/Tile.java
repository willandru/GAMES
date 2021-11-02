/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.awt.image.BufferedImage;

/**
 *
 * @author kaliw
 */
public class Tile {
    
    private BufferedImage sp;
    
    public Tile(BufferedImage sprite){
        this.sp=sprite;
        
    }
    
    public BufferedImage getSprites(){
        return sp;
    }
    
}
