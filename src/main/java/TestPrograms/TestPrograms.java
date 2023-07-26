package TestPrograms;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Program to add age and name using collection key value pair
public class TestPrograms {

    public static void main(String args[]) {

                Map<String, Integer> personMap = new HashMap<>();
                Scanner scanner = new Scanner(System.in);

                // Collect names and ages until "exit" is entered
                while (true) {
                    System.out.print("Enter name (or 'exit' to quit): ");
                    String name = scanner.nextLine();
                    if (name.equalsIgnoreCase("exit")) {
                        break;
                    }

                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    personMap.put(name, age);
                }

                // Print the collected names and ages
                System.out.println("\nCollected Names and Ages:");
                for (Map.Entry<String, Integer> entry : personMap.entrySet()) {
                    String name = entry.getKey();
                    int age = entry.getValue();
                    System.out.println("Name: " + name + ", Age: " + age);
                }



    }


}
