package Basics;

public class Simple2_2 {
    int a;
    int b;
    int c;
    int d;

    public Simple2_2(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public void go() {
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
        }
}
