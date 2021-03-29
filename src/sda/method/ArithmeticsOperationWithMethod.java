package sda.method;

import java.util.Scanner;

public class ArithmeticsOperationWithMethod {
    public static void main(String[] args) {
       int exit;
        do {
           showOptions();
           readInputs();
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nPress 'y' if you want to continue,\nelse press eny key.\n");
//            try{
//                to handle the exeptions
//            }
           exit = scanner.next().charAt(0);
       }while (exit == 'y');

    }

    public static void showOptions() {
        System.out.println("Enter valid operation for calculation\n+: SUM\n-: SUB\n*: MUL\n/: DIV");
    }

    public static void readInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        final double a = scanner.nextDouble();
        System.out.println("Enter number 2: ");
        final double b = scanner.nextDouble();
        System.out.println("Enter operation: ");
        final char operation = scanner.next().charAt(0);
        doCalculation(operation, a, b);
    }

    public static void doCalculation(char operation, double a, double b) {
        double result = 0;
        switch (operation) {
            case '+':
                result = sum(a, b);
                break;
            case '-':
                result = subtract(a, b);
                break;

            case '*':
                result = mult(a, b);
                break;
            case '/':
                result = div(a, b);
                break;
            default:
                System.out.println("Entered not a valid operation!");

        }
        System.out.printf("%.2f %c %.2f = %.2f", a, operation, b, result);
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double div(double a, double b) {
        if (b != 0) {

            return a / b;
        } else {
//            System.out.printf("You can not divide ");
            return Double.NaN;
        }
    }

    public static double mult(double a, double b) {
        return a + b;

    }
}
