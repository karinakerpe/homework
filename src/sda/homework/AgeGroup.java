package sda.homework;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:  ");
        age = scanner.nextInt();

        System.out.printf("You are %d years old, ", age);
        if (age < 1 && age >=0) {
            System.out.println("you are infant.");
        } else if (age >= 1 && age <= 11) {
            System.out.println("you are child.");
        } else if (age >= 12 && age <= 17) {
            System.out.println("you are teen.");
        } else if (age >= 18 && age <= 64) {
            System.out.println("you are adult.");
        } else if (age >= 65 && age <= 115) {
            System.out.println("you are older adult.");
        } else {
            System.out.print("and this is impossible! \nHumans max recorded age is 115, or you entered negative number.");
        }


    }
}
