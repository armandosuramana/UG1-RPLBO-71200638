package org.example;

public class makanan {
    private String nama;
    private String TanggalKadaluarsa;
    private int berat;
    private int kuantity;

    public int getBerat() {
        return berat;

    }

    public String getNama() {
        return nama;
    }

    public int getKuantity() {
        return kuantity;
    }

    public String getTanggalKadaluarsa() {
        return TanggalKadaluarsa;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public void setKuantity(int kuantity) {
        this.kuantity = kuantity;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        TanggalKadaluarsa = tanggalKadaluarsa;
    }
}


