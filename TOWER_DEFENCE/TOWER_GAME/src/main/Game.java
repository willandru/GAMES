/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import inputs.KeyBoard;
import inputs.Mouse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import jdk.jfr.SettingControl;
import scenes.Menu;
import scenes.Playing;
import scenes.Settings;

/**
 *
 * @author kaliw
 */
public class Game extends JFrame implements Runnable{
    
    private Screen gameScreen;
   
    private final double FPS_SET=120.0;
    private final double UPS_SET=60.0;
     
    private Mouse myMouse;
    private KeyBoard myKeyBoard;
    
    private Thread gameThread;
    
    
    //  CLASES
    private Render render;
    private Menu menu;
    private Playing playing;
    private Settings setts;
       
    
    
    public static void main(String[] args) {
        Game g=new Game();
        
        g.initInputs();
        g.start();
        
    }
    public Game(){

        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initClasses();
        
        
        add(gameScreen);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    private void initInputs(){
        myMouse= new Mouse();
        myKeyBoard= new KeyBoard();
        
        addMouseListener(myMouse);
        addMouseMotionListener(myMouse);
        addKeyListener(myKeyBoard);
        
        requestFocus();
    }

   
    
    



    @Override
    public void run() {
         double timePerFrame= 1000000000.0/FPS_SET; 
         long lastFrame= System.nanoTime();
        
         int updates=0;
         int frames=0;
         long lastTimeCheck= System.currentTimeMillis();
         
         double timePerUpdates=1000000000.0/UPS_SET; 
         long lastUpdate= System.nanoTime();
         
         long now;
         
         
        while(true){
            
            now=System.nanoTime();
            //RENDER
         if(now-lastFrame >= timePerFrame){
            lastFrame= now;
            repaint();
            frames++;
        }
         //UPDATE
         if(now-lastUpdate >= timePerUpdates){
               
                lastUpdate=now;
               updates++;
            }
         
        //CHECKING FPS AND UPS
         if(System.currentTimeMillis()-lastTimeCheck >=1000){
            System.out.println("FPS: "+frames+ " | UPS: "+ updates);
            frames=0;
            updates=0;
            lastTimeCheck=System.currentTimeMillis();
        }
         
         
    }
        
        
        
        
        

    }

    private void start() {
       gameThread = new Thread(this){};
       gameThread.start();
    }
     private void initClasses() {
        gameScreen= new Screen(this);
        render= new Render(this);
        menu = new Menu(this);
        playing= new Playing(this);
        setts= new Settings(this);
    }
    
    //SETTER & GETTER

    public Render getRender() {
        return render;
    }

    public Menu getMenu() {
        return menu;
    }

    public Playing getPlaying() {
        return playing;
    }

    public Settings getSetts() {
        return setts;
    }
    

   
    
    
    
}
