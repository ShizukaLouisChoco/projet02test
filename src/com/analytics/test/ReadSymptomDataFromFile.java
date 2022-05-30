package com.analytics.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 * @author Alex
 * @version 1.0.0
 */
public class ReadSymptomDataFromFile implements IReadSymptomDataFromFile {
    private final String filepath;

    /**
     * ReadSymptomDataFromFile Constructor
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile (String filepath) {
        this.filepath = filepath;
    }

    /**
     * GetSymptoms method
     * @return String data in List type from the .txt format
     */
    @Override
    public List<String> GetSymptoms(){
        ArrayList<String> result = new ArrayList<>();

        if (filepath != null) {
            try {
                BufferedReader reader = new BufferedReader (new FileReader(filepath));
                String line = reader.readLine();

                while (line != null) {
                    result.add(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}