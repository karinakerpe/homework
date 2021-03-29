package sda.variable;

import java.util.Scanner;

public class AgeCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // vai arī šo ar static pirms metodes un nebūs tad katrā metodē jānorāda Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current Year:");
        short currentYear = scanner.nextShort();

        System.out.println("Enter your date of birth:   ");
        short dataOfBirth = scanner.nextShort();//gaidīs līdz iedos vērtību Terminal
//        short age = (currentYear-dataOfBirth); - nestrādās jo default ir int
        int age = currentYear - dataOfBirth;
        char smile = ':';
        char smile2 = ')';
        String end = "Your Age is:\t";
        System.out.println(end + age + "\n" + smile + smile2);

    }
}
