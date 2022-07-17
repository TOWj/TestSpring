package spring_introduction;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {

    public Cat(){
        System.out.println("Cat bean");
    }

    @Override
    public void say() {
        System.out.println("Meow!");
    }

}
