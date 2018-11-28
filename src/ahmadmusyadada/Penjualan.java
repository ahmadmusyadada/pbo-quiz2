package ahmadmusyadada;

import javax.swing.table.DefaultTableModel;

public class Penjualan {
    private String nama;
    private int jumlah;
    private int harga;
    private DefaultTableModel tabel = new DefaultTableModel();

    public Penjualan() {
        getTabel().addColumn("Nama");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Jumlah");
    }
    
    public int countTotal(){
        int total=0;
        for (int i=0;i < tabel.getRowCount();i++){
            int getHarga = Integer.parseInt((String)tabel.getValueAt(i, 2));
            total = total + (getHarga * Integer.parseInt((String)tabel.getValueAt(i, 1)));
        }
        return total;
    }
    
    public String listTransaction(){
        String temp = "";
        for (int i=0;i < tabel.getRowCount();i++){
            temp += tabel.getValueAt(i, 0).toString() + " " + tabel.getValueAt(i, 2).toString() 
                    + " " + (Integer.parseInt(tabel.getValueAt(i, 1).toString()) * Integer.parseInt(tabel.getValueAt(i, 2).toString())) + "\n";
        }
        return temp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public DefaultTableModel getTabel() {
        return tabel;
    }

    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    
}