package hospital;

import hospital.doctors.Doc;
import hospital.doctors.EndocrinologistImpl;
import hospital.offices.Office;
import hospital.offices.Office112Impl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Office office = context.getBean("office",Office.class);
        office.visitOffice();
    }
}
