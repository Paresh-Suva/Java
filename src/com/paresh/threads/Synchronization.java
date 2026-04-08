package com.paresh.threads;

public class Synchronization {
    static void main(String[] args) {

        Counter counter = new Counter();
        MyThread T1 = new MyThread(counter);
        MyThread T2 = new MyThread(counter);

        T1.start();
        T2.start();

        try {
            T1.join();
            T2.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(counter.getCount());
    }


}
