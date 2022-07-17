package spring_introduction;

public class Person {

    private Pet pet;
    private String surname;
    private int age;

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
    //    public Person(Pet pet) {
//        System.out.println("Person bean");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean");
    }

    public void setPet(Pet pet) {
        System.out.println("Pet was add at class Person");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hey, you!");
        pet.say();
    }

}
