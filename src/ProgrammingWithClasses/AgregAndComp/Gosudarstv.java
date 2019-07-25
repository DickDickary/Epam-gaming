package ProgrammingWithClasses.AgregAndComp;

import java.util.ArrayList;

public class Gosudarstv {

    private String name;
    ArrayList<Oblast> oblasts = new ArrayList<>();
    private int squrGos;

    public void addOblast(Oblast oblast){
        oblasts.add(oblast);
    }

    public void printCapitale(Gorod gorod){
        gorod.isCapitalPrint();
    }

    public int getSqurGos() {
        return squrGos;
    }

    public void sqerGos(){
        for (int i = 0; i < oblasts.size();i++) {
            squrGos += oblasts.get(i).getSqurObl();
        }

    }
    public void isOblastCentre(){
        for (int i = 0; i < oblasts.size();i++) {
        oblasts.get(i).oblastCentre();
        }
    }
}
