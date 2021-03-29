package sda.oop.polymorphism.inheritance;

public class Vehicle {
    private final String name;

    public Vehicle(String name) {
        this.name = name;

    }

    public void drive() {
        System.out.println("----------------Driving " + name + "--------------------");
        startIgnition();
        engageGear();
        startMoving();
    }

    public void startIgnition() {
        System.out.println("Start ignition");
    }

    public void engageGear() {
        System.out.println("engage");
    }

    public void startMoving() {
        System.out.println("Move");
    }


}
