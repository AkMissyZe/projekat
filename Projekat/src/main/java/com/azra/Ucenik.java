package com.azra;

import java.util.Date;

public class Ucenik {

    private Integer id_ucenik;
    private String ime_u;
    private String prezime_u;
    private Date datum_rodjenja;
    private String mjesto_rodjenja;

    public Integer getId_ucenik() {
        return id_ucenik;
    }

    public void setId_ucenik(Integer id_ucenik) {
        this.id_ucenik = id_ucenik;
    }

    public String getIme_u() {
        return ime_u;
    }

    public void setIme_u(String ime_u) {
        this.ime_u = ime_u;
    }

    public String getPrezime_u() {
        return prezime_u;
    }

    public void setPrezime_u(String prezime_u) {
        this.prezime_u = prezime_u;
    }

    public Date getDatum_rodjenja() {
        return datum_rodjenja;
    }

    public void setDatum_rodjenja(Date datum_rodjenja) {
        this.datum_rodjenja = datum_rodjenja;
    }

    public String getMjesto_rodjenja() {
        return mjesto_rodjenja;
    }

    public void setMjesto_rodjenja(String mjesto_rodjenja) {
        this.mjesto_rodjenja = mjesto_rodjenja;
    }

    @Override
    public String toString() {
        return "Ucenik{" +
                "id_ucenik=" + id_ucenik +
                ", ime_u='" + ime_u + '\'' +
                ", prezime_u='" + prezime_u + '\'' +
                ", datum_rodjenja=" + datum_rodjenja +
                ", mjesto_rodjenja='" + mjesto_rodjenja + '\'' +
                '}';
    }
}
