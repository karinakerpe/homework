package sda.variable;

public class TypeCasting {

    public static void main(String[] args) {
        double doubleType = 99.9989747474747474747494938694035;
        int number = (int) doubleType;
        System.out.println("Floating point value: "+doubleType+"\tafter casting int: "+ number);

        long longType = (long) doubleType;//bez 'l' uzskatīs par int
        System.out.println("Floating point value: "+doubleType+"\tafter casting loang: "+ longType);

        float floatType = (float) doubleType;
        System.out.println("Floating point value: "+doubleType+"\tafter casting float: "+ floatType);

        int a =10, b=20;
        double divison = a/b; // result 0.0, jo definēti kā int
        double division2 = (double)a/b; // result 0.5
        System.out.println("Division result:  "+divison);
        System.out.println("Division result:  "+ division2);
    }
}
