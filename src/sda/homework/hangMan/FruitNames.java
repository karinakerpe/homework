package sda.homework.hangMan;

public class FruitNames {
    public static String[] fruitNames() {
        String[] fruit1 = {"p", "e", "a", "r"};
        String[] fruit2 = {"b", "a", "n", "a", "n","a"};
        String[] fruit3 = {"m", "a", "n", "g", "o"};
        String[] fruit4 = {"c", "h", "e", "r","r","y"};
        String[] fruit5 = {"g", "r", "a", "p", "e"};
        String[] fruit6 = {"p", "o", "m", "e","l","o"};
        String[] fruit7 = {"o", "r", "a", "n", "g", "e"};
        String[] fruit8 = {"p", "i", "n", "e", "a", "p", "p", "l", "e"};
        String[] fruit9 = {"l", "e", "m", "o", "n"};
        String[] fruit10 = {"w", "a", "t", "e", "r", "m", "e", "l", "o", "n"};
        String[] wordLetters = null;

        int random = (int) (Math.random() * 10) + 1;
        switch (random) {
            case 1:
                wordLetters = fruit1;
                break;
            case 2:
                wordLetters = fruit2;
                break;
            case 3:
                wordLetters = fruit3;
                break;
            case 4:
                wordLetters = fruit4;
                break;
            case 5:
                wordLetters = fruit5;
                break;
            case 6:
                wordLetters = fruit6;
                break;
            case 7:
                wordLetters = fruit7;
                break;
            case 8:
                wordLetters = fruit8;
                break;
            case 9:
                wordLetters = fruit9;
                break;
            case 10:
                wordLetters = fruit10;
                break;
            default:
        }

        return wordLetters;
    }
}
