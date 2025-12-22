package com.paresh.Threads;

class World1 implements Runnable{
    @Override
    public void run(){
        for( ; ; ){
            System.out.println("World");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        World1 world = new World1();
        Thread thread = new Thread(world);
        thread.start();

        for( ; ; ){
            System.out.println("Hello");
        }
    }
}
