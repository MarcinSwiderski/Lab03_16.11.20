package com.company;

import com.company.Model.Zamowienie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    List<String> buforFromTextList = new ArrayList<>();
    public DataReader(String fileName) {
        try (Scanner s = new Scanner(new File(fileName))) {
            System.out.println("--------------------------------------");
            System.out.println("Poprawnie polaczono sie z baza danych!");
            System.out.println("--------------------------------------");
            while (s.hasNextLine()) {
                buforFromTextList.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        }
    }
    public  <String> List<String> getListOfRows() {
        return (List<String>) buforFromTextList;
    }
    public void getListOfRowsPrinted(){
        for (int i = 0; i <getListOfRows().size() ; i++) {
            System.out.println(getListOfRows().get(i));
        }
    }
    public String getDataById(int id){
        List<Integer> idList = new ArrayList<>();
        for (String line:buforFromTextList) {
            String[] splited = line.split(";");
            idList.add(Integer.parseInt(splited[0]));
        }
        try{
        for (int i = 0; i < idList.size(); i++) {
            if(idList.get(i) == id){
                return buforFromTextList.get(i);
            }
        }}catch (Exception e){
            System.out.println("No id like that!");
        }
        return "-----";
    }}


