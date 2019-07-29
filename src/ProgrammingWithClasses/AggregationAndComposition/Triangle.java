package ProgrammingWithClasses.AggregationAndComposition;

public class Triangle {
    double a;
    double b;
    double c;
    double anglea;
    double angleb;
    double anglec;
    double perimets;
    double plo;


    public void creatTriangle(int a,int b,int anglea) {
        if (anglea < 180) {

             this.c = Math.sqrt(b * b + a * a - 2 * a * b * Math.cos(anglea));
             this.angleb = c/b;
             this.anglec = 180 - angleb - anglea;

        }
        else System.out.println("Неправильно задан угол");

    }
    public void Perimetr(){

          this.perimets = a + b + c;
    }

    public void Ploscha(){

        this.plo = 0.5 * a * b * Math.sin(anglea);

    }
    public void tochkaPeresechMed(){



    }

}
