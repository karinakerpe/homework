package sda.homework.hangMan;

public class YouLose {
    public static void youLose (boolean flag, String wordFull){
        if (flag) {
            System.out.println("\n\u274C You lost! \u274C\nThe word was:  " + wordFull);
        }
    }
}
