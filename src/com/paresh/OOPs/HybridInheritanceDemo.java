package com.paresh.OOPs;

// First interface
interface Vehicles {
    void start();
}

// Second interface
interface ElectricVehicle extends Vehicles {
    void chargeBattery();
}

// Class implementing the extended interface
class Tesla implements ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Tesla is starting...");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Tesla is charging its battery...");
    }
}

// Main class
public class HybridInheritanceDemo {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.start();          // From Vehicle interface
        tesla.chargeBattery();  // From ElectricVehicle interface
    }
}
