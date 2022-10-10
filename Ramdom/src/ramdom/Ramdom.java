package ramdom;

import java.util.Random;

public class Ramdom {

    public static void main(String[] args) {
        Random generator = new Random();
        generator.setSeed(1210312);
        System.out.println(generator.nextInt());
    }

}
