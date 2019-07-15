package Basics;

public class Simple1_3 {
    int x;
    int y;
double z;
    public Simple1_3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void go(){
        z = (Math.sin(x) + Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.println(z);
    }
}
