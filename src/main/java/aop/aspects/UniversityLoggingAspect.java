package aop.aspects;


import aop.Student;
import aop.Test1;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.interceptor.CacheOperationInvoker;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    private Logger logger = LoggerFactory.getLogger(Test1.class);


    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: logging end of method work or exception throws");
    }

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: getting students log!");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: exception throw logging " + exception);
//    }


//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//
//        logger.error("afterReturningGetStudentsLoggingAdvice: " + students.get(0));
//
//        Student firstSt = students.get(0);
//        String nameSurname = firstSt.getNameSurname();
//        nameSurname = "mr. " + nameSurname;
//        firstSt.setNameSurname(nameSurname);
//
//        double firstAvgGrade = firstSt.getAvgGrade() + 1;
//        firstSt.setAvgGrade(firstAvgGrade);
//
//        logger.error("afterReturningGetStudentsLoggingAdvice: " + students.get(0));
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: getting students log!");
//    }
}
