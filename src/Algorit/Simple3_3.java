package Algorit;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.swap;

public class Simple3_3 {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void go(){

        for (int i = 0; i < 20;i++){
            arrayList.add(i);
            arrayList.add(i+15);
            arrayList.add(i+2);
        }

        for (int left = 0; left < arrayList.size(); left++) {
            int minInd = left;
            for (int i = left; i < arrayList.size(); i++) {
                if (arrayList.get(i) < arrayList.get(minInd)) {
                    minInd = i;
                }
            }
            Collections.swap(arrayList,left,minInd);

        }
        System.out.println(arrayList.toString());


    }

}
