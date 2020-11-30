package com.company;

import com.company.Interfaces.ClientInterface;
import com.company.Interfaces.EmployeeInterface;
import com.company.Interfaces.ManagerInterface;
import com.company.Model.Klient;
import com.company.Model.Pracownik;

import javax.sound.midi.Soundbank;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean usage = true;
        List<Klient> klienci = new ArrayList<>();
        List<Pracownik> pracownicy = new ArrayList<>();
        ClearScreen clearScreen = new ClearScreen();
        Scanner sc = new Scanner(System.in);
        while (usage)
            try {
                System.out.println("---------------------------------");
                System.out.println("--Witaj_w_Naszej_Aplikacji!------");
                System.out.println("---------------------------------");
                System.out.println("---Kim_Jesteś?:------------------");
                System.out.println("---1.Klientem--------------------");
                System.out.println("---2.Pracownikiem----------------");
                System.out.println("---3.Menagerem-------------------");
                System.out.println("---------------------------------");
                System.out.println("---4.Exit------------------------");
                int mod = Integer.parseInt(sc.next());
                switch (mod) {
                    case 1:
                        System.out.println("Drogi kliencie, jak masz na imię?");
                        String imieKlienta = sc.next();

                        Klient klient = new Klient(imieKlienta);
                        ClientInterface clientInterface = new ClientInterface(klient);

                        break;
                    case 2:
                        System.out.println("Pracowniku, jak masz na imię?");
                        String imiePracownika = sc.next();
                        Pracownik pracownik = new Pracownik(imiePracownika);
                        EmployeeInterface employeeInterface = new EmployeeInterface();
                        break;
                    case 3:
                        ManagerInterface managerInterface = new ManagerInterface();
                        break;
                    case 4:
                        usage = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Fatal error of Main class");
            }
    }
}
