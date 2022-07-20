package aop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("universityBean")
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Yuriy Novikov", 4, 5);
        Student st2 = new Student("Zaur Tregulov", 3, 6);
        Student st3 = new Student("Anton Nazarov", 2, 7);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("getStudents: Method is started!");
//        System.out.println(students.get(3));
        System.out.println("getStudents: ");
        System.out.println(students);
        return students;
    }
}
