package hospital.offices;

import hospital.doctors.Doctor;

public class Office112Impl implements Office {
    private Doctor doctor;
    private String OfficeNumber;

    public Doctor getDoctor() {
        return this.doctor;
    }

    public String getOfficeNumber() {
        return this.OfficeNumber;
    }
}
