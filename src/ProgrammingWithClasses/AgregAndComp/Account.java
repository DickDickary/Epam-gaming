package ProgrammingWithClasses.AgregAndComp;

public class Account {

    private int debit;
    private int ID;

    public Account(int debit, int ID) {
        this.debit = debit;
        this.ID = ID;
    }

    public int getDebit() {

        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
