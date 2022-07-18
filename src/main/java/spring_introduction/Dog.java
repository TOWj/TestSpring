package spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
public class Dog implements Pet {


    Dog() {
        System.out.println("Dog bean");
    }

    @Override
    public void say() {

        System.out.println("Gav!");

    }



    @PostConstruct
    private void init() {
        System.out.println("Class Dog: init!");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Class Dog: destroy!");
    }

}
