package com.company.Model;

public class Oferta {
    private int idUslugi;
    private String nazwaUslugi;
    private String jednostkaUslugi;
    private int cenaUslugi;

    public Oferta(
            int idUslugi,
            String nazwaUslugi,
            String jednostkaUslugi,
            int cenaUslugi
    ) {
        this.idUslugi = idUslugi;
        this.nazwaUslugi = nazwaUslugi;
        this.jednostkaUslugi = jednostkaUslugi;
        this.cenaUslugi = cenaUslugi;
    }
}
