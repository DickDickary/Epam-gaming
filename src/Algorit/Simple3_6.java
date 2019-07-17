package Algorit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Simple3_6 {
    public void go(){
        ArrayList array = new ArrayList<Integer>();
        array.add(10);
        array.add(2);
        array.add(10);
        array.add(3);
        array.add(1);
        array.add(2);
        array.add(5);


        int gap = array.size() / 2;

        while (gap >= 1) {
            for (int right = 0; right < array.size(); right++) {

                for (int c = right - gap; c >= 0; c -= gap) {
                    if ( (int)array.get(c) > (int)(array.get(c+gap))) {
                        Collections.swap(array, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        System.out.println(array.toString());
    }
}
