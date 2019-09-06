package BasicsOfOOP.Sample5;

public class Present {


    private Candy candy;
    private Pack pack;

    public Present() {

    }

    public Candy getCandy() {
        return candy;
    }

    public void setCandy(Candy candy) {
        this.candy = candy;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    @Override
    public String toString() {
        return "Present: " +
                "candy =" + candy.toString() +
                ", pack =" + pack.toString() +
                '}';
    }
}
