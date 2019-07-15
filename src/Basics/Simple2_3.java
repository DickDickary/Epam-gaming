package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Simple2_3 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Integer> arrX = new ArrayList<>();
    ArrayList<Integer> arrY = new ArrayList<>();
    ArrayList<Integer> arrZ = new ArrayList<>();

    public ArrayList addX() throws IOException {
        for (; arrX.size() < 2; ) {
            String x = bufferedReader.readLine();
            int xxx = Integer.parseInt(x);
            arrX.add(xxx);
        }
        return arrX;
    }

    public ArrayList addY() throws IOException {
        for (; arrY.size() < 2; ) {
            String x = bufferedReader.readLine();
            int xxx = Integer.parseInt(x);
            arrY.add(xxx);
        }
        return arrY;
    }

    public ArrayList addZ() throws IOException {
        for (; arrZ.size() < 2; ) {
            String x = bufferedReader.readLine();
            int xxx = Integer.parseInt(x);
            arrZ.add(xxx);
        }
        return arrZ;

    }
    public void go() throws IOException {
        addX();
        addY();
        addZ();

        double d = (arrZ.get(0)- arrX.get(0))/(arrY.get(0)-arrX.get(0));
        double d1 = ((arrZ.get(1)- arrX.get(1))/(arrY.get(1)-arrX.get(1)));

        if (d == d1){
            System.out.println(arrX.toString()+ " " + arrY.toString()+ " " + arrZ.toString()+ " " + "true" );

        }
        else System.out.println(arrX.toString()+ " " + arrY.toString()+ " " + arrZ.toString()+ " " + "false" );
    }

}
