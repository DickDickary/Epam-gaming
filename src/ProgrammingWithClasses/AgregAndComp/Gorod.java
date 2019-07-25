package ProgrammingWithClasses.AgregAndComp;

public class Gorod {
    public String getName() {
        return name;
    }

    private String name;
    private boolean isCapitale = false;
    private String capitale;
    private boolean oblastCenter;
    private int squr;

    public boolean isCapitale() {
        return isCapitale;
    }

    public String getCapitale() {
        return capitale;
    }

    public int getSqur() {
        return squr;
    }

    public Gorod(String name, int squr, boolean isCapitale,boolean oblastCenter, String nameCapitale) {
        this.name = name;
        this.squr = squr;
this.oblastCenter = oblastCenter;
        this.isCapitale = isCapitale;
        this.capitale = nameCapitale;
    }

    public Gorod(String name) {
        this.name = name;

    }

    public void isCapitalPrint() {
        if (isCapitale == true) {
            System.out.println("Столица " + capitale);

        }
    }

    public boolean isOblastCenter() {
        return oblastCenter;
    }
}
