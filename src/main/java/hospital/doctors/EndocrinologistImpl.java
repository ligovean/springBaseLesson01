package hospital.doctors;

import org.springframework.stereotype.Component;

public class EndocrinologistImpl implements Doc {

    private String name;

    public String getName() {
        return this.name;
    }

    public void getDiagnos(){
        System.out.println("У вас гормональная Волчанка!");
    }
}
