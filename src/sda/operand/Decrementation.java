package sda.operand;

import java.sql.SQLOutput;

public class Decrementation {
    public static void main(String[] args) {
        int number1 = 5;
        System.out.println("Number 1:  "+number1);
//post decrementation
        int number2 = number1 --;
        System.out.println("Number 1:  "+number1+"\tNumber 2:  "+number2);
//pre decrementation
        int number3 = --number1;
        System.out.println("Number 1:  "+number1+"\tNumber 3:  "+number3);

    }
}
