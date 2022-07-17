package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml")){
//            Cat myCat = context.getBean("catBean", Cat.class);
//            myCat.say();

            Person person = context.getBean("personBean", Person.class);
            System.out.println(person.getAge() + " " + person.getSurname());
        }

    }
}
