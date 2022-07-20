package aop.aspects;


import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(10)
public class LoggingAspect {


    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for(Object obj : args){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Info about a book: "
                            + "\nTitle - " + myBook.getName()
                            + "\nAuthor - " + myBook.getAuthor()
                            + "\nyear of publication - " + myBook.getYearOfPublication());
                }else if (obj instanceof String){
                    System.out.println("Book is add by " + obj);
                }
            }
        }
        System.out.println("beforeGetLoggingAdvice: logging of trying to get the book/magazine!");
        System.out.println("---------------------------------------------------------------------------------------");
    }

//    @Pointcut("execution(* aop.UniversityLibrary.*())")
//    private void allMethodsFromUniversityLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniversityLibrary.returnMagazine())")
//    private void returnLibraryMethodFromUniversityLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniversityLibrary() && !returnLibraryMethodFromUniversityLibrary()")
//    private void allGetMethodsFromUniversityLibraryExceptReturnMagazine() {
//    }
//
//
//    @Before("allGetMethodsFromUniversityLibraryExceptReturnMagazine()")
//    private void beforeAllFromUniversityLibraryExceptReturnMagazineLoggingAdvice() {
//        System.out.println("beforeAllFromUniversityLibraryExceptReturnMagazineLoggingAdvice: writing Log #10");
//    }


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


}
