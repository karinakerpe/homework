package sda.method.Array;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] unsortedNumbers = {200, 30, 40, 3, 64, 10};
        System.out.println("Sorted numbers : "+ Arrays.toString(unsortedNumbers));

        final int [] sortedNumbers = sort(unsortedNumbers);
        System.out.println("Sorted numbers : "+ Arrays.toString(sortedNumbers));
            }

    public static int[] sort(int[] unsortedNumbers) {
//        for (int i = 0; i < unsortedNumbers.length; i++) {
//            System.out.printf("%d,",unsortedNumbers[i]);
//        }
//        return null;

        // {200, 40, 30, 60, 10, 150};
        // {40, '200', 30, 60, 10, 150}; when i = 1;
        // {40, 200, '30', 60, 10, 150}; when i = 2;
        for (int i = 1; i < unsortedNumbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (unsortedNumbers[i] < unsortedNumbers[j]) {
                    int tempValue = unsortedNumbers[j];
                    unsortedNumbers[j] = unsortedNumbers[i];
                    unsortedNumbers[i] = tempValue;
                }
            }
//            System.out.printf("%d,", unsortedNumbers[i]);
        }
        return unsortedNumbers;
    }
}

