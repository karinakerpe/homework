package sda.oop.polymorphism.inheritance;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.drive();

        Audi audi = new Audi();
        audi.drive();

        Truck truck = new Truck();
        truck.drive();

    }
}
