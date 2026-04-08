package com.paresh.threads;

public class Counter {

    private int count = 0;

    // Critical section
    public synchronized void increment() {
        count++;

    }

    public int getCount() {
        return count;
    }
}
