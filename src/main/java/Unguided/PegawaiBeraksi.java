//NIM: 2211103056
//Nama: Tanzil Aziim
//Kelas: SI06B

package Unguided;
import java.io.*;
//Import scanner untuk input nilai
import java.util.Scanner;

public class PegawaiBeraksi {
    //    Main
    public static void main(String[] args) {
//        Pembuatan objek rajin dan malas
        Pegawai rajin, malas;
        rajin = new Pegawai();
        malas = new Pegawai();
//        Deklarasi fungsi scanner untuk input nilai
        Scanner input = new Scanner (System.in);
//        Input nilai dengan setter
        System.out.println();
        System.out.println("\tInput Data Pegawai");
        System.out.print("Nama: ");
        rajin.setNama(input.nextLine());
        System.out.print("NIP: ");
        rajin.setNip(input.nextLine());
        System.out.print("Alamat: ");
        rajin.setAlamat(input.nextLine());
//        Input nilai pada method setTotalGaji 1
        rajin.setTotalGaji(14, 5000000);
//        Pemanggilan method cetak
        rajin.cetak();
//        Input nilai dengan getter
        System.out.println();
        System.out.println("\tInput Data Pegawai ke-2");
        System.out.print("Nama: ");
        malas.setNama(input.nextLine());
        System.out.print("NIP: ");
        malas.setNip(input.nextLine());
        System.out.print("Alamat: ");
        malas.setAlamat(input.nextLine());
//        Input nilai pada method setTotalGaji 1
        malas.setTotalGaji(5000000);
//        Pemanggilan method cetak
        malas.cetak();
    }
}
