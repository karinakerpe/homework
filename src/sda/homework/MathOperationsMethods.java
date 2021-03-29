package sda.homework;

import java.util.Scanner;

public class MathOperationsMethods {

    public static void main(String[] args) {
        char exit;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number 1: ");
            double number1 = scanner.nextDouble();
            System.out.println("Enter Number 2: ");
            double number2 = scanner.nextDouble();
            System.out.println("choose an operator: +,-,/ or *");
            char operator = scanner.next().charAt(0); //reads first char

            sumCalculation(operator, number1, number2);
            minCalculation(operator, number1, number2);
            mulCalculation(operator, number1, number2);
            divCalculation(operator, number1, number2);

            System.out.println("Press 'y' if you want to continue, else press eny key.");
            exit = scanner.next().charAt(0);
        } while (exit == 'y');
    }

    public static void sumCalculation(char operator, double number1, double number2) {
        if (operator == '+') {
            double sum;
            sum = number1 + number2;
            System.out.printf("%.2f + %.2f = %.2f\n", number1, number2, sum);
        }
    }

    public static void minCalculation(char operator, double number1, double number2) {
        if (operator == '-') {
            double min;
            min = number1 - number2;
            System.out.printf("%.2f - %.2f = %.2f\n", number1, number2, min);
        }
    }

    public static void mulCalculation(char operator, double number1, double number2) {
        if (operator == '*') {
            double mul;
            mul = number1 * number2;
            System.out.printf("%.2f x %.2f = %.2f\n", number1, number2, mul);
        }
    }

    public static void divCalculation(char operator, double number1, double number2) {
        if (operator == '/' && number2 != 0) {
            double div;
            div = number1 / number2;
            System.out.printf("%.2f x %.2f = %.2f\n", number1, number2, div);
        } else if (number2 == 0) {
            System.out.println("You entered 0 as second number, division is not possible.");
        }

    }
}
