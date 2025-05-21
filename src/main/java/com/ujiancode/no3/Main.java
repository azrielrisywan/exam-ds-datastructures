package com.ujiancode.no3;

public class Main {
    public static void main(String[] args) {
        int[] data = {
                43, 5, 9, 42, 6, 11, 41, 7, 13, 100,
                12, 70, 24, 40, 36, 16, 35, 14, 30, 25
        };

        System.out.println("=== Circular Queue - Array ===");
        CircularQueueArray queueArray = new CircularQueueArray(20);
        for (int num : data) {
            queueArray.enqueue(num);
        }
        queueArray.display();

        System.out.println("\n=== Circular Queue - Linked List ===");
        CircularQueueLinkedList queueList = new CircularQueueLinkedList();
        for (int num : data) {
            queueList.enqueue(num);
        }
        queueList.display();
    }
}
