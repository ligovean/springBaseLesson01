package hospital.offices;

import hospital.doctors.Doctor;

public interface Office {
    Doctor getDoctor();
    String getOfficeNumber();
}
