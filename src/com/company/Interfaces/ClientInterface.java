package com.company.Interfaces;

import com.company.DataReader;
import com.company.DataWriter;
import com.company.Model.Klient;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class ClientInterface {
    public ClientInterface(Klient klient) {
        boolean usage = true;
        System.out.println("-------------------------------------------");
        System.out.println("--Witaj " + klient.getNazwaKlienta() + "!-------------");
        System.out.println("--1.Przeglądanie Ofert!--------------------");
        System.out.println("--2.Tworzenie Zamowienia (TODO)------------");
        System.out.println("--3.Składanie Zamowienia (TODO)------------");
        System.out.println("--4.Przegladanie Stanu Zamowienia (TODO)---");
        System.out.println("--5.Rozliczanie Zamowienia (TODO)----------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("--10.wyjsice z tego interfejsu-------------");

        Scanner sc = new Scanner(System.in);
        while (usage)
            try {
                System.out.println("Wybierz Tryb: ");
                int mod = Integer.parseInt(sc.next());
                switch (mod) {
                    case 1:
                        System.out.println("Przeglądanie Ofert!");
                        przegladanieOfert();
                        break;
                    case 2:
                        System.out.println("Tworzenie Zamowienia (TODO)");
                        break;
                    case 3:
                        System.out.println("Składanie Zamowienia (TODO)");
                        break;
                    case 4:
                        System.out.println("Przegladanie Stanu Zamowienia (TODO)");
                        break;
                    case 5:
                        System.out.println("Rozliczanie Zamowienia (TODO)");
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
    public void przegladanieOfert(){
        try{
            DataReader dataReader = new DataReader("oferty.txt");
            dataReader.getListOfRowsPrinted();
        } catch (Exception e){
            System.out.println("Interfejs " + getClass() + " nie znaleziono ofert" );
        }
    }
    public void tworzenieZamowienia(){
        try{
            DataWriter dataWriter = new DataWriter( "zamowienia.txt");

        }catch (Exception e){

        }
    }
}
