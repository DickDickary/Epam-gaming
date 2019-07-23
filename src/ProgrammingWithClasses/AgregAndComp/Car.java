package ProgrammingWithClasses.AgregAndComp;

public class Car {
    String name;
    private Koleso kolesoFrontLeft;
    private Koleso kolesoFrontRight;
    private Koleso kolesoBackLeft;
    private  Koleso kolesoBackRight;
    private   Disel dviglo;

    public Car(Koleso kolesoFrontLeft, Koleso kolesoFrontRight, Koleso kolesoBackLeft, Koleso kolesoBackRight, Disel dviglo) {
        this.kolesoFrontLeft = kolesoFrontLeft;
        this.kolesoFrontRight = kolesoFrontRight;
        this.kolesoBackLeft = kolesoBackLeft;
        this.kolesoBackRight = kolesoBackRight;
        this.dviglo = dviglo;
    }
    public void go(){
        System.out.println("Машина едет");

    }
    public void zapravka(){
        System.out.println("Происходит заправка");

    }
    public void swapKolesoBackLeft(Koleso koleso){
this.kolesoBackLeft = koleso;
    }
    public void swapKolesoBackRight(Koleso koleso){
        this.kolesoBackRight = koleso;
    }
    public void swapKolesoFrontLeft(Koleso koleso){
        this.kolesoFrontLeft = koleso;
    }
    public void swapKolesoFrontRight(Koleso koleso){
        this.kolesoFrontRight = koleso;
    }

    public void getName() {
        System.out.println(name);
    }
}
