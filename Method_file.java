import java.util.Arrays;

public class Method_file {

    public static void main(String[] args) {

        // Basic Strings
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "JAVA";
        String s4 = "  java programming  ";

        // 1. length()
        System.out.println("Length of s1: " + s1.length());

        // 2. charAt()
        System.out.println("Character at index 1 in s1: " + s1.charAt(1));

        // 3. concat()
        System.out.println("Concatenation: " + s1.concat(" " + s2));

        // 4. equals()
        System.out.println("Equals (JAVA vs JAVA): " + s3.equals("JAVA"));

        // 5. equalsIgnoreCase()
        System.out.println("Equals Ignore Case (JAVA vs java): " 
                           + s3.equalsIgnoreCase("java"));

        // 6. toUpperCase()
        System.out.println("Uppercase: " + s4.toUpperCase());

        // 7. toLowerCase()
        System.out.println("Lowercase: " + s3.toLowerCase());

        // 8. substring()
        System.out.println("Substring (0 to 5): " + s4.trim().substring(0, 5));

        // 9. contains()
        System.out.println("Contains 'gram': " + s4.contains("gram"));

        // 10. startsWith()
        System.out.println("Starts with '  ja': " + s4.startsWith("  ja"));

        // 11. endsWith()
        System.out.println("Ends with '  ': " + s4.endsWith("  "));

        // 12. trim()
        System.out.println("Trimmed string: '" + s4.trim() + "'");

        // 13. replace()
        System.out.println("Replace 'java' with 'python': " 
                           + s4.replace("java", "python"));

        // 14. replaceAll()
        System.out.println("Replace all 'a' with '@': " 
                           + s4.replaceAll("a", "@"));

        // 15. split()
        String[] words = s4.trim().split(" ");
        System.out.println("Split words: " + Arrays.toString(words));

        // 16. indexOf()
        System.out.println("First index of 'a': " + s4.indexOf('a'));

        // 17. lastIndexOf()
        System.out.println("Last index of 'a': " + s4.lastIndexOf('a'));

        // 18. isEmpty()
        String emptyStr = "";
        System.out.println("Is empty string empty? " + emptyStr.isEmpty());

        // 19. compareTo()
        System.out.println("CompareTo (Apple vs Banana): " 
                           + "Apple".compareTo("Banana"));

        // 20. valueOf()
        int number = 100;
        String numberStr = String.valueOf(number);
        System.out.println("ValueOf number: " + numberStr);

        // 21. join()
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("Joined string: " + joined);

        // 22. toCharArray()
        char[] charArray = s1.toCharArray();
        System.out.println("Character array: " + Arrays.toString(charArray));

        // 23. matches()
        String digits = "12345";
        System.out.println("Matches only digits? " 
                           + digits.matches("[0-9]+"));



    }
}
