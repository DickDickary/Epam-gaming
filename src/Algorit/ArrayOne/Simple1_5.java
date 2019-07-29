package Algorit.ArrayOne;

import java.util.ArrayList;

public class Simple1_5 {
    ArrayList<Integer> arrayList = new ArrayList<>();



    public Simple1_5(int q, int w,int e,int r,int t) {

        arrayList.add(q);
        arrayList.add(w);
        arrayList.add(e);
        arrayList.add(r);
        arrayList.add(t);

    }

    public void go(){

        for (int i = 0; i < arrayList.size();i++){

            if (arrayList.get(i) == i){

                System.out.println(arrayList.get(i+1));

            }
        }
    }
}
