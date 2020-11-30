package com.company.Interfaces;

import com.company.DataReader;

import java.util.Scanner;

public class EmployeeInterface {
    public EmployeeInterface() {
        boolean usage = true;
        System.out.println("-------------------------------------");
        System.out.println("--Witaj_w_Interfejsie_Pracownika!------");
        System.out.println("--------");
        System.out.println("--------");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);
        while (usage)
            try {
                System.out.println("Wybierz Tryb: ");
                int mod = Integer.parseInt(sc.next());
                switch (mod) {
                    case 1:
                        System.out.println("Przegladanie zlecen(TODO)");
                        gettingDataFromTestText();
                        break;
                    case 2:
                        System.out.println("Zmiana statusu zlecenie (TODO)");
                        break;
                    case 10:
                        System.out.println("wyjsice z tego interfejsu");
                        usage = false;
                        break;
                    default:
                        System.out.println("Bad variable read! Repeat your action!");
                }

            } catch (Exception e) {
                System.out.println("Bad variable read!");
            }
    }
    public void gettingDataFromTestText(){
        DataReader x = new DataReader("/home/marcin/IdeaProjects/Lab03_16.11.20/src/testTextFile.txt");
        for (int i = 0; i < x.getListOfRows().size() ; i++) {
            System.out.println(x.getListOfRows().get(i));
        }
    }


}
