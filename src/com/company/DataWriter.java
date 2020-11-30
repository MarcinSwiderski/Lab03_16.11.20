package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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

}
