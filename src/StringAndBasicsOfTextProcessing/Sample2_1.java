package StringAndBasicsOfTextProcessing;

public class Sample2_1 {
    public void go(){
        int count = 0;
        String s = "Как вы объединяете символы в javaеSystem.out";
     int a = s.length() - s.replaceAll(" ", "").length();
        System.out.println(a);

    }
}
