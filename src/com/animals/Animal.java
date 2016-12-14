package com.animals;

import java.util.Random;

/**
 * Created by Mikael on 2016-12-10.
 */
public abstract class Animal {
    private double posX;
    private double posY;
    private double energyLevel;

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    private Random random;

    public Animal(){
        random = new Random();
        posX = random.nextDouble();
        posY = random.nextDouble();
        energyLevel = 50.0;
    }
    public abstract void lookForFood();

    public void roam(){

    }

    protected void movement(){

    }


}
