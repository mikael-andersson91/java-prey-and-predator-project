package environment;

import java.util.Random;

/**
 * Created by Mikael on 2016-12-11.
 */
public class Grass extends Resource{

    public int length;
    public Grass(double x, double y){
        super(x, y);
        Random random = new Random();
        length = random.nextInt(6);
    }
}
