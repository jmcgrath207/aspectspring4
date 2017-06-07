package aspectspring4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by root on 6/6/17.
 */

@Aspect
@Component("logger")
public class Logger {

    @Pointcut("execution(void aspectspring4.Camera.*(..))")
    public void cameraSnap() {
        // * for any return,method or class .. for any arg
    }

    @Pointcut("execution(String aspectspring4.Camera.snap(String))")
    public void cameraSnapName() {
        //This examples execpt a return string type and a string type for the arg
    }

    @Pointcut("execution(void aspectspring4.Lens.*(..))")
    public void cameraRelatedAction() {
        // * for any return,method or class .. for any arg
    }

    @Before("cameraSnap()")
    public void aboutToTakePhoto() {
        // Camel Case is need for the class, method, and arg
        System.out.println("About to take photo...");
    }

    @Before("cameraSnapName()")
    public void aboutToTakePhotoWithName() {
        System.out.println("About to take photo with name..");
    }

    @Before("cameraRelatedAction()")
    public void aboutToDoCameraRelatedAction() {
        System.out.println("Doing something with cameras..");
    }



}

