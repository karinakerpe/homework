package sda.homework.hangMan;

public class Congratulations {
    public static void main(String[] args) {
        intro();
    }
    public static void congratulations (String wordFull) {
        System.out.println("\nYou won! ");
        System.out.print("\nIt's: \t" + wordFull);
        System.out.println("\n\u2728Congratulations!\u2728");
    }

    public static void intro (){
//        System.out.println("\u2B51"+"\u2612"+"\u2714"+"\u2705  \u2716  \u2728  \u274C");
        System.out.println("\u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728");
        System.out.println("\t\tSTART THE GAME!");
        System.out.println("\u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728");
        System.out.println("\n\u2714 To win the game guess the word! \u2714\n\u2716 Be warned, every time you guess a letter wrong you loose a life! \u2716\n\u2B51 You have 5 lives!\u2B51");
//        System.out.println("\u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728 \u2728");
        System.out.println("Lets begin!\n\n");
    }
    public static void line (String[]wordLetters){
        System.out.println("");
        for (int i = 0; i < wordLetters.length; i++) {
            System.out.print("\u27B0");
        }
    }
    public static void printingString (String[]printOut){
        for (int j = 0; j < printOut.length; j++) {
            System.out.print(printOut[j]);
        }

    }
}
