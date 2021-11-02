/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import main.GameStates;
import static main.GameStates.*;

/**
 *
 * @author kaliw
 */
public class KeyBoard implements KeyListener {

    @Override
    public void keyTyped(KeyEvent ke) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyPressed(KeyEvent ke) {

        if (ke.getKeyCode()== KeyEvent.VK_A){
            GameStates.gameState=MENU;
        }
        if (ke.getKeyCode()== KeyEvent.VK_S){
            GameStates.gameState=SETTINGS;        }
        if (ke.getKeyCode()== KeyEvent.VK_D){
            GameStates.gameState=PLAYIN;        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        // TODO Auto-generated method stub
    }
    
}
