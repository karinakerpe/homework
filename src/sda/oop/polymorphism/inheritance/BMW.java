package sda.oop.polymorphism.inheritance;

public class BMW extends Vehicle {
public BMW (){
    super("BMW");
}

    @Override
    public void startIgnition() {
        System.out.println("Start with a remote");


    }
    public void engageGear (){
        System.out.println("Start with 1 gear");
    }
}
