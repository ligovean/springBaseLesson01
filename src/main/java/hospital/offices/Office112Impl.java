package hospital.offices;

import hospital.doctors.Doc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("office")
public class Office112Impl implements Office {
    @Value("112")
    private String officeNumber;

    @Autowired
    @Qualifier("Endocrinologist")
    private Doc doctor;

    public void setDoc(Doc doctor) {
        this.doctor = doctor;
    }

    public String getOfficeNumber() {
        return this.officeNumber;
    }

    public void visitOffice(){
        System.out.println("Вы в кабинете №" + officeNumber + ".");
        doctor.getDiagnos();
    };
}
