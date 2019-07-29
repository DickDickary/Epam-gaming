package Algorit.ArrayOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Simple1_1 {
    ArrayList<Integer> arrayList = new ArrayList();

    public Simple1_1(int N,int J,int L,int M,int B) {
        arrayList.add(N);
        arrayList.add(J);
        arrayList.add(L);
        arrayList.add(M);
        arrayList.add(B);

    }

    public void go() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bufferedReader.readLine());
        int a=0;

        for (int i = 0 ; i < arrayList.size();i++){

        if(arrayList.get(i) % K == 0){

            a += arrayList.get(i);

        }
        }
        System.out.println(a);
    }
}
