package ua.pp.fame.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class aspect{
    public Object log(ProceedingJoinPoint call) throws Throwable {
        System.out.println("ASPECT LOGE: " + call.toShortString() + " called. ");
        return call.proceed();
    }
}
