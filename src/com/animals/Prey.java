package com.animals;

/**
 * Created by Mikael on 2016-12-10.
 */
public class Prey extends Animal {

    public Prey()
    {
        super();
    }

    @Override
    protected boolean lookForFood() {
        return true;
    }

    @Override
    protected void roam() {

    }

    @Override
    public void roundOfSimulation(){

    }
    protected void avoid(){

    }
}
