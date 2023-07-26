package TestPrograms;

public class StringConcatenationCount {


        public static int getConcatenationCount(String string1, String expectedString) {
            int count = 0;
            StringBuilder builder = new StringBuilder();

            while (builder.length() < expectedString.length()) {
                builder.append(string1);
                count++;
            }

            if (builder.toString().contains(expectedString)) {
                return count;
            } else {
                return -1; // Indicates that the expectedString cannot be obtained by concatenating string1.
            }
        }

        public static void main(String[] args) {
            String string1 = "abcd";
            String expectedString = "abcdabcdabcdabcd";

            int result = getConcatenationCount(string1, expectedString);

            if (result != -1) {
                System.out.println("To get the expectedString, string1 needs to be concatenated " + result + " times.");
            } else {
                System.out.println("The expectedString cannot be obtained by concatenating string1.");
            }
        }
    }


