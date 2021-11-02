/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenes;

import java.awt.Color;
import java.awt.Graphics;
import main.Game;

/**
 *
 * @author kaliw
 */
public class Settings extends Scene implements SceneMethods{

    public Settings(Game gm) {
        super(gm);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(0, 0, 600, 600);    }
    
}
