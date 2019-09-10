package Task6.Sample1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class AuthenticationControl {

    File admin = new File("src/Task6/Sample1/resources/Admins.txt");
    File users = new File("src/Task6/Sample1/resources/Users.txt");


    public String Authentic() throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        if (searchUsers(createForm(login, password))) {
            System.out.println("Вы вошли как пользователь");
//            scanner.close();
            return "usr";
        } else if (searchAdmins(createForm(login, password))) {
            System.out.println("Вы вошли как админ");
//            scanner.close();//
            return "admn";
        } else {

            System.out.println("Зарегистрируйтесь");

            registr();
//            scanner.close();


            return "usr";
        }
    }

    private void registr() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Регистрация: Введите логин ");
        String loginReg = scanner.nextLine();
        System.out.println("Регистрация: Введите пароль");
        String passwordReg = scanner.nextLine();

        PrintWriter pw = new PrintWriter("src/Task6/Sample1/resources/Users.txt");
        pw.println(createForm(loginReg, passwordReg));
        pw.close();
//        scanner.close();
    }

    private String createForm(String login, String password) {

        String forme = login + "-" + password;

        return forme;
    }

    private boolean searchAdmins(String forme) throws FileNotFoundException {

        Scanner scannerAdmin = new Scanner(admin);
        while (scannerAdmin.hasNext()) {
            String s = scannerAdmin.nextLine();
            if (s.equals(forme)) {
                scannerAdmin.close();
                return true;
            }
        }
        return false;
    }

    private boolean searchUsers(String forme) throws FileNotFoundException {

        Scanner scannerUser = new Scanner(users);
        while (scannerUser.hasNext()) {
            String s = scannerUser.nextLine();
            if (s.equals(forme)) {
                scannerUser.close();
                return true;
            }
        }
        return false;
    }
}



