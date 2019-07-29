package Algorit.ArrayOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Simple1_2 {
    ArrayList<Integer> arrayList = new ArrayList<>();

//    Конструктор для проверки
    public Simple1_2(int q,int w,int e,int r, int t, int y) {
        arrayList.add(q);
        arrayList.add(w);
        arrayList.add(e);
        arrayList.add(r);
        arrayList.add(t);
        arrayList.add(y);
    }
    public void go() throws IOException {
        int index=0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i< arrayList.size();i++){
        if (arrayList.get(i) > K ){
            arrayList.remove(i);
            arrayList.add(i,K);
            index++;
        }

    }
        System.out.println(index);
        System.out.println(arrayList.toString());
}}

