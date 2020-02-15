package hospital.offices;

import hospital.doctors.Doc;

public interface Office {
    void setDoc(Doc doctor);
    void visitOffice();
    String getOfficeNumber();
}
