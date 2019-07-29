package Basics.Lineal;

import java.util.Arrays;

public class Simple1_4 {
    double n;
    String f;
    char[] h = new char[5];
    public Simple1_4(double n) {
        this.n = n;
    }
public void go() {
    f = Double.toString(n);
    System.out.println(f);

    for (int i = 0; i < 5; i++){
       h[i] =  f.charAt(i);

    }
    Arrays.sort(h);


}
}
