package org.example.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import javax.sql.rowset.Joinable;

public class MyAdvice {
    public void advice(){
        System.out.println("advice通知一下");
    }

    public void beforeAdvice(JoinPoint joinPoint){
        Class<? extends JoinPoint> aClass = joinPoint.getClass();
        Object target = joinPoint.getTarget();
        System.out.println(aClass);
        System.out.println(target);
        System.out.println("advice前置通知");
    }

     public void afterRunningAdvice(){
         System.out.println("advice后置通知");
     }

    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("advice环绕通知钱");
        Object res = joinPoint.proceed();
        System.out.println("advice环绕通知后");
        return res;
    }

    public void throwingAdvice(Throwable e){
        System.out.println(e);
        System.out.println("advice异常通知");
    }

    public void after(){
        System.out.println("advice最后通知");
    }
}
