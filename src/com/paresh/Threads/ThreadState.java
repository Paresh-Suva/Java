package com.paresh.Threads;
class ThreadState extends Thread {

    @Override
    public void run() {
        System.out.println("State Of Thread --> RUNNING"); // RUNNING
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {

        ThreadState thread = new ThreadState();
        System.out.println("State Of Thread --> "+thread.getState()); // NEW

        thread.start();
        System.out.println("State Of Thread --> "+thread.getState()); // RUNNABLE

        Thread.sleep(100);
        System.out.println("State Of Thread --> "+thread.getState()); // TIMED_WAITING

        thread.join();
        System.out.println("State Of Thread --> "+thread.getState()); // TERMINATED

         
    }
}