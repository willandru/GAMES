/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenes;

import main.Game;

/**
 *
 * @author kaliw
 */
public class Scene {
    private Game game;
    
    public Scene(Game gm){
        this.game= gm;
    }

    public Game getGame() {
        return game;
    }
    
    
}
