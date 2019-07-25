package ProgrammingWithClasses.AgregAndComp;

import java.util.ArrayList;

public class Oblast {

    private String name;
    ArrayList<Raion> raions = new ArrayList<>();
    private int squrObl;

    public void addRaion(Raion raion){

        raions.add(raion);
    }
    public void countRaions(){

        System.out.println(raions.size());

    }

    public int getSqurObl() {
        return squrObl;
    }

    public void squrObl(){

        for (int i = 0; i < raions.size();i++){

        squrObl += raions.get(i).getSqur() ;

        }

        for (int i = 0; i < raions.get(i).gorods.size();i++){

            squrObl += raions.get(i).gorods.get(i).getSqur();

        }
    }
    public void oblastCentre() {
        for (int i = 0; i < raions.size(); i++) {
            for (int j = 0; i < raions.get(i).gorods.size(); j++) {
                if (raions.get(i).gorods.get(j).isOblastCenter() == true) {
                    System.out.println(raions.get(i).gorods.get(i).getName());
                }
            }
        }
    }


    public String getName() {
        return name;
    }



}
