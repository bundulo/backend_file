package hu.nive.ujratervezes.io.phonebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output){
        String eol = System.getProperty("line.separator");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output))) {
        for (Map.Entry<String, String> entry : contacts.entrySet()){
            bufferedWriter.append((entry.getKey())).append(": ").append(entry.getValue()).append(eol);
        }

        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }
}