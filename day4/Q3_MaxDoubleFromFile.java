package com.training.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q3_MaxDoubleFromFile {
	public static void main(String[] args) {

        List<Double> values = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.trim();   

                if (line.isEmpty()) {
                    continue;         
                }

                try {
                    double num = Double.parseDouble(line);
                    values.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number skipped: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

      
        if (values.isEmpty()) {
            System.out.println("No valid numbers found in file.");
            return;
        }

       
        double max = values.get(0);
        for (double val : values) {
            if (val > max) {
                max = val;
            }
        }

        System.out.println("Largest value: " + max);
    }

}
