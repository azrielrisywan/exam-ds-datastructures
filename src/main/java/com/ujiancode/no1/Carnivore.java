package com.ujiancode.no1;

public class Carnivore extends Animal {
    public Carnivore(String name, String species) {
        super(name, species);
    }

    @Override
    public void foodInfo() {
        System.out.println(getName() + " (" + getSpecies() + ") makan daging.");
    }
}
