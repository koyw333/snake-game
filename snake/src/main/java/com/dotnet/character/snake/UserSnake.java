package com.dotnet.character.snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UserSnake extends Snake implements KeyListener {
    public UserSnake(){
        super();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if ((key == KeyEvent.VK_LEFT) ) {
            left();
        }
        if ((key == KeyEvent.VK_RIGHT) ) {
            right();
        }
        if ((key == KeyEvent.VK_UP) ) {
            up();
        }
        if ((key == KeyEvent.VK_DOWN) ) {
            down();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
