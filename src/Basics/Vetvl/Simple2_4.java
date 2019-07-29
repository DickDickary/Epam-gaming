package Basics.Vetvl;

public class Simple2_4 {
    int a;
    int b;
    int x;
    int y;
    int z;

    public Simple2_4(int a, int b, int x, int y, int z) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void go(){

        if(a*b > x*y || a*b > x*z || a*b > y*z){
            System.out.println("Кирпич пройдёт в отверстие");
        }
        else System.out.println("Не пройдет");
    }
}
