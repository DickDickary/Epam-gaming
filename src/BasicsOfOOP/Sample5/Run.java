package BasicsOfOOP.Sample5;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        PresentCreator creator = new PresentCreator();
        System.out.println(creator.fillAPresent());
    }
}
