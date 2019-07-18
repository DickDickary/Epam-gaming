package ProgrammingWithClasses;

public class Test1 {
    int an;
    int ba;

    public void setAn(int an) {
        this.an = an;
    }

    public void setBa(int ba) {
        this.ba = ba;
    }
    public void print(){
        System.out.println(an);
        System.out.println(ba);
    }
    public void sum(){
        System.out.println(an+ba);

    }
    public void max(){

        System.out.println(Math.max(an,ba));
    }

}
