package ProgrammingWithClasses.AggregationAndComposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Menu {
     ArrayList<Train> array = new ArrayList<>(5);

     public void sort() {

         for (int i = 1; i < array.size(); i++) {
             if (array.get(i).numTrain < array.get(i - 1).numTrain) {
                 Collections.swap(array, i, i - 1);
             }
             for (int j = 1; j < array.size(); j++) {
                 if (array.get(j).numTrain < array.get(j - 1).numTrain) {
                     Collections.swap(array, j, j - 1);
                 }
             }
         }
     }

     public void info() throws IOException {
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         int polNum = Integer.parseInt(bufferedReader.readLine());
         for (int i = 0; i < array.size(); i++) {
             if (polNum == array.get(i).numTrain) {
                 System.out.println("Куда " + array.get(i).goTo + " Номер поезда " + array.get(i).numTrain + " Время отправления " + array.get(i).timeToGo);
             }
         }
     }

     public void sortPoPunktu() {

        Collections.sort(array, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return o1.goTo.compareTo(o2.goTo);
            }
        }
        );
         }


     }

