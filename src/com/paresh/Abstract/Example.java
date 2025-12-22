package com.paresh.Abstract;

class TwoWheeler extends Vehicles {

    @Override
    public void method() {
        System.out.println("This is TwoWheeler method");
    }
}

public class Example {

    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.display();
        twoWheeler.method();
    }
}
