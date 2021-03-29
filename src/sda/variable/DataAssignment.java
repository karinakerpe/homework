package sda.variable;

public class DataAssignment {
    public static void main(String[] args) {
    // atņemšana substract  old and new
        int variableA = -5;

        variableA = variableA -1;
       // variableA -= 100;


        System.out.println("Result:    "+variableA);

        // saskaitīšana SUM  old and new
        int variableB = 100;
        variableB = variableB +10;//100+10=110
        variableB += 20;//110+20=130
        //variableB++;
        System.out.println("Result:  "+variableB);

        // division  old and new
        double variableC = -40;
        variableC = variableC / 8; //40/8=5
        variableC /= 2; //5/2=2 rounded value if int
        System.out.println("Result for VarableC: " +variableC);

        // multiplication  old and new
        int variableD = -13;
        variableD = variableD * 15; //13*15=195
        variableD *= 2; //195*2=390 rounded value
        System.out.println("Result for VarableD: " +variableD);



    }
}
