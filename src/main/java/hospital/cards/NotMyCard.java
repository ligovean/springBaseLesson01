package hospital.cards;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("NotMyCard")
public class NotMyCard implements Card {

    @Value("Чужая карта")
    private String name;

    @Override
    public String getName() {
        return this.name;
    }
}
