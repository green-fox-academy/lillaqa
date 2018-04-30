package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

import static DataStructures.Solarsystem.putSaturn;


public class Solarsystem {

    public static void main(String[] args) {

        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        //planetList.add(7, "Saturn");

        System.out.println(putSaturn(planetList));

    }

    public static ArrayList putSaturn(ArrayList<String> planetList) {

        planetList.add(7, "Saturn");
        return planetList;
    }
}

