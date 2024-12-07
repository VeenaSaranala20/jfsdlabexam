package com.klef.jfsd.exam;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Demonstrate Constructor Dependency Injection
        Employee employee = context.getBean(Employee.class);
        System.out.println("Employee Details:");
        System.out.println(employee);

        // Demonstrate Setter Autowiring
        Course course = context.getBean(Course.class);
        System.out.println("\nCourse Details:");
        System.out.println(course);
    }
}
