package com.school;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileStorageService {
    public void saveData(List<? extends Storable> items, String fileName){
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Storable item : items) {
                writer.println(item.toDataString());
            }
            System.out.println("Data successfully added to: "+fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public void save(Storable entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}
