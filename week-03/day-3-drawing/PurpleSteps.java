package Drawing.purpleSteps;

import Drawing.FourRectagles;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class PurpleSteps {

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

        graphics.setColor(new Color(177, 69, 243));
        graphics.fillRect(0,0,10,10);
        graphics.fillRect(10,10,10,10);
        graphics.fillRect(20,20,10,10);
        graphics.fillRect(30,30,10,10);
        graphics.fillRect(40,40,10,10);
        graphics.fillRect(50,50,10,10);
        graphics.fillRect(60,60,10,10);
        graphics.fillRect(70,70,10,10);
        graphics.fillRect(80,80,10,10);
        graphics.fillRect(90,90,10,10);
        graphics.fillRect(100,100,10,10);
        graphics.fillRect(110,110,10,10);
        graphics.fillRect(120,120,10,10);
        graphics.fillRect(130,130,10,10);
        graphics.fillRect(140,140,10,10);
        graphics.fillRect(150,150,10,10);
        graphics.fillRect(160,160,10,10);
        graphics.fillRect(170,170,10,10);
        graphics.fillRect(180,180,10,10);

        graphics.setColor(Color.BLACK);
        graphics.drawRect(0,0,10,10);
        graphics.drawRect(10,10,10,10);
        graphics.drawRect(20,20,10,10);
        graphics.drawRect(30,30,10,10);
        graphics.drawRect(40,40,10,10);
        graphics.drawRect(50,50,10,10);
        graphics.drawRect(60,60,10,10);
        graphics.drawRect(70,70,10,10);
        graphics.drawRect(80,80,10,10);
        graphics.drawRect(90,90,10,10);
        graphics.drawRect(100,100,10,10);
        graphics.drawRect(110,110,10,10);
        graphics.drawRect(120,120,10,10);
        graphics.drawRect(130,130,10,10);
        graphics.drawRect(140,140,10,10);
        graphics.drawRect(150,150,10,10);
        graphics.drawRect(160,160,10,10);
        graphics.drawRect(170,170,10,10);
        graphics.drawRect(180,180,10,10);

    }
}
