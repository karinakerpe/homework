package sda.math;

import sda.method.ArithmeticsOperationWithMethod;

import java.util.Scanner;

public class MathOperation {
//    public static double NON_CONSTANT_PI = 3.14159265358979323846;
//    public static final double Constant_PI = 3.14159265358979323846; // final nevar mainīt vērtību

    public static void main(String[] args) {
//        Constant_PI = 3.14; final nozīmē, ka nevar mainīt vērtību
//NON_CONSTANT_PI= 3.14; // var mainīt vērtību
        ArithmeticsOperationWithMethod.showOptions();
        double radius = 4.0;
        double circleArea = Math.pow(radius, 2) * Math.PI;
        System.out.println("Circle Area, 'r' = 4; Math.pow and PI:  " + circleArea);

        int edge = 5;
        int areaOfSquare = (int) Math.pow(edge, 2);
        System.out.println("area of square = " + areaOfSquare);
        Scanner scanner = new Scanner(System.in);
        System.out.println("number");
        final double nextDouble = scanner.nextDouble();
        System.out.println(nextDouble);
    }
}
