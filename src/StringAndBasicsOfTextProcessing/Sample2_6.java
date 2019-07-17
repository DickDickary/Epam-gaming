package StringAndBasicsOfTextProcessing;

import java.util.Collections;

public class Sample2_6 {
    public void go(){


        String s = "Как вы объединяете символы в javaеSystem.out";
        int count = s.length();
        for(int i = 0 ; i < count;i++){
            s.indexOf(i) = s.indexOf(i) + s.indexOf(i);
        }

    }
}
