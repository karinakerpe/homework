package sda.homework;

import java.util.Scanner;

public class arithmeticCalc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number A:");
        double numberA = scanner.nextDouble();
        System.out.println("Enter number B:");
        double numberB = scanner.nextDouble();
        double sum = numberA + numberB, sub = numberA - numberB, mul = numberA * numberB, div = numberA / numberB;
        System.out.println("calculations if " + "A = " + numberA + " ; " + "B= " + numberB);
        System.out.println("A + B =\t" + sum);
        System.out.println("A - B =\t" + sub);
        System.out.println("A x B =\t" + mul);
        System.out.println("A : B =\t" + div);

    }
}
