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
        for (int i = 0; i < numberOfResources; i++) {
            double posX = (double)random.nextInt((int)width);
            double posY = (double)random.nextInt((int)height);
            int resourceType = random.nextInt(3);
            if(resourceType == 0){
                Grass grass = new Grass();
                resources.add(grass);
            }
            else if(resourceType == 1){
                Rock rock = new Rock();
                resources.add(rock);
            }
            else if(resourceType == 2) {
                Water water = new Water();
                resources.add(water);
            }
        }
    }
}
