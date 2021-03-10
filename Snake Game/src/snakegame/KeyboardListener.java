package snakegame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class KeyboardListener extends KeyAdapter{
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case 39: // -> Right
                // if its not the opposite direction
                if(ThreadsController.directionSnake!=2)
                    ThreadsController.directionSnake=1;
                break;
            
        }
    }
}
