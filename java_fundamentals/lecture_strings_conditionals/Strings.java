package lecture_strings_conditionals;

public class Strings {
    // Strings, like any other object, belong to a class. Instances of the String class are immutable, so once you create a String, it cannot be modified.

    public static void main(String[] args) {
        // Methods
        // Length
        String ninja = "This place is awesome!";
        int length = ninja.length();
        System.out.println("String length is: " + length); // String length is: 22

        // Concatenate
        String string1 = "My name is ";
        String string2 = "Rob";
        String string3 = string1.concat(string2);
        System.out.println(string3); // My name is Rob
            // In this case, you can still use the +
        System.out.println(string1 + string2); // My name is Rob

        // Format - another way of concatenating strings
        String phrase = String.format("Hey %s, you owe me $%.2f!", "Hangman", 12.0);
        System.out.println(phrase);

        // IndexOf - searches left-to-right inside the given string for a "target" string. Returns the index number where the target string is first found or -1 if not found.
        String welcome = "Welcome to the competition!";
        int a = welcome.indexOf("competition");
        int b = welcome.indexOf("co");
        int c = welcome.indexOf("party");
        System.out.println(a); // 15
        System.out.println(b); // 3
        System.out.println(c); // -1

        // trim() - removes any trailing or leading white spaces within the string
        String sentence = "    spaces everywhere    ";
        System.out.println(sentence.trim()); // spaces everywhere

        // Uppercase and Lowercase
        String first = "HELLO";
        String second = "world";
        System.out.println(first.toLowerCase()); // hello
        System.out.println(second.toUpperCase()); // WORLD

        // Equality - we can compare the equality of a string in two ways. Do they refer to the exact same object, or do they have the same exact sequence of characters? 
        String strA = new String("word");
        String strB = new String("word");
        System.out.println(strA == strB); // false. Not the same exact object
        System.out.println(strA.equals(strB)); // true. Same exact characters

    }
}
