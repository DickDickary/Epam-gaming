package BasicsOfOOP.Sample4.Search;

import BasicsOfOOP.Sample4.cave.Cave;
import BasicsOfOOP.Sample4.treasurs.Treasure;

import java.util.ArrayList;

public class SearchTreasurs {


    public ArrayList searchAll(Cave cave){

        ArrayList<Treasure> treasure = cave.getTreasuresInCave();

        return treasure;
    }

    public Treasure searchMostExpensive(Cave cave){
        int valueTresure = cave.getTreasuresInCave().get(0).getValue();
        Treasure treasure = cave.getTreasuresInCave().get(0);
        for (int i = 0; i<cave.getTreasuresInCave().size(); i++){
            if (cave.getTreasuresInCave().get(i).getValue() > valueTresure){
                treasure = cave.getTreasuresInCave().get(i);
                valueTresure = cave.getTreasuresInCave().get(i).getValue();
            }
        }
        return treasure;
    }

    public ArrayList searchTreasureForMyMoney (int money,Cave cave){

        ArrayList<Treasure> treasuresForMyMoney = new ArrayList<>();
        for (int i = 0; i<cave.getTreasuresInCave().size(); i++){
            if (cave.getTreasuresInCave().get(i).getValue() < money){
                treasuresForMyMoney.add(cave.getTreasuresInCave().get(i));
            }
        }
        return treasuresForMyMoney;
    }



}
