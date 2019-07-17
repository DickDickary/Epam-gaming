package StringAndBasicsOfTextProcessing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Sample1_1 {
    public void go(){

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Character> arrayList2 = new ArrayList<>();

        arrayList.add("dickDickary");
        arrayList.add("bigBigary");
        arrayList.add("vickVickary");
        arrayList.add("SickSickary");


        for ( int i = 0; i < arrayList.size();i++){

            for (int j = 0 ; j < arrayList.get(i).length();j++){
                arrayList2.add(arrayList.get(i).charAt(j));
            }
            for (int j = 0; j < arrayList2.size();j++) {
                if (arrayList2.get(j).equals(Character.toUpperCase(arrayList2.get(j)))) {
                    Character.toLowerCase(arrayList2.get(j));
                    arrayList2.add(j,'_');
                    ++j;
                    System.out.println(arrayList2.toString());
                }
            }
            arrayList.add(String.valueOf(arrayList2));

            }
        System.out.println(arrayList.toString());
        }

    }


