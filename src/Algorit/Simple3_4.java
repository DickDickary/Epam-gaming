package Algorit;

import java.util.ArrayList;
import java.util.Collections;

public class Simple3_4 {
    ArrayList <Integer> array = new ArrayList<>();
    public void go() {
        for (int i = 0; i < 20; i++) {
            array.add(i);
            array.add(i + 15);
            array.add(i + 2);
        }

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < array.get(i - 1)) {
                Collections.swap(array, i, i - 1);
            }
            for (int j = 1; j < array.size(); j++) {
                if (array.get(j) < array.get(j - 1)) {
                    Collections.swap(array, j, j - 1);

                }
        }


        }
        System.out.println(array.toString());
    }
}
