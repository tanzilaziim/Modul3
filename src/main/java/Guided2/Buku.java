package Guided2;
import java.io.*;
class Buku {
    private String pengarang;
    private String judul;
    private int jmlhHalaman;
    private float diskon;
    private double harga;

    public Buku() {
        System.out.println("Konstruktor buku dijalankan....");
    }
    //Mutator
    public void setPengarang(String Pengarang) {
        pengarang = Pengarang;
    }

    public void setJudul(String Judul) {
        judul = Judul;
    }

    public void setJmlhHalaman(int JmlhHalaman) {
        jmlhHalaman = JmlhHalaman;
    }
    //Accessor
    public String getPengarang() {
        return pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public int getJmlhHalaman() {
        return jmlhHalaman;
    }
    //Method overloading
    public void setInfo(float dskn, double hargaBuku){
        diskon = dskn;
        harga = hargaBuku-(hargaBuku*diskon);
    }
    public void setInfo(double hargaBuku){
        diskon = 0.1F;
        harga = hargaBuku-(hargaBuku*diskon);
    }
    public void cetak(){
        System.out.println("Judul Buku      : "+getJudul());
        System.out.println("Pengarang       : "+getPengarang());
        System.out.println("Jumlah halaman  : "+getJmlhHalaman()+" halaman");
        System.out.println("Diskon          : "+diskon);
        System.out.println("Harga           : "+harga);
        System.out.println();
    }
}
