package com.ujiancode.no5;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable(8);

        String[] items = {
                "Anting", "Baju", "Celana", "Gelas",
                "Gunting", "Handphone", "Buku", "Garpu"
        };

        for (String item : items) {
            ht.insert(item);
        }

        ht.display();
    }
}

