package Drawing;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FourRectagles {

    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.GREEN);
        graphics.fillRect(15,15,25,25);

        graphics.setColor(Color.getHSBColor(120,89,42));
        graphics.drawRect(40,40,25,25);

        graphics.setColor(Color.RED);
        graphics.drawLine(80,80,80,130);
        graphics.drawLine(80,130,130,130);
        graphics.drawLine(130,130,130,80);
        graphics.drawLine(130,80,80,80);

        graphics.setColor(new Color(50,153,98));
        graphics.fillRoundRect(180,180,65,65,13,13);

    }
}
