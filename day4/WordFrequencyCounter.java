package com.training.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
	public static void main(String[] args) throws IOException {
		 Map<String, Integer> wordCount = new HashMap<>();

		 try {
			BufferedReader br;
			br = new BufferedReader(new FileReader("story.txt"));
		
	       
	        String line;

	       
	        while ((line = br.readLine()) != null) {

	            
	            line = line.trim();
	            if (line.isEmpty()) {
	                continue;
	            }

	           
	            line = line.toLowerCase();

	          
	            line = line.replaceAll("[^a-z ]", "");

	            // Split into words
	            String[] words = line.split("\\s+");

	            // Count words
	            for (String word : words) {
	                if (wordCount.containsKey(word)) {
	                    wordCount.put(word, wordCount.get(word) + 1);
	                } else {
	                    wordCount.put(word, 1);
	                }
	            }
	        }

	        br.close();
		 } catch (FileNotFoundException e) {
				
				e.printStackTrace();
			 }

	    
	        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
	        }
		
	}

}
