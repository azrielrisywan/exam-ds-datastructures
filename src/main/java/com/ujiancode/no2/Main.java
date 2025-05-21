package com.ujiancode.no2;

public class Main {
    public static void main(String[] args) {
        int[] data = {
                43, 5, 9, 42, 6, 11, 41, 36, 16, 35,
                14, 30, 25, 7, 13, 100, 12, 70, 24, 40
        };

        SingleLinkedList list = new SingleLinkedList();

        // a. Insert semua angka dan tampilkan
        System.out.println("a. Insert semua angka:");
        for (int num : data) {
            list.insert(num);
        }
        list.display();

        // b. Insert angka 15 setelah angka 12
        System.out.println("\nb. Insert angka 15 setelah angka 12:");
        list.insertAfter(12, 15);
        list.display();

        // c. Delete angka 24
        System.out.println("\nc. Delete angka 24:");
        list.delete(24);
        list.display();
    }
}
