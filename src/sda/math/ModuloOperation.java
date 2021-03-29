package sda.math;

import sda.method.MethodExamples;

public class ModuloOperation {

    public static void main(String[] args) {

        // first number :7, second number: 4 7%4 = 3 dalīšana un nosaka atlikummu
        //a:6, b:3 6%3 = 0
        //a:9, b:5 9%5=4
        int a =10, b=3;
        int resultOfModulo = a % b;
        double resultOfDivision = (double) a/b;
        System.out.println("Modulo operation result for a%b =   "+resultOfModulo);
        System.out.println("Division operation result for a/b =   "+resultOfDivision);

    }
}
