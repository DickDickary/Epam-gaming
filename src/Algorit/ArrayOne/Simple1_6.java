package Algorit.ArrayOne;

import java.util.ArrayList;

public class Simple1_6 {
    ArrayList<Integer> arrayList = new ArrayList<>();



    public void go(){
        for (int i = 0;i<200;i++){
            arrayList.add(i);
        }
        int sum = 0;
        for (int i = 0; i < arrayList.size();i++){
        for (int j = 2;j <= arrayList.indexOf(i); j++){

            if (arrayList.indexOf(i-1) % j ==0  ){

                sum += arrayList.get(i);
                System.out.println(sum);

            }
        }
    }
        System.out.println(sum+2);
}
}
