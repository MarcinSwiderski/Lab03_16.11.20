package com.company.Model;

public class Pracownik {

    int idPracownika;
    String nazwaPracownika;

    public int getIdPracownika() {
        return idPracownika;
    }

    public void setIdPracownika(int idPracownika) {
        this.idPracownika = idPracownika;
    }

    public String getNazwaPracownika() {
        return nazwaPracownika;
    }

    public void setNazwaPracownika(String nazwaPracownika) {
        this.nazwaPracownika = nazwaPracownika;
    }

    public Pracownik(
            int idPracownika,
            String nazwaPracownika
    ){
        this.idPracownika = idPracownika;
        this.nazwaPracownika = nazwaPracownika;
    }

}
