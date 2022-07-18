package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {


    @Pointcut("execution(* aop.UniversityLibrary.*())")
    private void allMethodsFromUniversityLibrary() {
    }

    @Pointcut("execution(* aop.UniversityLibrary.returnMagazine())")
    private void returnLibraryMethodFromUniversityLibrary() {
    }

    @Pointcut("allMethodsFromUniversityLibrary() && !returnLibraryMethodFromUniversityLibrary()")
    private void allGetMethodsFromUniversityLibraryExceptReturnMagazine() {
    }


    @Before("allGetMethodsFromUniversityLibraryExceptReturnMagazine()")
    private void beforeAllFromUniversityLibraryExceptReturnMagazineLoggingAdvice() {
        System.out.println("beforeAllFromUniversityLibraryExceptReturnMagazineLoggingAdvice: writing Log #10");
    }


//    @Pointcut("execution(* aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniversityLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniversityLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniversityLibrary() || allReturnMethodsFromUniversityLibrary()")
//    private void allReturnAndGetMethodsFromUniversityLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniversityLibrary()")
//    private void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniversityLibrary()")
//    private void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allReturnAndGetMethodsFromUniversityLibrary()")
//    private void beforeReturnAndGetLoggingAdvice() {
//        System.out.println("beforeReturnAndGetLoggingAdvice: writing Log #3");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: trying to get the book/magazine!");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: security check before receiving a book/magazine!");
//    }


}
