package BasicsOfOOP.Sample4;

import BasicsOfOOP.Sample4.Search.SearchTreasurs;
import BasicsOfOOP.Sample4.cave.Cave;
import BasicsOfOOP.Sample4.dragon.Dragon;
import BasicsOfOOP.Sample4.treasurs.Treasure;

public class Run {
    public static void main(String[] args) {
        Dragon dragon = new Dragon(5,"Смертокрыл","Brown");
        Treasure treasure = new Treasure("Мусор",0);
        Treasure treasure1 = new Treasure("Мусор",1);
        Treasure treasure2 = new Treasure("Мусор",2);
        Treasure treasure3 = new Treasure("Меч",10);
        Treasure treasure4 = new Treasure("Шлем",13);
        Treasure treasure5 = new Treasure("ФулЭпикСетНаХанта",322);

        Cave cave = new Cave(dragon);

        cave.addTreasure(treasure);
        cave.addTreasure(treasure1);
        cave.addTreasure(treasure2);
        cave.addTreasure(treasure3);
        cave.addTreasure(treasure4);
        cave.addTreasure(treasure5);

        SearchTreasurs hunter = new SearchTreasurs();

        System.out.println(hunter.searchAll(cave));
        System.out.println(hunter.searchMostExpensive(cave));
        System.out.println(hunter.searchTreasureForMyMoney(25,cave));
    }
}
