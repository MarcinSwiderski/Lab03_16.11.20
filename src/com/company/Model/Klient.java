package com.company.Model;

public class Klient {
    private static int increment = 1;
    private int idKlienta;

    public int getIdKlienta() {
        return idKlienta;
    }

    public String getNazwaKlienta() {
        return nazwaKlienta;
    }

    private String nazwaKlienta;

    public Klient(
            String nazwaKlienta
    ){
        this.nazwaKlienta = nazwaKlienta;
        this.idKlienta = increment;
        increment++;
    }
}
