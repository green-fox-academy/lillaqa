package Drawing.purpleSteps;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class PurpleSteps3D {

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

        graphics.setColor(Color.MAGENTA); //double check color...
        graphics.fillRect(0,0,15,15);
        graphics.fillRect(15,15,25,25);
        graphics.fillRect(40,40,35,35);
        graphics.fillRect(75,75,45,45);
        graphics.fillRect(120,120,55,55);
        graphics.fillRect(175,175,70,70);
    }

}