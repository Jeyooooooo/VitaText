package com.mycompany.nlp_finalproj;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVDataLoader {

    public static List<ReviewRecord> loadWellnessReviews(String resourcePath, int limit) {
        List<ReviewRecord> records = new ArrayList<>();
        
        try (InputStream is = CSVDataLoader.class.getResourceAsStream(resourcePath)) {
            if (is == null) {
                System.err.println("CRITICAL: CSV target resource asset file not found at: " + resourcePath);
                return records;
            }
            
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"))) {
                String line;
                boolean isHeader = true;
                int count = 0;

                while ((line = reader.readLine()) != null && count < limit) {
                    if (isHeader) {
                        isHeader = false; 
                        continue;
                    }

                    String cleanReview = line.replace("\"", "").trim();

                    if (!cleanReview.isEmpty()) {
                        records.add(new ReviewRecord(cleanReview, 3));
                        count++;
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error reading your CSV file stream block.");
            e.printStackTrace();
        }
        return records;
    }
}