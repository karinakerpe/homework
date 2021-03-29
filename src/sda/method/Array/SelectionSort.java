package sda.method.Array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedNumbers = {200, 30, 40, 3, 64, 10};
        System.out.println("Sorted numbers : " + Arrays.toString(unsortedNumbers));

        final int[] sortedNumbers = sort(unsortedNumbers);
        System.out.println("Sorted numbers : " + Arrays.toString(sortedNumbers));


    }

    public static int[] sort(int[] unsortedNumbers) {
        for (int i = 0; i < unsortedNumbers.length - 1; i++) {

            int indexOfMinimum = i;
            int minimumElement = unsortedNumbers[i];
            for (int j = (i + 1); j < unsortedNumbers.length; j++) {
                if (minimumElement > unsortedNumbers[j]) {
                    minimumElement = unsortedNumbers[j];
                    indexOfMinimum = j;
                }

            }
            int tempVal = unsortedNumbers[i];
            unsortedNumbers[i] = unsortedNumbers[indexOfMinimum];
            unsortedNumbers[indexOfMinimum] = tempVal;
        }
return unsortedNumbers;
    }

}

