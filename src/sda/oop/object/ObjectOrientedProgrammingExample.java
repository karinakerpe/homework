package sda.oop.object;

public class ObjectOrientedProgrammingExample {


    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.color = "RED";
        pen.name = "Schwarz";
        pen.write();
        Pen pen2 = new Pen();
        pen2.write();//nav vēl iedotas vērtības, tapēc būs 'null'
//Pen.LENGHT;
        System.out.println(Pen.LENGHT);
        pen2.color = "GREY";
        pen2.name = "Schwarz";
        pen2.write();
        System.out.println(String.format("Pen name: %s, pen color: %s", pen.name, pen.color));
        System.out.println(String.format("Pen name: %s, pen color: %s", pen2.name, pen2.color));
        System.out.println(pen.hashCode());
        System.out.println(pen2.hashCode());

    if(pen.equals(pen2)){
        System.out.println("equals");
    }else{
        System.out.println("not equals");
    }
        if(pen.name.equals(pen2.name)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }

    }

}
