package aop;


import org.springframework.stereotype.Component;

@Component("universityLibrary")
public class UniversityLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("We take a book from the University Library!");
    }

    public void returnBook(){
        System.out.println("Returning the book to the University Library!");
    }

    public void getMagazine(){
        System.out.println("We take a magazine from the University Library!");
    }

    public void returnMagazine(){
        System.out.println("Returning the magazine to the University Library!");
    }

    public void addBook(){
        System.out.println("We add a book to the University Library!");
    }

    public void addMagazine(){
        System.out.println("We add a magazine to the University Library!");
    }

//    @PostConstruct
//    private void init(){
//        System.out.println("UniversityLibrary init!");
//    }
//
//    @PreDestroy
//    private void destroy(){
//        System.out.println("UniversityLibrary destroy!");
//    }
}
