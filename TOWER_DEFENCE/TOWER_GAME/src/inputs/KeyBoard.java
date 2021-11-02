/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
            System.out.println("A key pressed");
        }
        if (ke.getKeyCode()== KeyEvent.VK_B){
            System.out.println("B key pressed");
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        // TODO Auto-generated method stub
    }
    
}
