package sda.method;

public class MethodExamplesNew {

    public static void main(String[] args) {
        MethodExamples.publicMethod();
//        firstMethod(); - mēģina atrast šajā klasē, ja nav šajā klasē, jāizmanto klase.metode
//        MethodExamples.secondMethod(); - secondMethod ir private tapēc nevar piekļūt
        MethodExamples.packageProtectedMethod();


        MethodExamples.protectedMethod();

    }
}
