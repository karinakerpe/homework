package sda.method;
//import java.lang.Math;
public class MathOperation {
    public static void main(String[] args) {
         //double result = circleArea(6);
        System.out.println("Result: "+circleArea(5));
        circleArea2(5);
        System.out.println("Result: "+circleArea(7));
        circleArea2(7);

        System.out.println("Result: "+circleArea(8));
        circleArea2(8);

        System.out.println("Result: "+circleArea(9));
        circleArea2(9);

    }

    //    circle area = Math.PI and radius -> double (rezultāts būs decimālis)
    public static double circleArea(double radius) {
        // double radius = 5.7; - lai nebūtu noteikts, un lai varētu aprēķināt
        System.out.println("Area is being calculated for the circle, when the radius is: " + radius);
//        double circleAre = Math.PI * Math.pow(radius, 2);
//        return circleAre;
        return Math.PI * Math.pow(radius, 2);
    }
    public static void circleArea2(double radius) {
        // double radius = 5.7; - lai nebūtu noteikts, un lai varētu aprēķināt
        System.out.println("Area is being calculated for the circle, when the radius is:" + radius);
        double circleAre = Math.PI * Math.pow(radius, 2);
        System.out.println("Result inside method: "+circleAre);
}}
