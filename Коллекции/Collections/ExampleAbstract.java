package Collections;

// 3 task

abstract class Vehicle {

    public void start() {
        System.out.println("Vehicle is starting");
    }


    public abstract void drive();
}


class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}


class Bike extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike is driving");
    }
}



