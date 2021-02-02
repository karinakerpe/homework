package sda.homework;

import java.util.Scanner;

public class geometricalCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To calculate area of a square 'A'\nenter value of its side 'a':");
      //square area
        double squareSide = scanner.nextDouble(), areaS;

        while (squareSide <= 0) {
            System.out.print("!!! Sorry, but square's side must be a positive decimal and greater than '0'.\nEnter value of its side 'a':  ");
            squareSide = scanner.nextDouble();
        }

        areaS = Math.pow(squareSide, 2);
        System.out.println("square area S = a\u00B2 = " +squareSide+"\u00B2 = " + areaS + "\n-----\n");
        //circle area
        System.out.println("To calculate area of a circle 'A'\nenter value of circle's radius 'r':  ");
        double cRadius = scanner.nextDouble(), areaC;

        while (cRadius <= 0) {
            System.out.print("!!! Sorry, but circle's radius must be a positive decimal and greater than '0'.\nEnter a radius 'r':  ");
            cRadius = scanner.nextDouble();
        }
        areaC = Math.pow(cRadius, 2) * Math.PI;
        System.out.println("circle area = \u03C0r\u00B2 = \u03C0 x "+cRadius+"\u00B2  =" + areaC + "\n-----\n");
        //Rectangles area
        System.out.println("To calculate area of a rectangle 'A'\nenter value of its side 'a':");
        double recSideA = scanner.nextDouble();
        while (recSideA <= 0) {
            System.out.print("!!! Sorry, but rectangle's side must be a positive decimal and greater than '0'.\nEnter value of its side 'a':  ");
            recSideA = scanner.nextDouble();
        }
        System.out.println("enter value of its side 'b':");
        double recSideB = scanner.nextDouble(), recArea;
        while (recSideB <= 0) {
            System.out.print("!!! Sorry, but rectangle's side must be a positive decimal and greater than '0'.\nEnter value of its side 'b':  ");
            recSideB = scanner.nextDouble();
        }

        recArea = recSideA * recSideB;

        System.out.println("rectangle area A = a x b = "+recSideA+" x " +recSideB+ " = " + recArea + "\n-----\n");
    }
}
