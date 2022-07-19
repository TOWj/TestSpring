package aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Test1.class);
        logger.info("hello world!");

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
