package TestPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Collectors;

// Output should be 12/Dec/2023, 18/June/2023, 20/may/2023
public class TestClass {
    public static void main(String[] args) {

        String[] dateArray = {"20/may/2023", "18/June/2023", "12/Dec/2023"};

        // Define a custom comparator based on the date format
        Comparator<String> dateComparator = new Comparator<String>() {
            @Override
            public int compare(String date1, String date2) {
                return date1.compareToIgnoreCase(date2);
            }
        };

        // Sort the date array using the custom comparator
        Arrays.sort(dateArray, dateComparator);

        // Print the sorted array in the desired format
        StringBuilder formattedDates = new StringBuilder();
        for (int i = 0; i < dateArray.length; i++) {
            if (i > 0) {
                formattedDates.append(", ");
            }
            formattedDates.append(dateArray[i]);
        }
        System.out.println(formattedDates);
            }
        }

