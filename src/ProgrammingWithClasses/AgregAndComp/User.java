package ProgrammingWithClasses.AgregAndComp;

import java.util.ArrayList;
import java.util.Collections;

public class User {

ArrayList<Account> accounts = new ArrayList<>();



public void Summ(){
    int summ = 0;
    for(int i =0; i < accounts.size();i++ ) {
        summ += accounts.get(i).getDebit();
    }
    System.out.println(summ);
}
public Account seachId(int id){
    for(int i =0; i < accounts.size();i++ ){
        if (accounts.get(i).getID() == id){
            return accounts.get(i);
        }
    }
    return null;
}
public void sort(){
    for (int i = 1; i < accounts.size(); i++) {
        if (accounts.get(i).equals(accounts.get(i - 1))) {
            Collections.swap(accounts, i, i - 1);
        }
        for (int j = 1; j < accounts.size(); j++) {
            if (accounts.get(j).equals(accounts.get(j - 1))) {
                Collections.swap(accounts, j, j - 1);

            }
        }
}
}
    public void SummZnak(boolean summPl){
    int summ = 0;
    if (summPl = true){
        for(int i =0; i < accounts.size();i++ ) {
            if(accounts.get(i).getDebit() > 0){
            summ += accounts.get(i).getDebit();
        }
        }
    }
    else{
            for(int i =0; i < accounts.size();i++ ) {
                if (accounts.get(i).getDebit() < 0) {
                    if(accounts.get(i).getDebit() < 0)
                    summ += accounts.get(i).getDebit();
                }
            }}
        System.out.println(summ);
    }
}

