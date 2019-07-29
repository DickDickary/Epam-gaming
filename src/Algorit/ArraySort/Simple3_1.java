package Algorit.ArraySort;

import java.util.ArrayList;

public class Simple3_1 {
    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();
    int k =6;

    public void go() {

        for (int i = 0; i < 20; i++) {
            arrayList.add(i);
        }
        for (int i = 10; i < 30; i++) {
            arrayList2.add(i);
        }

        for (int i = 0; i < arrayList2.size(); i++){

            arrayList.add(k++,arrayList2.get(i));

            }
        System.out.println(arrayList.toString());
        }
    }

