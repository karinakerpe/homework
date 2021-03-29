package sda.homework.hangMan2;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class hangMan2 {



        public static void main(String[] args) {
            boolean iterated = false;
            int attempts = 0;
            String temp = "";
            String holder = "";
            String guessWord = "";
            Scanner scanner = new Scanner(System.in);
            Random randomWord = new Random();
            System.out.println("Welcome to my first word game!\nPlease note you will only get 5 attempts to guess the right word.");
            int command = 1;
            do {
                System.out.println("\nPlease choose word category (1-3):\n1 - countries\n2 - fruits & vegetables\n3 - movies");
                boolean validInput = false;
                int category = 0;
                while (!validInput) {
                    try {
                        category = scanner.nextInt();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please choose word category (1-3):\n1 - countries\n2 - fruits & vegetables\n3 - movies");
                        scanner.next();
                    }
                }
                if (category == 1) {
                    String[] countries = {"LATVIA", "ESTONIA", "TURKEY", "USA", "BELGIUM", "MEXICO", "AUSTRALIA", "MALTA", "SWEDEN", "CHILE", "SPAIN", "ITALY", "ROMANIA", "RUSSIA", "CHINA", "JAPAN"};
                    guessWord = countries[randomWord.nextInt(countries.length)];
                } else if (category == 2) {
                    String[] fruitsVegetables = {"WATERMELON", "STRAWBERRY", "ONION", "POTATO", "BANANA", "GARLIC", "BROCCOLI", "KALE", "GRAPEFRUIT", "ORANGE"};
                    guessWord = fruitsVegetables[randomWord.nextInt(fruitsVegetables.length)];
                } else if (category == 3) {
                    String[] movies = {"THE GODFATHER", "THE DIG", "THE SHAWSHANK REDEMPTION", "TITANIC", "FIGHT CLUB", "GLADIATOR", "SAVING PRIVATE RYAN", "NEWS OF THE WORLD", "PULP FICTION", "INCEPTION"};
                    guessWord = movies[randomWord.nextInt(movies.length)];
                } else {
                    System.out.println("You did not enter a number from 1 - 3. Try again!\nPlease choose word category (1-3):\n1 - countries\n2 - fruits & vegetables\n3 - movies");
                    category = scanner.nextInt();
                }
                System.out.printf("You chose category %d!\n", category);
                Scanner guessScanner = new Scanner(System.in);
                do {
                    System.out.println("Please enter your letter or punctuation guess:");
                    String guessLetter = guessScanner.nextLine();
                    guessLetter = guessLetter.toUpperCase();
                    if (guessLetter.equals(guessWord)) {
                        System.out.println("You guessed correctly! It is: " + guessWord);
                        break;
                    } else {
                        for (int i = 0; i < guessWord.length(); i++) {
                            if (guessLetter.equals(Character.toString(guessWord.charAt(i)))) {
                                if (!iterated)
                                    temp += Character.toString(guessWord.charAt(i));
                                else {
                                    holder = Character.toString(temp.charAt(i)).replace("-", guessLetter);
                                    temp = temp.substring(0, i) + holder + temp.substring(i + 1, temp.length());
                                }
                            } else {
                                if (!iterated) {
                                    temp += "-";
                                }
                            }
                        }
                        attempts++;
                        iterated = true;
                        System.out.println(temp);
                        if (temp.equals(guessWord)) {
                            System.out.println("You guessed correctly! It is: " + guessWord);
                            break;
                        }
                    }
                }
                while (attempts < 5);
                if (attempts >= 5) {
                    System.out.println("You ran out of attempts. The word you had to guess was " + guessWord + ". Better luck next time!");
                }
                iterated = false;
                attempts = 0;
                temp = "";
                holder = "";
                guessWord = "";
                System.out.println("If you would like to play again, please press 1. If not, please press any other number.");
                validInput = false;
                command = 0;
                while (!validInput) {
                    try {
                        command = scanner.nextInt();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please press 1 to play again or press any other number to exit the program.");
                        scanner.next();
                    }
                }
            } while (command == 1);
            if (command != 1) {
                System.out.println("Goodbye!");
            }
        }
    }


