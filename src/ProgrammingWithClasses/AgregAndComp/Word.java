package ProgrammingWithClasses.AgregAndComp;

public class Word {
    String word;

    public Word(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '_') {

                System.out.println("Воспользуйтесь методом *Предложение*");
                break;
            } else this.word = word;
        }
    }
}
