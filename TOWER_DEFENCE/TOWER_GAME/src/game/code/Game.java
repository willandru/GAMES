/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.code;

import javax.swing.JFrame;

/**
 *
 * @author kaliw
 */
public class Game extends JFrame{
    
    private Screen gameScreen;
    
    
    public static void main(String[] args) {
        new Game();
    }
    public Game(){
        setSize(640,640);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        gameScreen= new Screen();
        add(gameScreen);
        
        
        setVisible(true);
        
    }
    
}
