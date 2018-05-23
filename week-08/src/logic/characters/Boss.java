package logic.characters;

public class Boss extends Characters {
    // TODO the level system needs to be re-written

    public Boss() {
        this.level = 1;
        this.maxHp = 2 * level * randomD6(1, 6) + randomD6(1, 6);
        this.dp = level / 2 * randomD6(1, 6) + randomD6(1, 6) /2;
        this.sp = level * randomD6(1, 6) + level;
    }

}

