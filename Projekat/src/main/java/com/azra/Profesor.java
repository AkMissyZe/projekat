package com.azra;

    public class Profesor {

        private Integer id_profesor;
        private String ime_p;
        private String prezime_p;
        private Integer kontakt_p;

        public Integer getId_profesor() {
            return id_profesor;
        }

        public void setId_profesor(Integer id_profesor) {
            this.id_profesor = id_profesor;
        }

        public String getIme_p() {
            return ime_p;
        }

        public void setIme_p(String ime_p) {
            this.ime_p = ime_p;
        }

        public String getPrezime_p() {
            return prezime_p;
        }

        public void setPrezime_p(String prezime_p) {
            this.prezime_p = prezime_p;
        }

        public Integer getKontakt_p() {
            return kontakt_p;
        }

        public void setKontakt_p(Integer kontakt_p) {
            this.kontakt_p = kontakt_p;
        }

        @Override
        public String toString() {
            return "Profesor{" +
                    "id_profesor=" + id_profesor +
                    ", ime_p='" + ime_p + '\'' +
                    ", prezime_p='" + prezime_p + '\'' +
                    ", kontakt_p=" + kontakt_p +
                    '}';
        }
    }