package com.animals;

/**
 * Created by Mikael on 2016-12-10.
 */
public class Predator extends Animal {

    public Predator(){
        super();
    }

    public void hunt(){
        //kolla avstånd till byte baserat på pythagoras sats, jaga om tillräckligt nära.
    }

    @Override
    protected void lookForFood() {
        hunt();
    }
}
