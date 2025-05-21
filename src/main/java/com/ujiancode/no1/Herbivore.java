package com.ujiancode.no1;

public class Herbivore extends Animal {
    public Herbivore(String name, String species) {
        super(name, species);
    }

    @Override
    public void foodInfo() {
        System.out.println(getName() + " (" + getSpecies() + ") makan tumbuhan.");
    }
}
