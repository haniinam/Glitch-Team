package com.example.example_navbar;

public class Hewan {
    private int id;
    private String nama;
    private String jenis;
    private String jenisKelamin;
    private String usia;

    // Constructor
    public Hewan(int id, String nama, String jenis, String jenisKelamin, String usia) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaHewan() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisHewan() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    @Override
    public String toString() {
        return "Hewan{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", jenis='" + jenis + '\'' +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                ", usia='" + usia + '\'' +
                '}';
    }
}

