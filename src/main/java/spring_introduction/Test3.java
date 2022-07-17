package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

//        Pet pet = new Dog();

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            Person person = context.getBean("myPerson", Person.class);
            person.callYourPet();

            System.out.println(person.getSurname());
            System.out.println(person.getAge());

        }

    }
}
