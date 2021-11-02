/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import helpz.LoadSave;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import objects.Tile;

/**
 *
 * @author kaliw
 */
public class TileManager {
    
    public Tile GRASS, WATER, ROAD;
    public BufferedImage atlas;
    public ArrayList<Tile> tiles= new ArrayList<>();
    
    public TileManager(){
        loadAtlas();
        createTiles();
    }

    private void loadAtlas() {
        
        atlas= LoadSave.getSpriteAtlas();

    }

    public BufferedImage getSprites(int id){
        return tiles.get(id).getSprites();
    }
    private void createTiles() {
        GRASS =new Tile(getSprites(8, 1));
        WATER =new Tile(getSprites(0, 6));
        ROAD= new Tile(getSprites(9, 0));
        tiles.add(WATER);
        tiles.add(GRASS);
        
        tiles.add(ROAD);
        
    }
    private BufferedImage getSprites(int x, int y){
        return atlas.getSubimage(x*32, y*32, 32, 32);
    }
}
