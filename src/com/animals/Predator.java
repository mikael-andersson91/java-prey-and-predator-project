package com.animals;

/**
 * Created by Mikael on 2016-12-10.
 */
public class Predator extends Animal {

    private double huntDistance;
    public Predator(){
        super();
        this.huntDistance = 15;
    }

    private boolean checkHuntLimit(Prey prey){
        double preyPosX = prey.getPosX();
        double preyPosY = prey.getPosY();

        double xSide = super.getPosX() - preyPosX;
        double ySide = super.getPosX() - preyPosY;

        double distanceToPrey = Math.sqrt(Math.pow(xSide,2) + Math.pow(ySide,2));

        if (distanceToPrey < huntDistance) {
            return true;
        }
        return false;
    }

    private void hunt(){

    }
    @Override
    public void lookForFood() {
        //TODO: Add a foreach loop instead of "prey" to check for any nearby prey
        Prey prey = new Prey();
        if (checkHuntLimit(prey))
            hunt();
        else
            roam();
    }
}
