/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahmadmusyadada;

/**
 *
 * @author Ahmad Musyadad A
 */
// Deklarasi class Item untuk merepresentasikan barang
// yang akan dimasukkan dalam daftar belanja.
public class Item {
    // atribut yang digunakan untuk menyimpan nama barang
    private String namaBarang;
    private int harga;
//    private int satuan;

    public Item() {
    }

//    public Item(String namaBarang, int harga, int satuan) {
//        this.namaBarang = namaBarang;
//        this.harga = harga;
//        this.satuan = satuan;
//    }

    public Item(String namaBarang, int harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    @Override
    public String toString() {
           return this.namaBarang; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

//    public int getSatuan() {
//        return satuan;
//    }
//
//    public void setSatuan(int satuan) {
//        this.satuan = satuan;
//    }
}