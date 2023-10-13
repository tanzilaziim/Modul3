//NIM: 2211103056
//Nama: Tanzil Aziim
//Kelas: SI06B

package Unguided;
public class Pegawai {
    //    Deklarasi atribut nama, nip, alamat, jumlah hari lembur, gaji pokok, dan total gaji
    private String nama;
    private String nip;
    private String alamat;
    private int hariLembur;
    private double gajiPokok;
    private double totalGaji;

    //    Deklrasi konstruktor
    public Pegawai() {
        System.out.println("Konstruktor dijalankan....");
    }
    //    Fungsi-fungsi mutator
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    //    Fungsi-fungsi accessor
    public String getNama() {
        return nama;
    }
    public String getNip() {
        return nip;
    }
    public String getAlamat() {
        return alamat;
    }
    public int getHariLembur() {
        return hariLembur;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    //    Method overloading
    public void setTotalGaji(int HariLembur, double GajiPokok){
        hariLembur = HariLembur;
        gajiPokok = GajiPokok;
        totalGaji = gajiPokok+(gajiPokok * (double) hariLembur * 0.01);
    }
    public void setTotalGaji(double GajiPokok){
        hariLembur = 2;
        gajiPokok = GajiPokok;
        totalGaji = gajiPokok+(gajiPokok * (double) hariLembur * 0.01);
    }
    //    Method cetak dengan penggunaan getter
    public void cetak(){
        System.out.println();
        System.out.println("\tData Pegawai");
        System.out.println("Nama        : "+getNama());
        System.out.println("NIP         : "+getNip());
        System.out.println("Alamat      : "+getAlamat());
        System.out.println("Hari libur  : "+getHariLembur()+" hari");
        System.out.println("Gaji pokok  : "+getGajiPokok());
        System.out.println("Total gaji  : "+totalGaji);
        System.out.println();
    }
}
