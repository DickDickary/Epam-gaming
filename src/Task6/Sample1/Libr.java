package Task6.Sample1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Libr {
    private ArrayList<Book> lib = new ArrayList<>();
    AuthenticationControl authenticationControl = new AuthenticationControl();

    public void run() throws FileNotFoundException {

        menu(authenticationControl.Authentic());

    }

    @Override
    public String toString() {
        return "Библиотека книг" + lib +
                '}';
    }

    private void menu(String authenticationControl) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        if (lib.isEmpty()){
            System.out.println("Библиотека пуста");
        }else{ System.out.println("");
            System.out.println("Список кник в библиотеке:");
        for (int i = 0; i <lib.size();i++) {
            System.out.println(lib.get(i));
        }
        System.out.println("");}



        switch (authenticationControl) {

            case ("usr"):
                System.out.println("Список команд:");
                System.out.println("search");
                System.out.println("exit");

                String s = scanner.nextLine();
                switch (s) {

                    case ("search"):

                        searchBook();
                        menu(authenticationControl);
                        break;
                }
                break;


            case ("admn"):
                System.out.println("Список команд:");
                System.out.println("search");
                System.out.println("add");
                System.out.println("delete");
                System.out.println("exit");

                String s1 = scanner.nextLine();

                switch (s1) {
                    case ("add"):
                        System.out.println("Введите название книги");
                        String nameAdd = scanner.nextLine();
                        System.out.println("Введите колличество страниц");
                        int pages = Integer.parseInt(scanner.nextLine()) ;
                        System.out.println("Введите автора книги");
                        String author = scanner.nextLine();
                        System.out.println("Введите стоимость книги");
                        int cost = Integer.parseInt(scanner.nextLine());
                        System.out.println("Книга в электронном варианте; y/n");
                        String isElect = scanner.nextLine();
                        boolean isElectro=true;
                        switch (isElect){
                            case ("y"):
                                 isElectro = true;
                                break;
                            case ("n"):
                                isElectro = false;
                                break;

                        }
                        addBook(createBook(nameAdd,author,pages,cost,isElectro));
                        System.out.println("Книга "+ createBook(nameAdd,author,pages,cost,isElectro).toString() + " добавлена");

                        menu(authenticationControl);


                        break;
                    case ("delete"):
                        System.out.println("Введите название книги");
                        String nameDel = scanner.nextLine();
                        deleteBook(nameDel);
                        menu(authenticationControl);

                        break;
                    case ("search"):

                        searchBook();
                        menu(authenticationControl);

                        break;
                }
                break;
            }


        }


    private void addBook(Book book) {

        lib.add(book);
    }
    private void deleteBook(String name){
        for(int i = 0;i < lib.size();i++){
            if (name.equals(lib.get(i).getName())){
                System.out.println("Книга "+ lib.get(i).toString() + " удалена!");
                lib.remove(i);

            }
            else System.out.println("Книги с таким названием нет в библиотеке");
        }
    }

    private void searchBook() throws FileNotFoundException {
        Scanner scannerForSearch = new Scanner(System.in);
        System.out.println("Введите название книги");
        String bookName = scannerForSearch.nextLine();
        for (int i = 0; i < lib.size(); i++) {
            if (bookName.equals(lib.get(i))) {
                System.out.println(lib.get(i));
                System.out.println("");

                scannerForSearch.close();
                menu(authenticationControl.Authentic());

            } else if (lib.isEmpty()) {
                System.out.println("Архив пуст");
                scannerForSearch.close();
                menu(authenticationControl.Authentic());
            } else {
                System.out.println("Такой книги нет");
                scannerForSearch.close();
                menu(authenticationControl.Authentic());
            }

        }


    }
    private Book createBook(String name,String author, int pages, int cost, boolean isElect){
        Book book = new Book(name,pages,author,cost,isElect);
        return book;
    }

}

