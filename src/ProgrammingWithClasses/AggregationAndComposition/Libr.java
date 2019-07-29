package ProgrammingWithClasses.AggregationAndComposition;

import java.util.ArrayList;

public class Libr {
    ArrayList<Book> books = new ArrayList<>();
    Book book = new Book(1,"Лал","ЫЫЫ","КУЕ",4,2,6,false);
    Book book2 = new Book(1,"Лаs","ЫsЫ","КaЕ",2,2,6,false);

    public void lookAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                System.out.println(books.get(i).toString());
            }
        }
    }

    public void lookIzdat(String izdat) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIzdat().equals(izdat)) {
                System.out.println(books.get(i).toString());
            }
        }
    }

    public void lookAfterYear(int year) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear() > year) {
                System.out.println(books.get(i).toString());
            }
        }
    }
}
