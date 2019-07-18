package com.azra;

public class Predmet {

    private Integer id_predmet;
    private String naziv;
    private Integer br_sati;

    public Integer getId_predmet() {
        return id_predmet;
    }

    public void setId_predmet(Integer id_predmet) {
        this.id_predmet = id_predmet;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getBr_sati() {
        return br_sati;
    }

    public void setBr_sati(Integer br_sati) {
        this.br_sati = br_sati;
    }

    @Override
    public String toString() {
        return "Predmet{" +
                "id_predmet=" + id_predmet +
                ", naziv='" + naziv + '\'' +
                ", br_sati=" + br_sati +
                '}';
    }
}

