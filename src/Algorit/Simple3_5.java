package Algorit;

import java.util.Arrays;

public class Simple3_5 {
    public void go() {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        for (int left = 0; left < array.length; left++)

        {

            int value = array[left];

            int i = left - 1;
            for (; i >= 0; i--) {

                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {

                    break;
                }
            }

            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
