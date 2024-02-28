public class StringExamples {

    public static void main(String[] args) {
        // 1. Creating Strings
        String name = "Parham";
        String quote = "The best way to predict the future is to create it. - Abraham Lincoln";
        String fact = "A BMW is the car Factory.";

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String helloString = new String(charArray);

        // 2. String Manipulation
        String message = name + ": " + quote + "\n" + fact;
        int nameLength = name.length();
        char firstChar = quote.charAt(0);

        System.out.println("Message: " + message);
        System.out.println("Name length: " + nameLength);
        System.out.println("First character of quote: " + firstChar);

        // 3. String Comparison
        String nameLower = name.toLowerCase();
        String nameUpper = name.toUpperCase();

        if (name.equals(nameUpper)) {
            System.out.println("Equal (case-sensitive)");
        } else {
            System.out.println("Not equal (case-sensitive)");
        }

        if (nameLower.equals(nameUpper.toLowerCase())) {
            System.out.println("Equal (case-insensitive)");
        } else {
            System.out.println("Not equal (case-insensitive)");
        }

        // 4. String Searching
        String sentence = "Java is a programming language.";
        int index = sentence.indexOf("programming");

        if (index != -1) {
            System.out.println("Word found at index: " + index);
        } else {
            System.out.println("Word not found.");
        }

        // 5. String Formatting
        String formattedString = String.format("My name is %s, I am %d years old, and my favorite color is %s.",
                "Parham", 28, "blue");
        System.out.println(formattedString);
    }
}
