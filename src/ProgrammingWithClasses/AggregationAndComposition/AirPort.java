package ProgrammingWithClasses.AggregationAndComposition;

import java.util.ArrayList;

public class AirPort {
    ArrayList<Airline> airlines = new ArrayList<>();

    public void Reisi(String pointTo){

        for (int i = 0; i < airlines.size(); i++) {
            if (airlines.get(i).getPointTo().equals(pointTo)) {
                System.out.println(airlines.get(i).toString());
            }
        }
    }
    public void weekReis (Days days){

        for (int i = 0; i < airlines.size(); i++){

switch (days){
    case MONDAY:
        System.out.println(airlines.get(i));
    case TUESDAY:
        System.out.println(airlines.get(i));
    case WEDNESDAY:
        System.out.println(airlines.get(i));
    case THURSDAY:
        System.out.println(airlines.get(i));
    case FRIDAY:
        System.out.println(airlines.get(i));
    case SUNDAY:
        System.out.println(airlines.get(i));
    case SATURDAY:
        System.out.println(airlines.get(i));
}
          }
     }
    public void weekReisInTime (Days days, int a){

        for (int i = 0; i < airlines.size(); i++){

            switch (days){
                case MONDAY:
                    for (int j = 0; j< airlines.size(); j++) {
                        if (airlines.get(i).getTime()>a) {
                            System.out.println(airlines.get(i).toString());
                        }
                    }
                    System.out.println(airlines.get(i));
                case TUESDAY:
                    for (int j = 0; j < airlines.size(); j++) {
                        if (airlines.get(i).getTime()>a) {
                            System.out.println(airlines.get(i).toString());
                        }
                    }
                    System.out.println(airlines.get(i));
                case WEDNESDAY:
                    for (int j = 0; j < airlines.size(); j++) {
                        if (airlines.get(i).getTime()>a) {
                            System.out.println(airlines.get(i).toString());
                        }
                    }
                    System.out.println(airlines.get(i));
                case THURSDAY: for (int j = 0; j< airlines.size(); j++) {
                    if (airlines.get(i).getTime()>a) {
                        System.out.println(airlines.get(i).toString());
                    }
                }

                    System.out.println(airlines.get(i));
                case FRIDAY:
                    for (int j = 0; j< airlines.size(); j++) {
                        if (airlines.get(i).getTime()>a) {
                            System.out.println(airlines.get(i).toString());
                        }
                    }
                    System.out.println(airlines.get(i));
                case SUNDAY:
                    for (int j = 0; j < airlines.size(); j++) {
                        if (airlines.get(i).getTime()>a) {
                            System.out.println(airlines.get(i).toString());
                        }
                    }
                    System.out.println(airlines.get(i));
                case SATURDAY:
                    for (int j = 0; j < airlines.size(); j++) {
                        if (airlines.get(i).getTime()>a) {
                            System.out.println(airlines.get(i).toString());
                        }
                    }
                    System.out.println(airlines.get(i));
            }}
}
}
