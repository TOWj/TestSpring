package aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Component
@Aspect
public class NewLoggingAspect {

    private Logger logger = LoggerFactory.getLogger(NewLoggingAspect.class);


    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("aroundReturnBookLoggingAdvice: try to return book!");

        Object targetMethodResult = null;

        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            logger.error("aroundReturnBookLoggingAdvice: log exception - " + e);
            System.out.println("aroundReturnBookLoggingAdvice: log exception - " + e);
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: successfully return book!");

        return targetMethodResult;
    }

}
