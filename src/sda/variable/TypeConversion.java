package sda.variable;

public class TypeConversion {
    public static void main(String[] args) {
        byte smallestIntegerType = 127;
        short shortDataType = smallestIntegerType; //droša pāreja no mazākā uz lielāku
        int intDataType = shortDataType;
        long longDataType = intDataType;
        //pretēji ejot nepieciešams type casting, can loose data
        double doubleDataType = longDataType;
        //float floatDataType = (float) doubleDataType; this is type casting, can loose value
        float floatDataType = intDataType;
        char charDataType = 'A';
        intDataType = charDataType;
        System.out.println((int) charDataType);//prints unicode of char A'

        int number = 123456789;
        System.out.println("Int number: "+number);
        float numberConvertedToFloat = number;//ciparts ar *E8
        System.out.println("Int number shown in float:  "+numberConvertedToFloat);
    }
}
