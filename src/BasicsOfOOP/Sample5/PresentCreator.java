package BasicsOfOOP.Sample5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PresentCreator {
private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Present fillAPresent() throws IOException {
        Present present = new Present();
        present.setCandy(createCandy());
        present.setPack(createPack());

     return present;
    }

    private Candy createCandy() throws IOException {

        System.out.println("Введите название конфет");
        String name = reader.readLine();
        Candy candy = new Candy(name,(int) (Math.random()*10));
        return candy;
    }

    private Pack createPack() throws IOException {

        System.out.println("Введите цвет упаковки");
        String color = reader.readLine();
        Pack pack = new Pack(color,(int) (Math.random()*10));
        return pack;
    }

}
