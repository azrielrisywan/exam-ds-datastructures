package com.ujiancode.no5;

public class HashTable {
    private final String[] table;
    private final int size;

    public HashTable(int size) {
        this.size = size;
        table = new String[size];
    }

    private int hash(String key) {
        int asciiSum = 0;
        for (char ch : key.toCharArray()) {
            asciiSum += (int) ch;
        }
        return asciiSum % size;
    }

    public void insert(String key) {
        int index = hash(key);
        int originalIndex = index;

        while (table[index] != null) {
            index = (index + 1) % size;
            if (index == originalIndex) {
                System.out.println("Hash table full. Tidak bisa insert: " + key);
                return;
            }
        }

        table[index] = key;
        System.out.println("Inserted \"" + key + "\" at index " + index);
    }

    public void display() {
        System.out.println("\nIsi Hash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + (table[i] != null ? table[i] : "[Kosong]"));
        }
    }
}
