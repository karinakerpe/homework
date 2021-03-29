package sda.homework.hangMan;

import java.util.Arrays;
import java.util.Scanner;

public class GameGangManMain {
    public static void main(String[] args) {
        char command;
        boolean flag = true;


        Congratulations.intro();
        do {
            int guessCount = 0;
            String lettersGuest = "";
            boolean mistake = true;

            String[] wordLetters = FruitNames.fruitNames();

            String[] wordToGuess = new String[wordLetters.length];
            String wordFull = "";

            for (int i = 0; i < wordToGuess.length; i++) {
                wordToGuess[i] = "\u2B1C";
                wordFull = wordFull.concat(wordLetters[i]);
            }

            System.out.println("Guess this fruit:\nIt is " + wordToGuess.length + " letters:");
            Congratulations.printingString(wordToGuess);
            do {

                System.out.println("\nGuess a letter or guess word:");
                Scanner scanner = new Scanner(System.in);
                String letter = scanner.next();
                lettersGuest = lettersGuest.concat(letter).concat(" ");


                if (wordFull.equals(letter)) {
                    Congratulations.congratulations(wordFull);
                    guessCount = 5;
                    flag = false;
                } else if (!Arrays.equals(wordLetters, wordToGuess)) {
                    mistake = true;
                    for (int j = 0; j < wordLetters.length; j++) {
                        if (wordLetters[j].equals(letter)) {
                            wordToGuess[j] = letter;
                            mistake = false;
                        }
                    }
                    if (mistake) {
                        guessCount++;
                        System.out.printf("Mistake! %d/5", guessCount);
                    }
                    flag = true;
                    System.out.println("\nYou guest:  " + lettersGuest + " ");
                    Congratulations.printingString(wordToGuess);

                    Congratulations.line(wordLetters);
                }
                if (Arrays.equals(wordLetters, wordToGuess)) {
                    Congratulations.congratulations(wordFull);
                    guessCount = 5;
                    flag = false;
                }
            } while (guessCount < 5);

            YouLose.youLose(flag, wordFull);

            System.out.println("\nIf you want to continue press 'y'\nTo 'Exit' press any key");
            Scanner scanner = new Scanner(System.in);
            command = scanner.next().charAt(0);
        } while (command == 'y');

    }
}