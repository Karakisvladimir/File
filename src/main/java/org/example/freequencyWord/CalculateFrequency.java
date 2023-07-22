package org.example.freequencyWord;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CalculateFrequency {

    public static void calculateFrequency(String fileName) {
        try {
            FileInputStream fin = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fin));
            Map<String, Integer> frequencyMap = new HashMap<>();

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    Integer count = frequencyMap.get(word);
                    if (count == null) {
                        count = 0;
                    }
                    frequencyMap.put(word, count + 1);
                }
            }

            br.close();
            fin.close();

            // Сортування в порядку спадання частоти
            frequencyMap.entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .forEachOrdered(e -> System.out.println(e.getKey() + " " + e.getValue()));
        } catch (IOException exception) {
            System.out.println("Error occurred when trying to read " + fileName);
        }
    }
}
