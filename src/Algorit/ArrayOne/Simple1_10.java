package Algorit.ArrayOne;

import java.util.LinkedList;

public class Simple1_10 {
    LinkedList<Integer> linkedList = new LinkedList<>();

    public void go() {
        for (int i = 0; i < 200; i++) {
            linkedList.add(i);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            if (i % 2 != 0 || i == 1) {
                linkedList.remove(i);
                linkedList.add(i, 0);
            }
        }
        System.out.println(linkedList.toString());
    }
}
