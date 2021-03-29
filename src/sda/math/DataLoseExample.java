package sda.math;

import sda.method.MethodExamples;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataLoseExample {
    public static void main(String[] args) {
//Bigdecimal usage
        double div = (double) 10/3; //3.333333333333333333333333
        BigDecimal bigDecimal = new BigDecimal(div).setScale(4, RoundingMode.UP);
        System.out.println("double: " + div+"\tBigDecimal with scaling and rounding:   "+bigDecimal);

        double value = 0.4;
       //while (){}//vajag loģisku nosacījumu lai pārtrauktu
//loop that happens 100 times
        for (int i = 0; i < 1000; i++) {
            value += 0.2;
            //if run 10 times and sum 0.2 = 1000x0.2=200 + 0.4 = 200.4
        }
        System.out.println("value after 1000 times:  " +value);
        BigDecimal bigDecimal2 = new BigDecimal(value).setScale(4, RoundingMode.UP);
        System.out.println("'Value' value after bigDecimal"+bigDecimal2);

    }
}
