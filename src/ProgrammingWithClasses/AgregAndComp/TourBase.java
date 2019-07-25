package ProgrammingWithClasses.AgregAndComp;

import java.util.ArrayList;

public class TourBase {
   private ArrayList<Tour> tours = new ArrayList<>();

    public void addTour(Tour tour){
        tours.add(tour);
    }
    public void remove(Tour tour){
        tours.remove(tour);
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }
}
