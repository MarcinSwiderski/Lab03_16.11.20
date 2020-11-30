package com.company.Model;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {

    int idZamowienia;
    String dataZamowienia;
    Klient klientZamowienia;
    List<Oferta> listaWybranychOfert;

    public int getIdZamowienia() {
        return idZamowienia;
    }

    public void setIdZamowienia(int idZamowienia) {
        this.idZamowienia = idZamowienia;
    }

    public String getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public Klient getKlientZamowienia() {
        return klientZamowienia;
    }

    public void setKlientZamowienia(Klient klientZamowienia) {
        this.klientZamowienia = klientZamowienia;
    }

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
