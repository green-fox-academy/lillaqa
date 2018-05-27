package logic.graphics;

import logic.characters.Characters;
import logic.characters.Hero;
import logic.logic.AddCharacters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {

    int heroPosX;
    int heroPosY;
    AddCharacters loadCharacters;
    boolean canMoveToNextTile = true;
    String heroImage = "images/hero-down.png";

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
        MapReading map = new MapReading("maps/map1.txt", graphics);
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
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            heroPosY -= 50;
            heroImage = "images/hero-up.png";
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            heroPosY += 50;
            heroImage = "images/hero-down.png";
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            heroPosX += 50;
            heroImage = "images/hero-right.png";
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            heroPosX -= 50;
            heroImage = "images/hero-left.png";
        }

        repaint();
    }
}