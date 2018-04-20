package Drawing;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.BLACK;
import static java.awt.Color.RED;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MiddleLines {

    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new Example.ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainLine(graphics);
        }
    }

    public static void mainLine(Graphics graphics){
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.


        graphics.drawLine(1,1,1,160);
        graphics.setColor(Color.RED);
        graphics.drawLine(1,1,150,160);
        graphics.setColor(Color.GREEN);

    }
}
