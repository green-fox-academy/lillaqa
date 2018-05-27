package logic.characters;

import logic.graphics.Board;
import logic.graphics.PositionedImage;

import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Hero extends Characters {


    public Hero() {
        this.maxHp = 20 + 3 * randomD6(1, 6);
        this.dp = dp * randomD6(1, 6);
        this.sp = 5 + randomD6(1, 6);
        this.level = 1;

    }

}

