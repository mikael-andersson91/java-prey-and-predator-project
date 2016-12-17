package com.animals;

import environment.Map;
import environment.Perception;

import java.util.Random;

/**
 * Created by Mikael on 2016-12-10.
 */
public abstract class Animal {
    protected double posX;
    protected double posY;
    protected double energyLevel;
    Map perceptionMap;
    Perception currentPerception;

    public final double MAXIMUM_ENERGY_LEVEL = 50.0;
    protected double velocity;

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
        energyLevel = MAXIMUM_ENERGY_LEVEL;
    }

    protected abstract boolean lookForFood();

    //distanceToAnimal returns a 3 sized array containing the distance to an animal as a triangle consisting of a horizontal (xSide), vertical (ySide) and straightLineToPrey
    protected double[] distanceToAnimal(Animal animal){

        double xSide = getPosX() - animal.getPosX();
        double ySide = getPosX() - animal.getPosY();

        double straightLineToPrey = Math.sqrt(Math.pow(xSide,2) + Math.pow(ySide,2));

        return new double[] {xSide,ySide,straightLineToPrey};
    }

    protected abstract void eat();

    protected abstract void roam();

    protected void movement(){

    }

    public abstract void roundOfSimulation();

}
