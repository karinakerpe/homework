package sda.oop.object;

public class Pen {
    static final Integer LENGHT = 10;

    //state of the class
    String name;
    String color;

    //behavior of the class
    void write() {
        System.out.println("I have a "+color+" color to write.");
    }
}
