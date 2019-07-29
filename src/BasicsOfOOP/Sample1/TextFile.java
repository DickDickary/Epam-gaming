package BasicsOfOOP.Sample1;

import java.util.ArrayList;

public class TextFile implements FileClass {

    private String text;
    private String name;

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void createFile(String name , String text) {
        this.name = name;
        this.text = text;

    }

    @Override
    public String toString() {
        return "TextFile{" +
                "text='" + text + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void rename(String newName) {
this.name = newName;
    }

    @Override
    public void printFile(TextFile textFile) {

        System.out.println(text.toString());
    }

    @Override
    public void addFile(String addText) {

    }

    @Override
    public void remove(TextFile textFile) {
        this.name = null;
        this.text = null;

    }
}
