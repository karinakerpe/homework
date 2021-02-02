package sda.homework;

import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number:");
        a = scanner.nextInt();
        System.out.println("enter second number:");
        b = scanner.nextInt();
        System.out.println("enter third number:");
        c = scanner.nextInt();
        int smallestInteger;
        if (a < b) {
            smallestInteger = Math.min(a, c);
        } else {
            smallestInteger = Math.min(b, c);
        }
        System.out.println("Smallest value is :" + smallestInteger);
    }

}
