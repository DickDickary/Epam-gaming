package ProgrammingWithClasses.AgregAndComp;

public class Text {
    String text;
    String zagolovok;
    public void addWord(Word word){
        this.text += word;
    }
    public void addPredloj(Predloj predloj){
        this.text +=predloj;
    }
    public void printText(){
        System.out.println(text);
    }
    public void printZag(){
        System.out.println(zagolovok);
    }
}
