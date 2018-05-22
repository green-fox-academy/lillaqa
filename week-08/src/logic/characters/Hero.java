package logic.characters;

public class Hero extends Characters {

    public Hero() {
        this.currentHp = 20 + (3 * randomD6(1, 6));
        this.dp = dp * randomD6(1, 6);
        this.sp = 5 + randomD6(1, 6);
        this.level = 1;
    }

}

