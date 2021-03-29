package sda.method;

public class RecursiveFunction {
    private static int counter = 0; //definēšana ārpus metodes

    public static void main(String[] args) {
int number = 8;

        System.out.println("Result:  " + factorial(number));
//        recursive();
        System.out.println("Factorial with recursive method: "+factorialWithRecursive(number));


    }

    public static int factorialWithRecursive(int number) {
        if (number == 1) {
            return 1;
        } else {
            System.out.println("numer is :"+number);
            return number * factorialWithRecursive(number - 1);

        }
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }


    public static void recursive() {
        if (counter < 10) {
            counter++;
            System.out.printf("%d.time the recursive is  calling it self\n", counter);
            recursive();
        }
    }


}
