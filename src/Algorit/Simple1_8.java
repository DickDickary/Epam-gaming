package Algorit;

import java.util.LinkedList;

public class Simple1_8 {

    LinkedList<Integer> linkedList = new LinkedList<>();
    LinkedList<Integer> linkedList2 = new LinkedList<>();

    public Simple1_8(int q,int w,int e,int r,int t) {
        linkedList.add(q);
        linkedList.add(w);
        linkedList.add(e);
        linkedList.add(r);
        linkedList.add(t);
    }
    public void go(){
        int min =0;
        for (int i = 0; i < linkedList.size();i++){
            if (linkedList.get(i) < linkedList.get(0)){
                min = linkedList.get(i);
            }
            else min = linkedList.get(0);
        }
        for (int i = 0; i < linkedList.size();i++){
            if(min == linkedList.get(i)){
                linkedList.remove(i);
            }
            linkedList2.add(linkedList.get(i));
        }
        System.out.println(linkedList2.toString());
    }
}
