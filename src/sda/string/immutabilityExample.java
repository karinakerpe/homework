package sda.string;

public class immutabilityExample {

    public static void main(String[] args) {
        String message = "This is a";
        System.out.println(message.hashCode());
        // message += " new Message";
        message += "new Message"; // This is a new message
        System.out.println(message.hashCode());
        Integer value = new Integer(1);
        System.out.println(System.identityHashCode(value.hashCode()));
        value = 1;
        System.out.println(System.identityHashCode(value.hashCode()));
        String text1 = "This is a test";
        String text2 = "This is a test";
        System.out.println(Integer.toHexString(text1.hashCode()));
        String text3 = new String("This is a test");
        System.out.println(Integer.toHexString(text2.hashCode()));
        if (text1 == text2) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal object");
        }
        if (text1 == text3) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal object");
        }
        if (text1.equals(text2) && text1.equals(text3)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal object");
        }
    }
}
