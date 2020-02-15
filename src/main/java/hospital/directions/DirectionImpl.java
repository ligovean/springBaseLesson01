package hospital.directions;

import hospital.cards.Card;
import hospital.offices.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("direction")
public class DirectionImpl implements Direction {

    @Autowired
    private Office office;

    @Autowired
    @Qualifier("MyCard")
    private Card card;

    public Office getOffice() {
        return office;
    }

    public Card getCard() {
        return card;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void visit(){
        System.out.printf("Выдали карту %s \n",getCard().getName());
        office.visitOffice();
    }
}
