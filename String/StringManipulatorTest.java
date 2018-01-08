public class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("string1   ", "    string2");
        System.out.println(str);

        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null


        StringManipulator smanipulator = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer q = smanipulator.getIndexOrNullOf(word, subString);
        Integer r = smanipulator.getIndexOrNullOf(word, notSubString);
        System.out.println(q); // 2
        System.out.println(r); // null

        StringManipulator qmanipulator = new StringManipulator();
        String words = qmanipulator.concatSubstringy("Hello", 1, 2, "world");
        System.out.println(words); // eworld

    }
}