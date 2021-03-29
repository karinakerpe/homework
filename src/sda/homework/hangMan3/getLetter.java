package sda.homework.hangMan3;

import java.util.Scanner;

public class getLetter {
    public static String getLetter(){
        System.out.println("\nEnter letter or guess word: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().toUpperCase();
    }
}
