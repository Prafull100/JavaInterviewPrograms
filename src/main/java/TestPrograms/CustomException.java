package TestPrograms;

public class CustomException {

      public static void main(String[] args) {
        try {
            validateAge(19);
        } catch (CustomExceptionExample e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws CustomExceptionExample {
        if (age < 18) {
            throw new CustomExceptionExample("Invalid age. Must be at least 18 years old.");
        } else {
            System.out.println("Age is valid.");
        }
    }
    }
