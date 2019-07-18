package com.azra;


import java.util.Date;

public class Izostanci {

    private Integer id_izostanci;
    private Date datum;
    private Integer cas;
    private String vrsta_izostanka;

    public Integer getId_izostanci() {
        return id_izostanci;
    }

    public void setId_izostanci(Integer id_izostanci) {
        this.id_izostanci = id_izostanci;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Integer getCas() {
        return cas;
    }

    public void setCas(Integer cas) {
        this.cas = cas;
    }

    public String getVrsta_izostanka() {
        return vrsta_izostanka;
    }

    public void setVrsta_izostanka(String vrsta_izostanka) {
        this.vrsta_izostanka = vrsta_izostanka;
    }

    @Override
    public String toString() {
        return "Izostanci{" +
                "id_izostanci=" + id_izostanci +
                ", datum=" + datum +
                ", cas=" + cas +
                ", vrsta_izostanka='" + vrsta_izostanka + '\'' +
                '}';
    }
}

