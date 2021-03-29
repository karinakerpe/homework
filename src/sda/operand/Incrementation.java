package sda.operand;

public class Incrementation {
    public static void main(String[] args) {

        //post incrementation
        int number1 = 5;
        System.out.println("Number 1:  "+number1);
        int number2 = number1++;
        System.out.println("Number 1:  "+number1+"\tNumber2:  "+number2); // number2 ņem vērtību pirmo reizi tāpēc 5

        //pre incrementation
        int number3 = ++number1;
        System.out.println("Number 1:  "+number1+"\tNumber3:  "+number3);

        int number4 = number1++;
        System.out.println("Number 1:  "+number1+"\tNumber4:  "+number4);
    }
}
