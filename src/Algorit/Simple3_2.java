package Algorit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Simple3_2 {
    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();

    public void go(){
        for (int i = 0; i < 20;i++){
            arrayList.add(i);
            arrayList2.add(i);
        }


        for (int i = 0; i < arrayList2.size();i++){
            arrayList.add(arrayList2.get(i));

        }
        Collections.sort(arrayList);
        System.out.println(arrayList.toString());
    }
}
