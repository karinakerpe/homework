package sda.homework.hangMan3;

import sda.homework.hangMan.Congratulations;
import sda.homework.hangMan.YouLose;

import java.util.Arrays;
import java.util.Scanner;

public class hangMan3 {

    public static void main(String[] args) {
        Congratulations.intro();
        char command;
        do {
            String[] fruitNames = {"plum", "grape", "apple", "orange", "lemon", "banana", "cherry","pear","mango","watermelon"};
            int indexRandom = (int) (Math.random() * fruitNames.length);
            String word = fruitNames[indexRandom];
            word = word.toUpperCase();
            String[] lettersOfWord = word.split("");
            String[] guessedWord = new String[word.length()];
            Arrays.fill(guessedWord, "\u2B1C");
            System.out.println("Guess this fruit:\nIt is " + guessedWord.length + " letters:");
            Congratulations.printingString(guessedWord);

            int guessCount = 0;
            String lettersGuest = "";
            boolean flag = true;
            String letter;
            do {
                letter = getLetter.getLetter();

                if (lettersGuest.contains(letter)) {
                    System.out.println("You already guested that!");
                } else if (word.contains(letter)) {
                    for (int i = 0; i < word.length(); i++) {
                        if (lettersOfWord[i].equals(letter)) {
                            guessedWord[i] = letter;
                            flag = false;
                        }}

                } else {
                    guessCount++;
                    System.out.printf("Mistake!\t %d/5\n", guessCount);
                    flag = true;
                }
                lettersGuest = lettersGuest.concat(letter).concat(", ");

                if (Arrays.equals(guessedWord, lettersOfWord) || word.equals(letter)) {
                    Congratulations.congratulations(word);
                    guessCount = 5;
                    flag = false;
                } else {
                    System.out.println("You guest: " + lettersGuest);
                    Congratulations.printingString(guessedWord);
                    Congratulations.line(guessedWord);
                }


            } while (guessCount < 5);

            YouLose.youLose(flag, word);
            System.out.println("\nIf you want to continue press 'y'\nTo 'Exit' press any key");
            Scanner scanner = new Scanner(System.in);
            command = scanner.next().charAt(0);
        } while (command == 'y');

    }
}
