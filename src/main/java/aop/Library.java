package aop;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("libraryBean")
public class Library {

    public void getBook(){
        System.out.println("We take a book!");
    }

    @PostConstruct
    private void init(){
        System.out.println("Library init!");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Library destroy!");
    }
}
