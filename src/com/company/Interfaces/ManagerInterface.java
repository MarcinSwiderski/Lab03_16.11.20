package com.company.Interfaces;

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

    private void exitManagerInterface() {
        System.out.println("exit");
    }

}
