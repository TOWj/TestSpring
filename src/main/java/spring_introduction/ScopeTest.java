package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml")){

            Dog myDog = context.getBean("dogBean", Dog.class);
            Dog myDog2 = context.getBean("dogBean", Dog.class);




        }
    }
}
