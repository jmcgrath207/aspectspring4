package aspectspring4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Camera camera = (Camera)context.getBean("camera");
        Lens lens = (Lens) context.getBean("lens");

        camera.snap();

        camera.snap(1000);

        camera.snap("The castle");

        camera.snapNighttime();


        lens.zoom(5);


        context.close();
    }

}
