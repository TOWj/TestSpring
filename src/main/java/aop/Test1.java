package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

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
