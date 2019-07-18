package StringAndBasicsOfTextProcessing;

import java.util.Collections;

public class Sample2_6 {
    public void go(){


        String s = "Как вы объединяете символы в javaеSystem.out";
        String a = null;
        String word = " ";
        int count = s.length();
        for(int i = 0 ; i < count;i++){

            a = new StringBuilder().append(s.charAt(i)).toString()+new StringBuilder().append(s.charAt(i)).toString();
word += a;
        }
        System.out.println(word);

    }
}
