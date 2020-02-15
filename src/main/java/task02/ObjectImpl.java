package task02;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("object")
@Scope("prototype")
public class ObjectImpl implements SomeObject {
    Random rnd = new Random();
    int number;

    public ObjectImpl() {
        this.number = rnd.nextInt(1000);
    }

    @Override
    public void sayYourNumber() {
        System.out.printf("Номер объекта %d \n", number);
    }
}
