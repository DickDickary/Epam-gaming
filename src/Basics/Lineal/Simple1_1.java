package Basics.Lineal;

public class Simple1_1
{
    int a;
    int b;
    int c;
    double z;
    public Simple1_1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void go(){
        z = ((a - 3)*b/2)+2;

        System.out.println(z);
    }

}
