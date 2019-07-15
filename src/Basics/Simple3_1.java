package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simple3_1 {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int s = Integer.parseInt(bufferedReader.readLine());
    public Simple3_1() throws IOException {

    }
    public void go(){


        if (s > 0){
            int g =0;
            for (int i =0;  i < s; i++ ){
                g += i ;

            }
            System.out.println(g);
        }
        else System.out.println("Введите положительное число");
    }

}
