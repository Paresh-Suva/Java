package com.paresh.Project;

class Vehicle{
    String Make;
    String Model;
    void startEngine(){};
    void stopEngine(){};
}

class Car extends Vehicle{
    
    Car() {
        Make = "Toyota";
        Model = "Corolla";
    }

    void Details (){
        System.out.println("Make: " + Make + " Model: " + Model);
    }

    @Override
    void startEngine(){
        System.out.println("Car Engine Started... ");
    }

    @Override
    void stopEngine(){
        System.out.println("Car Engine Stopped... ");
    }
}

class Truck extends Vehicle{

    Truck() {
        Make = "Toyota";
        Model = "Hilux";
    }

    void Details (){
        System.out.println("Make: " + Make + " Model: " + Model);
    }

    @Override
    void startEngine(){
        System.out.println("Truck Engine Started... ");
    }

    @Override
    void stopEngine(){
        System.out.println("Truck Engine Stopped... ");
    }
}

class Motorcycle extends Vehicle{

    Motorcycle() {
        Make = "Honda";
        Model = "CBR";
    }

    void Details (){
        System.out.println("Make: " + Make + " Model: " + Model);
    }
    @Override
    void startEngine(){
        System.out.println("Motorcycle Engine Started... ");
    }

    @Override
    void stopEngine(){
        System.out.println("Motorcycle Engine Stopped... ");
    }
}

interface Electric{
    void chargeBattery();
}

class ElectricCar extends Car implements Electric{

    ElectricCar() {
        Make = "Tesla";
        Model = "Model S";
    }

    @Override
    void startEngine(){
        System.out.println("Electric Car Engine Started... ");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Electric Car Battery Charging... ");
    }

    @Override
    void stopEngine(){
        System.out.println("Electric Car Engine Stopped... ");
    }


}



public class Vehicals {
    public static void main(String[] args) {

        Car car = new Car();
        car.startEngine();
        
        Truck truck = new Truck();
        truck.startEngine();
        
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        
        ElectricCar electricCar = new ElectricCar();
        electricCar.startEngine();
        electricCar.chargeBattery();

        motorcycle.stopEngine();
        electricCar.stopEngine();
        truck.stopEngine();
        car.stopEngine();
        

    }
}
