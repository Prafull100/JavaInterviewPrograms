package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateWordsFromTextFile {

    public static void main(String args[]){


               String filePath = "D:\\Projects\\Test\\File\\word.txt"; // Replace with your file path

                HashSet<String> uniqueWords = new HashSet<>();
                ArrayList<String> duplicateWords = new ArrayList<>();

                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] words = line.split("\\s+");
                        for (String word : words) {
                            if (!uniqueWords.add(word)) {
                                duplicateWords.add(word);
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("Duplicate words in the file:");
                for (String word : duplicateWords) {
                    System.out.println(word);
                }
            }
        }
