package com.ujiancode.no3;

class CircularQueueLinkedList {
    private Node rear = null;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            rear = newNode;
            rear.next = rear;
        } else {
            newNode.next = rear.next;
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void display() {
        if (rear == null) {
            System.out.println("Queue kosong");
            return;
        }

        System.out.print("Circular Queue (Linked List): ");
        Node temp = rear.next;
        do {
            System.out.print(temp.data + (temp != rear ? " -> " : ""));
            temp = temp.next;
        } while (temp != rear.next);
        System.out.println();
    }
}
