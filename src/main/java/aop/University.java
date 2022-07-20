package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Yuriy Novikov", 4, 5);
        Student st2 = new Student("Zaur Tregulov", 3, 6);
        Student st3 = new Student("Anton Nazarov", 2, 7);
    }
}
