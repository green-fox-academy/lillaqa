package logic.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;

    public Board() {
        testBoxX = 50;
        testBoxY = 50;

        setPreferredSize(new Dimension(500, 500));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(testBoxX, testBoxY, 50, 50);
        PositionedImage image = new PositionedImage("images/floor.png", 0, 0);
        image.draw(graphics);
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
            testBoxY -= 50;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += 50;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            testBoxX += 50;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            testBoxX -= 50;
        }

        repaint();
    }
}