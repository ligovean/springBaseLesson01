package hospital.doctors;

import org.springframework.stereotype.Component;

@Component("Otorhinolaryngologist")
public class OtorhinolaryngologistImpl implements Doc {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void getDiagnos(){
        System.out.println("У вас ушная Волчанка!");
    }
}
