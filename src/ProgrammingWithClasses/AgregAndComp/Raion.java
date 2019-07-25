package ProgrammingWithClasses.AgregAndComp;

import java.util.ArrayList;

public class Raion {

    private String name;
    private int squr;

    public int getSqur() {
        return squr;
    }

    public Raion(String name, int squr) {
        this.name = name;
        this.squr = squr;

    }

    ArrayList<Gorod> gorods = new ArrayList<>();

    public void addGorod(Gorod gorod){

        gorods.add(gorod);
    }
    public void countGorods(){

        System.out.println(gorods.size());
    }

    public String getName() {
        return name;
    }
}
