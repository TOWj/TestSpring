package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("personBean")
public class Person {


    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;


//
//    public Person(Pet pet) {
//        System.out.println("Person bean");
//        this.pet = pet;
//    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Spring set Surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Spring set Age");
        this.age = age;
    }



    public Person() {
        System.out.println("Person bean");
    }

    @Autowired
    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Pet was add to class Person");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hey, you!");
        pet.say();
    }

}
