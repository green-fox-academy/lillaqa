package logic.graphics;

import logic.logic.AddCharacters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Board extends JComponent implements KeyListener {

    AddCharacters loadCharacters;
    int heroPosX;
    int heroPosY;
    String heroImage = "images/hero-down.png";

    int canMoveForward = (int) setMoveForward();

    public Object setMoveForward() {
        return canMoveForward;
    }


    public Board() {
        loadCharacters = new AddCharacters();
        heroPosX = 0;
        heroPosY = 0;
        setPreferredSize(new Dimension(500, 500));
        setVisible(true);
    }


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        MapReading map = new MapReading("maps/map2.txt", graphics);
        PositionedImage hero = new PositionedImage(heroImage, heroPosX, heroPosY);
        hero.draw(graphics);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(board);
    }





    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        /*if (e.getKeyCode() == KeyEvent.VK_UP) {
            heroPosY -= 50;
            heroImage = "images/hero-up.png";
            if ((canMoveForward = false) || (isEdgeOfMap = false)) {
                heroPosY += 50;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            heroPosY += 50;
            heroImage = "images/hero-down.png";
            if ((isEdgeOfMap = false) || (canMoveForward = false)) {
                heroPosY -= 50;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            heroPosX += 50;
            heroImage = "images/hero-right.png";
            if ((isEdgeOfMap = false) || (canMoveForward = false)) {
                heroPosX -= 50;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            heroPosX -= 50;
            heroImage = "images/hero-left.png";
            if ((isEdgeOfMap = false) || (canMoveForward = false)) {
                heroPosX += 50;
            }
        }
        if (heroPosY < 0) {
            isEdgeOfMap = false;
        } else if (heroPosY >= 500) {
            isEdgeOfMap = false;
        } else if (heroPosX >= 500) {
            isEdgeOfMap = false;
        } else if (heroPosX < 0) {
            isEdgeOfMap = false;
        }*/
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            heroPosY -= 50;
            heroImage = "images/hero-up.png";
            if ((heroPosY < 0) || (canMoveForward == 1)) {
                heroPosY += 50;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            heroPosY += 50;
            heroImage = "images/hero-down.png";
            if ((heroPosY >= 500) || (canMoveForward == 1)) {
                heroPosY -= 50;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            heroPosX += 50;
            heroImage = "images/hero-right.png";
            if ((heroPosX >= 500) || (canMoveForward == 1)) {
                heroPosX -= 50;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            heroPosX -= 50;
            heroImage = "images/hero-left.png";
            if ((heroPosX < 0) || (canMoveForward == 1)) {
                heroPosX += 50;
            }
        }


        repaint();
    }
}
