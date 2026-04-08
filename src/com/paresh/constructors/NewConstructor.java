package com.paresh.constructors;

class Hello {
    public Hello() {
        System.out.println("Hello...");
    }
}

class World extends Hello {
    public World() {
        System.out.println("World...");
    }
}

public class NewConstructor {

    static void main(String[] args) {

        World world = new World();


    }
}
