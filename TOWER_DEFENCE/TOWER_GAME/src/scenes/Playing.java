/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenes;

import helpz.LevelBuilder;
import java.awt.Color;
import java.awt.Graphics;
import main.Game;
import managers.TileManager;

/**
 *
 * @author kaliw
 */
public class Playing extends Scene implements SceneMethods{
    private int[][] lvl;
    private TileManager tm;

    public Playing(Game gm) {
        super(gm);
        
        lvl= LevelBuilder.getLevelData();
        tm= new TileManager();
    }

    @Override
    public void render(Graphics g) {
        
       for(int y=0; y<20; y++){
           for(int x=0; x<20; x++){
               int id= lvl[y][x];
               g.drawImage(tm.getSprites(id), x*32, y*32, null);
           
       }
       }
    }

    @Override
    public void mouseClick(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMov(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePress(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleas(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
