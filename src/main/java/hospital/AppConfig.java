package hospital;

//import hospital.doctors.Doc;
//import hospital.doctors.EndocrinologistImpl;
//import hospital.offices.Office;
//import hospital.offices.Office112Impl;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("hospital")
public class AppConfig {
//    @Bean(name = "doctor")
//    public Doc doctor(){
//        return new EndocrinologistImpl();
//    }

//    @Bean (name = "office")
//    public Office office(Doc doctor) {
//        Office112Impl office = new Office112Impl();
//        office.setDoc(doctor);
//        return office;
//    }
}
