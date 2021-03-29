package sda.oop.polymorphism.inheritance;

public class Audi extends Vehicle{
    public Audi (){
        super("Audi");
    }
    public void engageGear(){
        System.out.println("Gear is automatically engaged");
    }
}
