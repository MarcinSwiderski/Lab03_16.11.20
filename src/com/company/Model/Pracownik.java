package com.company.Model;

public class Pracownik {
    private static int increment = 1;
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
            String nazwaPracownika
    ){
        this.nazwaPracownika = nazwaPracownika;
        this.idPracownika = increment;
        increment ++;
    }

}
