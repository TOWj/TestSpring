package aop;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        PropertyConfigurator.configure("C:\\Users\\TOW\\IdeaProjects\\spring_course\\resources\\log4j.properties");
        Logger logger = LoggerFactory.getLogger(Logger.class);
        logger.error("hello world!");

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {

            UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);

            universityLibrary.getBook();
            universityLibrary.returnMagazine();
            universityLibrary.addBook();

//            Book book1 = context.getBean("book", Book.class);


//            universityLibrary.returnBook();
//            universityLibrary.getBook();


//            SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//            schoolLibrary.getBook();


        }
    }
}
