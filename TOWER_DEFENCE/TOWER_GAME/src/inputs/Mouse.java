/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author kaliw
 */
public class Mouse implements MouseListener, MouseMotionListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getButton()== MouseEvent.BUTTON1){
            System.out.println("Left button clicked");
        }
        if(me.getButton()== MouseEvent.BUTTON3){
            System.out.println("Right button clicked");
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent me) {
// TODO Auto-generated method stub    
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    // TODO Auto-generated method stub  
    }

    @Override
    public void mouseExited(MouseEvent me) {
    // TODO Auto-generated method stub
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        // TODO Auto-generated method stub
    }
    
}
