package sda.oop.polymorphism.inheritance;

public class Truck extends Vehicle {
    public Truck (){
        super("Truck");
    }
    public void drive() {

        System.out.println("This truck is not driving");

    }
}
