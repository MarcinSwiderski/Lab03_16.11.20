package com.company.Model;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    int idZamowienia;
    String dataZamowienia;
    Klient klientZamowienia;
    List<Oferta> listaWybranychOfert;

    public Zamowienie(
            int idZamowienia,
            String dataZamowienia,
            Klient klientZamowienia,
            List<Oferta> listaWybranychOfert
    ){
        this.idZamowienia = idZamowienia;
        this.dataZamowienia = dataZamowienia;
        this.klientZamowienia = klientZamowienia;
        this.listaWybranychOfert = listaWybranychOfert;
    }
}
