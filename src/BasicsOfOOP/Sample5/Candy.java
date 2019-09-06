package BasicsOfOOP.Sample5;

public class Candy {
    private String name;
    private int cost;


    public Candy(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return  "[ name = " + name +
                ", cost = " + cost +
                " ]";
    }
}
