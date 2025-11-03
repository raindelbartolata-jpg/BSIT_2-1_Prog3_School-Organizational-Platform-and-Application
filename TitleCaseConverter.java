public class TitleCaseConverter {
    public static String toTitleCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word.substring(0, 1).toUpperCase())
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        // Remove trailing space
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world this is a test";
        String output = toTitleCase(input);
        System.out.println("Original: " + input);
        System.out.println("Title Case: " + output);  // Output: "Hello World This Is A Test"
    }
}