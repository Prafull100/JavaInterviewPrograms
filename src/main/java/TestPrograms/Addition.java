package TestPrograms;

// Program to extract number from string and print addition of numbers
public class Addition {
        public static void main(String[] args) {

            int sum = 0; // Initialize sum as 0

            String str1 = "India needs 45 runs in 20 balls";

            String[] str2 = str1.split("\\s+");

            for (String word : str2) {
                try {
                    int matchingNumber = Integer.parseInt(word);
                    System.out.println("Number: " + matchingNumber);
                    sum += matchingNumber; // Perform arithmetic addition
                } catch (NumberFormatException e) {
                    // Ignore non-numeric words
                }
            }

            System.out.println("Addition of Numbers: " + sum);
        }
    }

