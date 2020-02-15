package hospital.offices;

import hospital.doctors.Doc;
import hospital.doctors.EndocrinologistImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Office112Impl implements Office {
    private String officeNumber;

    private Doc doctor;
    //private Doc doctor = new EndocrinologistImpl();

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
