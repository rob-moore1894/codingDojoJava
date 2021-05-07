package assignment_stringmanipulation;

public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("   Hello   ", "   World   ");
        System.out.println(str); // HelloWorld

        StringManipulator manip = new StringManipulator();
        char letter = 'o';
        Integer a = manip.getIndexOrNull("Coding", letter);
        Integer b = manip.getIndexOrNull("Hello World", letter);
        Integer c = manip.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        StringManipulator strMan = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = strMan.getIndexOrNull(word, subString);
        Integer e = strMan.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null

        StringManipulator concatSub = new StringManipulator();
        String concatWord = concatSub.concatSubstring("Hello", 1, 2, "world");
        System.out.println(concatWord); // eworld
    }
}
