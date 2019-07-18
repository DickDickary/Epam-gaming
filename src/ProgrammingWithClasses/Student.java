package ProgrammingWithClasses;

public class Student {

    String secName;
    String firstName;
    int numGroupe;
    int[] uspeX = new int[5];

    Student[] uni = new Student[10];

    public void otlichniki(){

        for (int i = 0;i < uni.length;i++){
            for (int j = 0;i < uspeX.length;i++){
            if (uspeX[j] >= 9){
                break;}
            }
            System.out.println("Фамилия: "+uni[i].secName +"  Номер группы: "+ uni[i].numGroupe);
        }
    }
}



