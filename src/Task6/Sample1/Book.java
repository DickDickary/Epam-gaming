package Task6.Sample1;

public class Book {

    private String name;
    private int pages;
    private String author;
    private int cost;
    private boolean isDigital;

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Книга[" +
                "Название= '" + name + '\'' +
                ", Колличество страниц= " + pages +
                ", Автор= '" + author + '\'' +
                ", Стоимость= " + cost +
                ", В электронном виде = " + isDigital +
                ']';
    }

    public String getAuthor() {
        return author;
    }

    public int getCost() {
        return cost;
    }

    public boolean isDigital() {
        return isDigital;
    }

    public Book(String name, int pages, String author, int cost, boolean isDigital) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.cost = cost;
        this.isDigital = isDigital;
    }
}
