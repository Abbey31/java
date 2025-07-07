public class StringConcatenator {
    // Basic varargs method
    public static String concatenate(String... strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            if (s != null) {
                result.append(s).append(" ");
            }
        }
        return result.toString().trim();
    }

    // Varargs with delimiter
    public static String concatenateWithDelimiter(String delimiter, String... strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                result.append(strings[i]);
                if (i < strings.length - 1) {
                    result.append(delimiter);
                }
            }
        }
        return result.toString();
    }

    // Main method to test
    public static void main(String[] args) {
        // Test cases
        System.out.println(concatenate("Hello", "World", "Java")); // Expected: Hello World Java
        System.out.println(concatenate()); // Expected: ""
        System.out.println(concatenate("Single")); // Expected: Single
        System.out.println(concatenate("Hello", null, "World")); // Expected: Hello World
        System.out.println(concatenateWithDelimiter("-", "A", "B", "C")); // Expected: A-B-C
        System.out.println(concatenateWithDelimiter(",", null, "Test")); // Expected: Test

        // Test with array
        String[] words = {"X", "Y", "Z"};
        System.out.println(concatenate(words)); // Expected: X Y Z
    }
}