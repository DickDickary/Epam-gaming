package ProgrammingWithClasses.AggregationAndComposition;

public class Book {
    private int id;
    private String name;
    private String author;
    private String izdat;
    private int year;
    private int pages;
    private int price;
    private boolean perepletHard = true;

    public Book(int id, String name, String author, String izdat, int year, int pages, int price, boolean perepletHard) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.izdat = izdat;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.perepletHard = perepletHard;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", izdat='" + izdat + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", perepletHard=" + perepletHard +
                '}';
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIzdat() {
        return izdat;
    }

    public void setIzdat(String izdat) {
        this.izdat = izdat;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isPerepletHard() {
        return perepletHard;
    }

    public void setPerepletHard(boolean perepletHard) {
        this.perepletHard = perepletHard;
    }
}

