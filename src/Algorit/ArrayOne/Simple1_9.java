package Algorit.ArrayOne;

import java.util.*;

public class Simple1_9 {

    ArrayList<Integer> arrayList = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();


    public void go() {
        int max;

        for (int i = 0; i < 200; i++) {

            arrayList.add(i);

        }
        arrayList.add(125);
        arrayList.add(25);
        arrayList.add(5);
        arrayList.add(5);
        System.out.println(arrayList.toString());
        System.out.println();


        for (int i = 0; i < arrayList.size(); i++) {
            int count = 0;
            for (int j = 1; j < arrayList.size(); j++) {


                if (arrayList.get(i) == arrayList.get(j)) {
                    ++count;
                }
            }
            map.put(arrayList.get(i),count) ;

        }
        System.out.println(map.toString());
        System.out.println(Collections.max(map.values()));


            }
        }

