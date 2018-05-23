package logic.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;

    public Board() {
        testBoxX = 72;
        testBoxY = 72;

        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(testBoxX, testBoxY, 72, 72);
        //PositionedImage image = new PositionedImage("images/floor.png", 300, 300); //TODO make this useable
        //image.draw(graphics); //TODO make this useable
    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
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
            testBoxY -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += 72;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            testBoxX += 72;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            testBoxX -= 72;
        }

        repaint();
    }
}