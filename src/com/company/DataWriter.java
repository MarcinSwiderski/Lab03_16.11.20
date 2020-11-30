package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

public class DataWriter {
    String fileName;
    public DataWriter(String fileName) {
        this.fileName = fileName;
        try {
            File textFile = new File(fileName);
            if (textFile.createNewFile()) {
                System.out.println("File Created" + textFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Fatal " + getClass() + " error has occured");
        }

    }

    public void writeRowTextfile(String dataNeededToBeWritten) {
        try {
            FileWriter fstream = new FileWriter(fileName, true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(dataNeededToBeWritten + "\n");
            out.close();
        } catch (Exception e) {
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }
    }

    public void rewriteTextFile(List<String> dataToRewrite){
        try {
            FileWriter fileWriter = new FileWriter(fileName, false);
            for (int i = 0; i <dataToRewrite.size() ; i++) {
                System.out.println(dataToRewrite.get(i));
                fileWriter.write(dataToRewrite.get(i) + "\n");
            }
            fileWriter.close();


        } catch (IOException e) {
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }

    }

}
