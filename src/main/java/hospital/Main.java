package hospital;

import hospital.directions.Direction;
import hospital.offices.Office;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Office office = context.getBean("office",Office.class);
//        office.visitOffice();

        Direction direction = context.getBean("direction",Direction.class);
        direction.visit();
    }
}
