package sda.string;

public class textConcatenation {

    public static void main(String[] args) {
        char[] textSettext1 = {'M', 'y'};
        String text1 = "My name is";
        String space = " ";
        String text2 = "John Doe";

        //text1 += text2; - old method

        final String concat = text1.concat(space).concat(text2);
        System.out.println("Contanced string:" + concat);
        System.out.printf("Lengh of the first text: %s is %d\n", text1, text1.length());
//to upper case and lower case


        final String uppcaseText2 = text2.toUpperCase();
        final String loverCaseText2 = text2.toLowerCase();
        System.out.printf("Original text is '%s' and the Upper Case Format is '%s'", text2, uppcaseText2);
        System.out.printf("\nOriginal text is '%s' and the Lower Case Format is '%s", text2, loverCaseText2);


        String content = "The indexOf() method returns the position of the first occurrence of the specified text in a string of characters (the counting is performed together with white characters, e.g. a space) - the position is counted from the value 0 (the first item). An example follows:";
        String searcItem = "e";
        int indexOfSpecifiedText = content.indexOf(searcItem);
        int nexh = content.indexOf(searcItem, indexOfSpecifiedText);
        if (indexOfSpecifiedText >= 0) {
            System.out.printf("\nSearching item '%s' is found in the index of %d", searcItem, indexOfSpecifiedText);
            System.out.printf("\n '%s'is fiund in index %d", searcItem, nexh);
        } else {
            System.out.printf("\n no accurencies found.");
        }
//        text1.replaceAll()
        String text = "Ha ha ha! nice joke xxxxxy";
        String substring = text.substring(text.indexOf("joke"));
        System.out.println("\nSubstring content:" + substring);
        String substring1 = text.substring(text.indexOf("joke"), text.length() - 1);
        System.out.println("other substring: "+substring1);

//        String  containsObject = "This is object for contains usage ";
        String  containsObject = "lemon";
        System.out.println(containsObject.contains("This"));//case sensitive
        System.out.println(containsObject.toUpperCase().contains("this".toUpperCase()));


        if(containsObject!=null &&!containsObject.isEmpty()){
            System.out.println("Your string is not empty");
        }else{
            System.out.println("Your object is empty");
        }

        String[] split = containsObject.split("");
        for (int i = 0; i < split.length; i++) {
            System.out.println("This is splitted: "+split[i]);
        }

    }

    }

