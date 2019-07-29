package Algorit.ArrayOne;

import java.util.ArrayList;
import java.util.LinkedList;

public class Simple1_4 {

LinkedList<Integer> arrayList = new LinkedList<>();

    public Simple1_4(int q,int w,int e,int r, int t, int y) {
        arrayList.add(q);
        arrayList.add(w);
        arrayList.add(e);
        arrayList.add(r);
        arrayList.add(t);
        arrayList.add(y);
    }

    public void go() {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > arrayList.get(0)) {
                max = arrayList.get(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < arrayList.get(0)) {
                min = arrayList.get(i);
            }
            else min=arrayList.get(0);

        }
        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) == max) {
                arrayList.remove(i);
                arrayList.add(i, min);
            }

            else if (arrayList.get(i) == min) {
                arrayList.remove(i);
                arrayList.add(i, max);
            }
        }
        System.out.println(arrayList.toString());
    }
}

