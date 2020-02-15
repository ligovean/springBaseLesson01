package task02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainT2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        SomeObject obj1 = context.getBean("object",SomeObject.class);
        SomeObject obj2 = context.getBean("object",SomeObject.class);

        obj1.sayYourNumber();
        obj2.sayYourNumber();
    }
}
