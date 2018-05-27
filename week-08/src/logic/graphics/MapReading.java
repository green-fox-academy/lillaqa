package logic.graphics;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MapReading {

    int boardSize = 10;
    int [][] boardDimensions = new int[boardSize][boardSize];
    String mapName;

    public MapReading(String mapName, Graphics graphics) {
        boardCreation(mapName);
        boardDraw(graphics);
    }

    public void boardCreation(String mapName) {
        Path getMap = Paths.get(mapName);
        List<String> fileContent = new ArrayList<String>();
        try {
            fileContent = Files.readAllLines(getMap);
        } catch (IOException e) {
            System.out.println("Map can't be read.");
        }
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                boardDimensions[i][j] = (int)fileContent.get(i).charAt(j) - 48;
            }
        }
    }

    public void boardDraw(Graphics graphics) {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (boardDimensions[i][j] == 0) {
                    PositionedImage imgFloor = new PositionedImage(
                            "images/floor.png", i * 50, j * 50);
                    imgFloor.draw(graphics);
                } else {
                    PositionedImage imgWall = new PositionedImage(
                            "images/wall.png", i * 50, j * 50);
                    imgWall.draw(graphics);
                }
            }
            System.out.println();
        }
    }

}

