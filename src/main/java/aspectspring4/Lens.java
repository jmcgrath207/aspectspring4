package aspectspring4;

import org.springframework.stereotype.Component;

/**
 * Created by root on 6/7/17.
 */
@Component("lens")
public class Lens {

    public void zoom(int factor) {
        System.out.println("Zooming lens: "+ factor);
    }

}
