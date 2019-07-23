package ProgrammingWithClasses;

public class Airline {
    private String pointTo;
    private int numAir;
    private int type;
    private int time;



    public Airline(String pointTo, int numAir, int type, int time, Days days) {
        this.pointTo = pointTo;
        this.numAir = numAir;
        this.type = type;
        this.time = time;


    }

    public String getPointTo() {
        return pointTo;
    }

    public void setPointTo(String pointTo) {
        this.pointTo = pointTo;
    }

    public int getNumAir() {
        return numAir;
    }

    public void setNumAir(int numAir) {
        this.numAir = numAir;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
