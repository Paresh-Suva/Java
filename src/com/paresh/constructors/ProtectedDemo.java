package com.paresh.constructors;

class Demo {
    protected Demo() {
        System.out.println("Hello....");
    }
}

public class ProtectedDemo {
    static void main(String[] args) {
        Demo demo = new Demo();

    }
}
