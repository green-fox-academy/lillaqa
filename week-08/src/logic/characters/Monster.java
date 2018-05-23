package logic.characters;

public class Monster extends Characters {
    // TODO the level system needs to be re-written

    public Monster() {
        this.level = 1;
        this.maxHp = 2 * level * randomD6(1, 6);
        this.dp = level / 2 * randomD6(1, 6);
        this.sp = level * randomD6(1, 6);
    }
}
