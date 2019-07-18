package com.azra;

import java.util.Date;

public class Ocjena {


    private Integer id_ocjena;
    private Date datum;
    private Integer ocjena;

    public Integer getId_ocjena() {
        return id_ocjena;
    }

    public void setId_ocjena(Integer id_ocjena) {
        this.id_ocjena = id_ocjena;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Integer getOcjena() {
        return ocjena;
    }

    public void setOcjena(Integer ocjena) {
        this.ocjena = ocjena;
    }

    @Override
    public String toString() {
        return "Ocjena{" +
                "id_ocjena=" + id_ocjena +
                ", datum=" + datum +
                ", ocjena=" + ocjena +
                '}';
    }
}
