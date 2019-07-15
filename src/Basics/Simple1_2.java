package Basics;

import java.math.*;
public class Simple1_2 {
    int a;
    int b;
    int c;
    double z;
    public Simple1_2(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c =c;
    }
    public void go(){
        z =  (b + Math.sqrt(b*b+4*a*c)/2*a - a*a*a*c + Math.sqrt(b/b));
        System.out.println(z);
    }

}
