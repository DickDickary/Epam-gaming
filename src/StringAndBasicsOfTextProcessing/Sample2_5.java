package StringAndBasicsOfTextProcessing;

public class Sample2_5 {

public void go(){

    int count = 0;
    String s = "Как вы объединяете символы в javaеSystem.out";
    int a = s.length() - s.replaceAll("a", "").length();
        System.out.println(a);
}
}
