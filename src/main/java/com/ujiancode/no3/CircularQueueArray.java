package com.ujiancode.no3;

class CircularQueueArray {
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueueArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue penuh. Tidak bisa menambahkan: " + data);
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;

        if (front == -1) {
            front = rear;
        }

        size++;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }

        System.out.print("Circular Queue (Array): ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + (i < size - 1 ? " -> " : ""));
        }
        System.out.println();
    }
}

