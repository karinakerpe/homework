package sda.variable;

import javax.sound.midi.Soundbank;

public class DataTypeExample {
    //identifaer ir nosaukums, jābeidzas ar ; , ja nav metode psvm
//    pieejami tikai šajā klasē, un nevar piekļūt no citurienes
    private int number;
    private int number1;

    //    šo varēs no citurienes izsaukt
//    public int number2;
    //main method., vienmēr jābūt vienai galvenajai metodei; ar šo jāsāk
    public static void main(String[] args) {
//        private int number3;
//data type ir int
        int value = 0; // uses 4 bytes
//        šos labi zināt, jo var samazināt atmiņas izmantošanu
        byte numericType = 127; //uses 1 byte -128 to 127
        short shortnumericType = 32767; //uses 2 byte -32768 to 32767
        int intnumericType = 1233456543; //-2147483648 to 2147483647
        long longnumericType = 48484848484848484L; //jānorāda L beigās; 8 bytes; 63 bits MAX, bez L būs int
//     floanig piont
        double doublefloatingNumbertype = 10.12345; //ietilpība long
        float floatnumberType = 10.12345f; // jāizmanto f lai atpazītu kā float ietilpīga int

        System.out.println(numericType);
        System.out.println(shortnumericType);
        System.out.println(intnumericType);
        System.out.println(longnumericType);
        System.out.println(doublefloatingNumbertype);
        System.out.println(floatnumberType);


        int sum = numericType + 1000;
        System.out.println("This is the first calculation: " + sum);
//        string is not primitive java data type
        String message = "this is first msg to \n\t" +
                "show how to use String \n";
        String alphabet = "a b c\n";
//        System.out.println(value);
//        System.out.println("Our first integer variable value is : " + value);
//        var dažādi izmantot; un var defināt dažādi 1.piemērs
//        pievienojām int un tas tika pārvēst tekstā no skaitļa vērtības
        String finalMassage = "First time:\t" + alphabet + "next message:\t" + message + "   " + value;
        System.out.println(finalMassage);
//        STRING - Non-numeric
        String s = "Supertext \n next line";
//        char; based on The Unicode
        char c = 65;
// logictype

        boolean logicType = true;
        System.out.println("LogicTypeA:    " + logicType);
        logicType = false;
        System.out.println("LogicTypeB:    " + logicType);


// otrais piemērs
        System.out.println("First time:      " + alphabet + " next message: " + message);
        // GeeksforGeeks
        System.out.println("GEEKS FOR GEEKS TESTS");
        boolean b = true;
        if (b == true)
            System.out.println("Hi geek!");
        byte a = 126;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        //char c = 'G';
        //System.out.println(c);
        int i = 89;
        byte b1 = 4;
        //byte b2 = 887777788888;
        short i1 = 56;
        double v = 4.355453532;
        float f = 4.7333434f;
        System.out.println("char: " + c);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b1);
        System.out.println("short: " + i1);
        System.out.println("float: " + f);
        System.out.println("double: " + v);
        //String s = "GeeksforGeeks";
        String s1 = new String("GeeksforGeeks");

        Double object = new Double("2.4");
        int a5 = object.intValue();
        byte b5 = object.byteValue();
        float d = object.floatValue();
        double c5 = object.doubleValue();

        System.out.println(a5 + b5 + c5 + d);
        System.out.println(a5);
        System.out.println(b5);
        System.out.println(d);
        System.out.println(c5);

        int x = 15;    // LINE A
        int y = x;    // LINE B
        System.out.println("sākuma vērtība      " + y);
        x = 1;
        y = x;
        System.out.println("pirmā vērtība    " + y);
        // x= long 10000000000;
        int z = y + 20;    // LINE C

        System.out.println("x = " + x);    // LINE D
        System.out.println("y = " + y);    // LINE E
        System.out.println("z = " + z);    // LINE F

        String name = "Ram";
        char section = 'A';
        int rollNum = 20;
//        boolean end = 1;
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNum);
        //System.out.println("Result: " + status);
    }

}

