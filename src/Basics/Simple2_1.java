package Basics;

public class Simple2_1 {
    int x;
    int y;


    public Simple2_1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void go(){
        if (180 - (x + y) > 0){
            System.out.println("Треугольник существует, ");
            if (x == 90 || y == 90 || 180 - (x + y) == 90) {
                System.out.println("треугольник прямоугольный");
            }
        }
        else System.out.println("Треугольник не работает");
    }
}
