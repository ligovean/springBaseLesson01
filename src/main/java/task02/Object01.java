package task02;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("object01")
@Scope("prototype")
public class Object01 implements SomeObject {
    Random rnd = new Random();
    int number;

    public Object01() {
        this.number = rnd.nextInt(1000);
    }

    @Override
    public void sayYourNumber() {
        System.out.printf("Номер объекта %d \n", number);
    }
}
