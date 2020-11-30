package com.company.Interfaces;

import com.company.DataReader;
import com.company.DataWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerInterface {
    public ManagerInterface() {
        boolean usage = true;
        System.out.println("-------------------------------------");
        System.out.println("--Witaj_w_Interfejsie_Managera!------");
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
                        System.out.println("Redakcja Oferty (TODO)");
                        redakcjaOferty();
                        break;
                    case 2:
                        System.out.println("akceptacja zamowien");
                        break;
                    case 3:
                        System.out.println("tworzenie zlecen dla pracownikow");
                        break;
                    case 4:
                        System.out.println("Wystawienie rachunku klientowi");
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
    public void redakcjaOferty(){
        DataReader dataReader = new DataReader("oferty.txt");
        DataWriter dataWriter = new DataWriter("oferty.txt");
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------");
        System.out.println("Dodawanie Oferty!");
        System.out.println("-----------------");
        System.out.println("id nowej oferty:");
        String scId = sc.next();
        System.out.println("nazwa nowej oferty:");
        String scNazwa = sc.next();
        System.out.println("cena nowej oferty:");
        String scCena = sc.next();

        String nowaOferta = scId + ";" + scNazwa + ";" + scCena ;
        List<String> nowaListaOfert = new ArrayList<>();
        nowaListaOfert.addAll(dataReader.getListOfRows());
        nowaListaOfert.add(nowaOferta);
        dataWriter.rewriteTextFile(nowaListaOfert);
    }
}
