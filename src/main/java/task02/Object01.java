package task02;

import java.util.Random;

public class Object01 implements SomeObject {
    Random rnd = new Random();
    int number;

    public Object01() {
        this.number = rnd.nextInt(10);
    }

    @Override
    public void sayYourNumber() {
        System.out.printf("Номер объекта %d", number);
    }
}
