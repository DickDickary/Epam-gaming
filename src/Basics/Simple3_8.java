package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simple3_8 {

    public void go() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String m = bufferedReader.readLine();
        String n = bufferedReader.readLine();

            for (int i = 0; i < m.length(); i++) {
                char m1 = m.charAt(i);
                System.out.println(m1);
            }

                for (int i = 0; i < n.length(); i++) {
                char n1 = n.charAt(i);

                System.out.println(n1);
            }


        }
    }
