package com.code2learn.SpringAOPExample.aop;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlienAop 
{
    // @Before(value="execution(* com.code2learn.SpringAOPExample.rest.*.*(..))")
    @Before(value="execution(* com.code2learn.SpringAOPExample.rest.AlienRestApi.*(..))")
    public void beforeAdvice(JoinPoint joinPoint)
    {
        System.out.println("Request made to "+ joinPoint.getSignature() + " at " + LocalDateTime.now());
    }

    @After(value="execution(* com.code2learn.SpringAOPExample.rest.AlienRestApi.*(..))")
    public void afterAdvice(JoinPoint joinPoint)
    {
        System.out.println("Response came from "+ joinPoint.getSignature() + " at " + LocalDateTime.now());
    }

    @Before(value="execution(* com.code2learn.SpringAOPExample.service.AlienServiceImpl.*(..))")
    public void beforeAdviceService(JoinPoint joinPoint)
    {
        System.out.println("Request made to "+ joinPoint.getSignature() + " at " + LocalDateTime.now());
    }

    @After(value="execution(* com.code2learn.SpringAOPExample.service.AlienServiceImpl.*(..))")
    public void afterAdviceService(JoinPoint joinPoint)
    {
        System.out.println("Response came from "+ joinPoint.getSignature() + " at " + LocalDateTime.now());
    }

    @AfterThrowing(value="execution(* com.code2learn.SpringAOPExample.service.AlienServiceImpl.*(..))", throwing="exception")
    public void afterAdviceService(JoinPoint joinPoint, Exception exception)
    {
        System.out.println("Response came from "+ joinPoint.getSignature() + " at " + LocalDateTime.now() + "exception is " + exception.getMessage());
    }
}
