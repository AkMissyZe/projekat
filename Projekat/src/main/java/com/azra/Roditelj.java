package com.azra;

public class Roditelj {

        private Integer id_roditelj;
        private String ime_r;
        private String prezime_r;
        private Integer kontakt_r;

    public Integer getId_roditelj() {
        return id_roditelj;
    }

    public void setId_roditelj(Integer id_roditelj) {
        this.id_roditelj = id_roditelj;
    }

    public String getIme_r() {
        return ime_r;
    }

    public void setIme_r(String ime_r) {
        this.ime_r = ime_r;
    }

    public String getPrezime_r() {
        return prezime_r;
    }

    public void setPrezime_r(String prezime_r) {
        this.prezime_r = prezime_r;
    }

    public Integer getKontakt_r() {
        return kontakt_r;
    }

    public void setKontakt_r(Integer kontakt_r) {
        this.kontakt_r = kontakt_r;
    }

    @Override
    public String toString() {
        return "Roditelj{" +
                "id_roditelj=" + id_roditelj +
                ", ime_r='" + ime_r + '\'' +
                ", prezime_r='" + prezime_r + '\'' +
                ", kontakt_r=" + kontakt_r +
                '}';
    }
}

