package ProgrammingWithClasses.AggregationAndComposition;

public class Score {
    private int score;

    public Score(int score) {
        this.score = score;
    }
    public void plusTen(int i){
        this.score = score + i * 10;
    }
    public void minusTen(int i){
        this.score = score + (i-1) * 10;
        this.score = -this.score;
    }

    public int getScore() {
        return score;
    }
}
