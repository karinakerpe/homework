package sda.string;


import java.util.Locale;

public class stringExamples {

    public static void main(String[] args) {
        String value = null;//empty, no value, no proper object in memory
        String message = "Hello world!";
//radam object
        String message2 = new String("New Message!");
        System.out.println("Value:" + value);
        value = "";
        System.out.println("Value after new value :" + value);

        System.out.println("Message1: " + message);
        System.out.println("Message2: " + message2);

        message.toLowerCase(Locale.ENGLISH);


    }

}
