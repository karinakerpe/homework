package sda.math;


import java.util.Scanner;

/**
 * ciparu 1345 uz 1,3,4,5
 * x,,w,y,z
 */
public class FourDigitSeperation {
    public static void main(String[] args) {
        int number = 1345;
        int x, w, y, z;
        z = number % 10;

        y = (number % 100) / 10; // 1345 % 100 = 45, 45/10 = 4
        w = (number % 1000) / 100; // 1345 % 1000 = 345, 345/100 = 3
        x = (number % 10000) / 1000;

        System.out.println("Your 4-digit number is:  " + number);
        System.out.println("x:" + x + ", w:" + w + ", y: " + y + ", z: " + z);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter (any amount of digit) number:");
        number = scanner.nextInt();

        //initial number : 1234567
        while (number > 0) { //jānosaka apstākļi  kas loop pārtrauks
            System.out.print(number % 10+",");
            number = number / 10; //123456 un nevis 123456.7 jo ir int un pēdējais 1 dos 0


        }


    }


}
