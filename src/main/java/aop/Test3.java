package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        System.out.println("Method main starts");
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {

            UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
            String book = universityLibrary.returnBook();
            System.out.println("Return book - " + book);

        }
        System.out.println("Method main ends");

    }
}
