package BasicsOfOOP.Sample4.cave;

import BasicsOfOOP.Sample4.dragon.Dragon;
import BasicsOfOOP.Sample4.treasurs.Treasure;

import java.util.ArrayList;

public class Cave {

    private ArrayList<Treasure> treasuresInCave = new ArrayList<>();
    private Dragon dragon ;

    public Cave(Dragon dragon) {
        this.dragon = dragon;
    }

    public ArrayList<Treasure> getTreasuresInCave() {
        return treasuresInCave;
    }
    public void addTreasure(Treasure treasure) {
        if (treasuresInCave.size() < 100) {
            treasuresInCave.add(treasure);
        }
        else {
            System.out.println("Больше добавить сокровищь нельзя");
        }
    }

    public Dragon getDragon() {
        return dragon;
    }


}
