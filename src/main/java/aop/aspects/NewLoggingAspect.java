package aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {


    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("aroundReturnBookLoggingAdvice: try to return book!");

        long begin = System.currentTimeMillis();

        Object targetMethodResult = proceedingJoinPoint.proceed();

        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: successfully return book!");

        System.out.println("aroundReturnBookLoggingAdvice: time of method work - " + (end - begin) + "ms");

        return targetMethodResult;
    }

}
