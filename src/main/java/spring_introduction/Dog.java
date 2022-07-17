package spring_introduction;

public class Dog implements Pet {


    Dog() {
        System.out.println("Dog bean");
    }

    @Override
    public void say() {

        System.out.println("Gav!");

    }

    private void init() {
        System.out.println("Class Dog: init!");
    }

    private void destroy() {
        System.out.println("Class Dog: destroy!");
    }

}
