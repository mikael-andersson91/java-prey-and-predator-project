package com.animals;

import java.util.ArrayList;

/**
 * Created by Mikael on 2016-12-10.
 */
public class Predator extends Animal {

    private final double HUNT_RANGE;
    private final int HUNT_TIME_LIMIT;
    private int huntDuration;

    private Prey targetedPrey;

    public Predator(){
        super();
        this.HUNT_RANGE = 15;
        this.HUNT_TIME_LIMIT = 15;
    }

    @Override
    public void roundOfSimulation() {
        lookForFood();
    }

    private boolean checkHuntLimit(Prey prey){
        double[] distanceToPrey = distanceToAnimal(prey);

        if (distanceToPrey[2] < HUNT_RANGE) {
            targetedPrey = prey;
            return true;
        }
        return false;
    }

    private void hunt(){
        //TODO: This list of Prey is a placeholder
        ArrayList preyPlaceHolder = new ArrayList<Prey>();
        for (Object prey:preyPlaceHolder) {
            if (checkHuntLimit((Prey)prey))
                targetedPrey = (Prey)prey;
        }
        //TODO: Move at "x" speed in targetedPreys direction
        huntDuration--;
    }

    //make boolean of lookForFood?
    @Override
    protected boolean lookForFood() {
        //TODO: Add a foreach loop instead of "prey" to check for any nearby prey
        Prey prey = new Prey();
        if (huntDuration < HUNT_TIME_LIMIT) {
            if (checkHuntLimit(prey)){
                targetedPrey = prey;
                huntDuration = HUNT_TIME_LIMIT + 1;
                //hunt();
                return true;
            }
            else{
                //roam();
                return false;
            }
        }
        else{
            //hunt();
            return true;
        }
    }

    //TODO: Overall structure in place, needs more specifics like how movement works and such
    @Override
    protected void roam() {
        if(lookForFood())
            hunt();
        else
            movement();
    }
}
