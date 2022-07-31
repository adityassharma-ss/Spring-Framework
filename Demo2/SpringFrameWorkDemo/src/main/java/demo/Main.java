package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Staff staff = context.getBean(Doctor.class);
        // Staff staff2 = context.getBean(Nurse.class);
        Doctor staff = context.getBean(Doctor.class);
         staff.assist();
        // staff2.assist();
        System.out.println(staff.getQualification());

    }
}
