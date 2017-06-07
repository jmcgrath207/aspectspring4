package aspectspring4;

import org.springframework.stereotype.Component;

/**
 * Created by root on 6/6/17.
 */

@Component("camera")
public class Camera {

    public void snap() {
        System.out.println("SNAP!");
    }


    public void snap(int exposure) {
        System.out.println("SNAP! Exposure: " + exposure);
    }

    public String snap(String name) {
        System.out.println("SNAP! Name: " + name);
        return name;
    }

    public void snapNighttime() {
        System.out.println("SNAP! Night mode.");
    }


}
