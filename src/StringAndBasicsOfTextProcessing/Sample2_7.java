package StringAndBasicsOfTextProcessing;

public class Sample2_7 {

    public void go(){

        String s = "Как вы объединяете символы в javaеSystem.out";

        for(int i = 0 ; i < s.length();i++){

            for(int j = 1 ; j < s.length();j++){
                if (s.charAt(i) == s.charAt(j)){
                    s.replaceAll(String.valueOf(s.charAt(i)), "");
                    s.replaceAll(String.valueOf(s.charAt(j)), "");
                }
                else if (s.charAt(i) == ' '){
                    s.replaceAll(String.valueOf(s.charAt(i)), "");
                }

            }
        }
        System.out.println(s);
    }
}
