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
    private String namaBarang;
    private int harga;

    public Item() {
    }

    public Item(String namaBarang, int harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    @Override
    public String toString() {
           return this.namaBarang; //To change body of generated methods, choose Tools | Templates.
    }

    //membuat setter dan getter
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
}