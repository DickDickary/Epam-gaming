package Basics.ForWhile;

public class Simple3_4 {
    int a;
    int b = 0;
    public void go(){
        for (int i = 0;i < 200; i ++){
            a += b*b;
            b++;

        }
        System.out.println(a);
    }
}
