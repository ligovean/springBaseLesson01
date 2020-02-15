package hospital.cards;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("MyCard")
public class MyCard implements Card {
    @Value("Моя карта")
    private String name;

    @Override
    public String getName() {
        return this.name;
    }
}
