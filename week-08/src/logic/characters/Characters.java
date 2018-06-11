package logic.characters;

import java.awt.*;
import java.util.Random;

public class Characters {

    int currentHp;
    int maxHp;
    int dp;
    int sp;
    int level;
    //int startX;
    //int startY;
    String imagePath;

    public static int randomD6(int min, int max) {
        Random random = new Random();
        return random.nextInt((max + 1) - min) + min;
    }


}

