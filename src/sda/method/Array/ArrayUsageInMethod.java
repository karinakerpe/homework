package sda.method.Array;

import java.util.Arrays;
import java.util.Locale;

public class ArrayUsageInMethod {
    public static void main(String[] args) {


        String[] days = {"SUNDAY", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        printDays(days);

        System.out.println(getDaysByFormatting(days));
        System.out.println(Arrays.toString(toLowerCase(days))+"- mazie burti");

    }

    public static void printDays(String[] days) {
        System.out.println(Arrays.toString(days));
    }

    public static String getDaysByFormatting(String[] days) {
        String formattedString = "[";
        for (int i = 0; i < days.length; i++) {
            if (i== days.length-1){
                formattedString = formattedString + days[i]+"] - sanāca tāds pacs kā toArrays";
            }else {
                formattedString = formattedString + days[i] + ", ";
            }
        }
        return formattedString;
    }

    public static String[] toLowerCase (String[] days){
        for (int i = 0; i < days.length; i++) {
            days[i]=days[i].toLowerCase(Locale.ENGLISH);
            
        }
        return days;


        
    }

}
