package com.azra;

public class Razred {

    private Integer id_razred;
    private Integer razred;
    private Integer odjeljenje;

    public Integer getId_razred() {
        return id_razred;
    }

    public void setId_razred(Integer id_razred) {
        this.id_razred = id_razred;
    }

    public Integer getRazred() {
        return razred;
    }

    public void setRazred(Integer razred) {
        this.razred = razred;
    }

    public Integer getOdjeljenje() {
        return odjeljenje;
    }

    public void setOdjeljenje(Integer odjeljenje) {
        this.odjeljenje = odjeljenje;
    }

    @Override
    public String toString() {
        return "Razred{" +
                "id_razred=" + id_razred +
                ", razred=" + razred +
                ", odjeljenje=" + odjeljenje +
                '}';
    }
}

