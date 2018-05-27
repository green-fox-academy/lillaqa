package logic.logic;

import logic.characters.Boss;
import logic.characters.Characters;
import logic.characters.Hero;
import logic.characters.Monster;

import java.util.ArrayList;

import static logic.characters.Characters.randomD6;

public class AddCharacters {

    public ArrayList<Characters> loadCharacters = new ArrayList<>();
    int monsterNumber = randomD6(3, 6);

    public void createCharacters() {
        Hero hero = new Hero();
        loadCharacters.add(hero);
        Boss boss = new Boss();
        loadCharacters.add(boss);
        createMonster(monsterNumber);

    }

    public void createMonster(int monsterNumber) {
        for (int i = 0; i < monsterNumber; i++) {
            Monster newMonster = new Monster();
            loadCharacters.add(newMonster);
        }

    }
}
