package ProgrammingWithClasses.AgregAndComp;

public class Tour {
    private String name;
    private String country;
    private String type;
    private int days;
    private int pay;
    private String transport;
    private String breakfast;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public Tour(String name, String country, String type, int days, int pay, String transport, String breakfast) {

        this.name = name;
        this.country = country;
        this.type = type;
        this.days = days;
        this.pay = pay;
        this.transport = transport;
        this.breakfast = breakfast;
    }
}
