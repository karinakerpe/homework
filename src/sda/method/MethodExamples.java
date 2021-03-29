package sda.method;

public class MethodExamples {

//public - access to all, protected, private (access method modifier and shows accessibility)
//    private - access only form this class
//    protected - can be accsessible from extended class

//    package protected - when you do not specify the access mo, var piekļūt no vienas package, ja nav norādīts nekas

    //static - behaivor; method can be calle over class,no need to create object reference
//    void - return type /void - no return value

    public static void publicMethod() {
        System.out.println("This is firstMethod public and does not return value as its void");

        Math.random();
        final double pi = Math.PI;
    }


    public static void main(String[] args) {
        MethodExamples.publicMethod(); //calling the method ar class.method
        publicMethod();
        MethodExamples.packageProtectedMethod();
        packageProtectedMethod();
        packageProtectedMethod();
    }
     static void packageProtectedMethod() {
        System.out.println("This is package protected Method and does not return value as its void");

    }
    private static void privateMethod() {
        System.out.println("This is privateMethod and does not return value as its void");

    }
    protected static void protectedMethod (){
        System.out.println("This is protectedMethod and does not return value as its void");

    }

}
