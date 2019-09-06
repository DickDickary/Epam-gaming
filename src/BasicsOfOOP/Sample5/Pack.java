package BasicsOfOOP.Sample5;

public class Pack {

    private String color;
    private int cost;


    public Pack(String color, int cost) {
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return                "[ color = " + color +
                ", cost = " + cost +
                " ]";
    }
}
