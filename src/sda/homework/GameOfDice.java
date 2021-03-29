package sda.homework;

import java.util.Scanner;

public class GameOfDice {
    public static void main(String[] args) {

        int resultFinalPlayer = 0, resultPlayer, resultFinalCPU = 0, counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!\nThis is GAME OF DICE.\nScore 100 points first and you are the winner!\nLets play!");

        do {
            //Player 1
           // System.out.println("Press 'Enter' to roll dice");
           // scanner.nextLine(); //from google
            System.out.println("-ROUND  " + counter + "-");
            int dice1 = (int) ((Math.random() * 6) + 1);
            int dice2 = (int) ((Math.random() * 6) + 1);
            resultPlayer = dice1 + dice2;
            resultFinalPlayer += resultPlayer;
            System.out.printf("Player 1\trolled %d / %d, score %d\n", dice1, dice2, resultFinalPlayer);
            //CPU
            int diceA = (int) ((Math.random() * 6) + 1);
            int diceB = (int) ((Math.random() * 6) + 1);
            int resultCPU = diceA + diceB;
            resultFinalCPU += resultCPU;
            System.out.printf("CPU\t\t\trolled %d / %d, score %d\n", diceA, diceB, resultFinalCPU);
            counter++;

        }
        while (resultFinalPlayer < 100 && resultFinalCPU < 100);

//        while (resultFinalPlayer < 100 && resultFinalCPU < 100) {
//
//            //Player 1
//            //System.out.println("Press 'Enter' to roll dice");
//            //scanner.nextLine(); //from google
//            System.out.println("-ROUND  " + counter + "-");
//            int dice1 = (int) ((Math.random() * 6) + 1);
//            int dice2 = (int) ((Math.random() * 6) + 1);
//            resultPlayer = dice1 + dice2;
//            resultFinalPlayer += resultPlayer;
//            System.out.printf("Player 1\trolled %d / %d, score %d\n", dice1, dice2, resultFinalPlayer);
//            //CPU
//            int diceA = (int) ((Math.random() * 6) + 1);
//            int diceB = (int) ((Math.random() * 6) + 1);
//            int resultCPU = diceA + diceB;
//            resultFinalCPU += resultCPU;
//            System.out.printf("CPU\t\t\trolled %d / %d, score %d\n", diceA, diceB, resultFinalCPU);
//            counter++;
//        }


        if (resultFinalPlayer > resultFinalCPU && resultFinalCPU < 100) {
            System.out.println("\n----- THE WINNER IS PLAYER 1 ------");

        } else if (resultFinalCPU > resultFinalPlayer && resultFinalPlayer < 100) {
            System.out.println("\n------- THE WINNER IS CPU -------");
        } else {
            System.out.println("\n-------------- TIE ---------------");
        }

        System.out.println("Total score Player 1: " + resultFinalPlayer + ",  CPU: " + resultFinalCPU);
        int totalRounds = counter - 1;
        System.out.println("Total rounds:  " + totalRounds);


    }
}
