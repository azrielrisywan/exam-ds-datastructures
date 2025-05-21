package com.ujiancode.no1;

public class Main {
    public static void main(String[] args) {
        Animal rusa = new Herbivore("Rusa", "Cervidae");
        Animal harimau = new Carnivore("Harimau", "Panthere tigris");

        rusa.foodInfo();
        harimau.foodInfo();
    }
}