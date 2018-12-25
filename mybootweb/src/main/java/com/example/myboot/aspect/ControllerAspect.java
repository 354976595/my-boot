package com.example.myboot.aspect;

import com.example.myboot.model.UserInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ControllerAspect  {
Logger logger= LoggerFactory.getLogger(ControllerAspect.class);

    /**
     * execution 表达式
     * @see 12 https://blog.csdn.net/zhengchao1991/article/details/53391244
     * @param user 切入点的参数1 可以没有args
     * @param sv 切入点的参数2 可以没有args
     */
    @Pointcut(value = "execution(public * com.example.myboot.controller.*.*(..))&&(args(user,sv,..)||args(sv,user,..)||args(sv,..,user)||args(..,sv,user))")
    public void logs(UserInfo user,Object sv){

    }
    @Around(value = "logs(user,sv)", argNames = "proceedingJoinPoint,user,sv")
    public Object print(ProceedingJoinPoint proceedingJoinPoint, UserInfo user,Object sv){
        try {
            logger.info(this.getClass().getName()+"{} invoke");
            Object[] args = proceedingJoinPoint.getArgs();
            String kind = proceedingJoinPoint.getKind();
            Signature sg = proceedingJoinPoint.getSignature();
            Object target = proceedingJoinPoint.getTarget();
            Object this1 = proceedingJoinPoint.getThis();
            System.out.println("Around");
            return proceedingJoinPoint.proceed();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return null;
    }

}
