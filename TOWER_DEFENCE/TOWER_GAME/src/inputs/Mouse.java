/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import main.Game;
import main.GameStates;

/**
 *
 * @author kaliw
 */
public class Mouse implements MouseListener, MouseMotionListener{
    
    private Game game;
    public Mouse(Game game){
        this.game=game;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getButton()== MouseEvent.BUTTON1){
            System.out.println("Mouse Pos: "+ me.getX()+":"+me.getY());
            
            switch(GameStates.gameState){
                case MENU:
                    game.getMenu().mouseClick(me.getX(),me.getY());
                    break;
                case PLAYIN:
                    game.getPlaying().mouseClick(me.getX(),me.getY());
                    break;
                case SETTINGS:
                    game.getSetts().mouseClick(me.getX(),me.getY());
                    break;
                default:
                    break;
            }
        }
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
        switch(GameStates.gameState){
                case MENU:
                    game.getMenu().mousePress(me.getX(),me.getY());
                    break;
                case PLAYIN:
                    game.getPlaying().mousePress(me.getX(),me.getY());
                    break;
                case SETTINGS:
                    game.getSetts().mousePress(me.getX(),me.getY());
                    break;
                default:
                    break;
            }
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    
         switch(GameStates.gameState){
                case MENU:
                    game.getMenu().mouseReleas(me.getX(),me.getY());
                    break;
                case PLAYIN:
                    game.getPlaying().mouseReleas(me.getX(),me.getY());
                    break;
                case SETTINGS:
                    game.getSetts().mouseReleas(me.getX(),me.getY());
                    break;
                default:
                    break;
            }
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
        switch(GameStates.gameState){
                case MENU:
                    game.getMenu().mouseMov(me.getX(),me.getY());
                    break;
                case PLAYIN:
                    game.getPlaying().mouseMov(me.getX(),me.getY());
                    break;
                case SETTINGS:
                    game.getSetts().mouseMov(me.getX(),me.getY());
                    break;
                default:
                    break;
            }
    }
    
}
