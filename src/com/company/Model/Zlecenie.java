package com.company.Model;

public class Zlecenie {
    int idZlecenia;
    int idZamowienia;
    int idPracownika;
    public Zlecenie(
            int idZlecenia,
            Zamowienie odpowiadajaceZamowienie,
            Pracownik odpowiadajacyPracownik
    ){
        this.idZlecenia = idZlecenia;
        this.idZamowienia = odpowiadajaceZamowienie.getIdZamowienia();
        this.idPracownika = odpowiadajacyPracownik.getIdPracownika();
    }
}
