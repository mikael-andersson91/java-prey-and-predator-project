package environment;

import com.animals.Animal;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Mikael on 2016-12-11.
 */
public class Map {
    private double height;
    private double width;
    //int hej = Math.nextAfter()

    public ArrayList resources;
    public ArrayList animals;
    private Random random;

    public Map(){
        random = new Random();
        animals = new ArrayList<Animal>();
        resources = new ArrayList<Resource>();
        setResources();
    }

    public Map(ArrayList animals){
        this.animals = animals;
        this.resources = new ArrayList<Resource>();
        setResources();
    }

    private void setResources(){
        int numberOfResources = random.nextInt(100);
        int i = numberOfResources - 1;
        if (i >= 0)
            do {
            double posX = (double) random.nextInt((int) width);
            double posY = (double) random.nextInt((int) height);
            int resourceType = random.nextInt(3);
                switch (resourceType) {
                    case 0:
                        Grass grass = new Grass(posX,posY);
                        resources.add(grass);
                        break;
                    case 1:
                        Rock rock = new Rock(posX,posY);
                        resources.add(rock);
                        break;
                    case 2:
                        Water water = new Water(posX,posY);
                        resources.add(water);
                        break;
                }
            i--;
        } while (i >= 0);
    }
}
