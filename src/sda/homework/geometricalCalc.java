package sda.homework;

import java.util.Scanner;

public class geometricalCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To calculate area of a square 'A'\nenter value of its side 'a':");
        double squareSide = scanner.nextDouble(), areaS;

        while (squareSide <= 0) {
            System.out.print("!!! Sorry, but square's side must be a positive decimal and greater than '0'.\nEnter value of its side 'a':  ");
            squareSide = scanner.nextDouble();
        }
        areaS = squareSide * squareSide;

        System.out.println("square area S = a\u00B2" + " = " + areaS + "\n-----\n");
        System.out.println("To calculate area of a circle'A'\nenter value of circle's radius 'r':  ");

        double cRadius = scanner.nextDouble(), areaC;

        while (cRadius <= 0) {
            System.out.print("!!! Sorry, but circle's radius must be a positive decimal and greater than '0'.\nEnter a radius 'r':  ");
            cRadius = scanner.nextDouble();
        }
        areaC = cRadius * cRadius * 3.14;

        System.out.println("circle area = \u03C0r\u00B2" + " = " + areaC + "\n-----\n");

    }
}
