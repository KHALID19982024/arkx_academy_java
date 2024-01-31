package day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResources {
    public static void main(String[] args) {
        String filePath = "src\\day8\\example.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
        }
    }

