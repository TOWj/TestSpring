package aop;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("schoolLibrary")
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take a book from the School Library!");
    }

//    @PostConstruct
//    private void init() {
//        System.out.println("SchoolLibrary init!");
//    }
//
//    @PreDestroy
//    private void destroy() {
//        System.out.println("SchoolLibrary destroy!");
//    }
}
