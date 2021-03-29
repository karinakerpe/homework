package sda.homework.HangManTogether;

import java.util.Arrays;
import java.util.Scanner;

public class HangManTogether {
    public static void main(String[] args) {




            String guessWord = "LATVIA";
            int userScore = 0;
            boolean isGuessed = false;
            char[] guessWordInChar = new char[guessWord.length()];
            char[] usedLetters = new char[26];
            int countOfTheUsedLetters = 0;
            System.out.println("Welcome to the Hangman Game, Please try to guess following word!");
            for (int i = 0; i < guessWord.length(); i++) {
                guessWordInChar[i] = '-';
            }
            System.out.println(Arrays.toString(guessWordInChar));
            int live = 5;
            do {
                System.out.println("\nPlease enter your letter");
                Scanner scanner = new Scanner(System.in);
                final char guessedLetter = scanner.next().charAt(0);
                usedLetters[countOfTheUsedLetters] = guessedLetter;
                int indexOfGuessedLetter = guessWord.indexOf(guessedLetter);
                int numberOfCorrectGuess = 0;
                if (indexOfGuessedLetter > -1) {
                    while (indexOfGuessedLetter > -1) {
                        numberOfCorrectGuess++;
                        userScore++;
                        guessWordInChar[indexOfGuessedLetter] = guessedLetter;
                        indexOfGuessedLetter = guessWord.indexOf(guessedLetter, indexOfGuessedLetter + 1);
                    }
                    System.out.printf("There is/are %d letter(s) '%c' in the word \n", numberOfCorrectGuess, guessedLetter);
                    System.out.println(Arrays.toString(guessWordInChar));
                    System.out.println("Do you want to guess the word? (Yes/NO)");
                    final String option = scanner.next();
                    if (option.equalsIgnoreCase("Yes")) {
                        System.out.println("Please enter you guess?");
                        final String userGuess = scanner.next();
                        if (userGuess.equalsIgnoreCase(guessWord)) {
                            System.out.println("Congratulation! You've guessed the word!!!");
                            isGuessed = true;
                        } else {
                            System.out.println("Unfortunately, It was not a correct guess!!!");
                            live = 0;
                            isGuessed = false;
                        }
                        break;
                    } else {
                        continue;
                    }
                } else {
                    --live;
                    System.out.printf("The letter '%c' does not exist", guessedLetter);
                }
                countOfTheUsedLetters++;
            } while (live > 0);
            if (isGuessed) {
                System.out.printf("Your score is %d \n", userScore * 10);
            } else if (live == 0) {
                System.out.println("Game is Over!!!");
            }
        }
    }