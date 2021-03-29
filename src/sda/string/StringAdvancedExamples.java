package sda.string;

import sda.homework.hangMan.Congratulations;

import java.util.Arrays;

public class StringAdvancedExamples {
    public static void main(String[] args) {
        int age = 36;
        String name = "Karina";
        String text2 = "THIS IS A TEXT MESSAGE";
        String text = "This is a text message";
        char[] textToCharArrays = text.toCharArray();
        System.out.println("This is the length of the array: " + textToCharArrays.length);
        System.out.println("This is the char array: " + Arrays.toString(textToCharArrays));

        String[] textSplit = text.split(" ");
        System.out.println("This is the text with split by space: " + Arrays.toString(textSplit));

        String numericString = String.valueOf(100);
        System.out.println(numericString);

        String newText = String.join("#", textSplit);
        System.out.println(newText);

        System.out.println(String.copyValueOf(textToCharArrays));
        System.out.println(String.valueOf(textToCharArrays));


        System.out.println(String.format("Your name:%s and age: %d", name, age));
        int i = text.compareToIgnoreCase(text2);//strādā kā equals, bet returns 0, ja vienādi; salīdzina unicodes
        System.out.println(i);

        String textA = new String("Text");
        String textB = new String("TEXT");

        if (textA.equals(textB)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        if (textA.equalsIgnoreCase(textB)){
            System.out.println("with compare: equal");
        }else{
            System.out.println("with compare: not equal");
        }
        int i1 = textA.compareToIgnoreCase(textB);
        System.out.println(i1);

        System.out.println(textA.startsWith("Text"));//gives boolean

    }

}
