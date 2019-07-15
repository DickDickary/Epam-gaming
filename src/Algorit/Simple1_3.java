package Algorit;

import java.util.ArrayList;

public class Simple1_3 {

    ArrayList<Integer> arrayList = new ArrayList<>();

    public Simple1_3(int a, int q,int w, int y,int o) {
        arrayList.add(a);
        arrayList.add(q);
        arrayList.add(w);
        arrayList.add(y);
        arrayList.add(o);

    }

    public void go(){
        int minus=0;
        int plus=0;
        int zero=0;
        for (int i = 0; i < arrayList.size();i++){
            if (arrayList.get(i) < 0){
                minus++;
            }
            else if (arrayList.get(i) > 0){
                plus++;
            }
            else zero++;

        }
        System.out.println(minus+" "+plus+" "+zero);
    }

}
