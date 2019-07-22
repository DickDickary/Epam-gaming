package ProgrammingWithClasses;

public class Customer {

   private int id ;
   private String firstName;
   private String secName;
   private String father;
   private long numKreditCard;
   private long numBank;

    public Customer(int id, String firstName, String secName, String father, long numKreditCard, long numBank) {
        this.id = id;
        this.firstName = firstName;
        this.secName = secName;
        this.father = father;
        this.numKreditCard = numKreditCard;
        this.numBank = numBank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public long getNumKreditCard() {
        return numKreditCard;
    }

    public void setNumKreditCard(long numKreditCard) {
        this.numKreditCard = numKreditCard;
    }

    public long getNumBank() {
        return numBank;
    }

    public void setNumBank(long numBank) {
        this.numBank = numBank;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secName='" + secName + '\'' +
                ", father='" + father + '\'' +
                ", numKreditCard=" + numKreditCard +
                ", numBank=" + numBank +
                '}';
    }
}
