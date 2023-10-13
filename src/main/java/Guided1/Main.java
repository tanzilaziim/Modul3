package Guided1;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Bilangan bil = new Bilangan(10, 20);
        x = 15;
        y = 30;

        System.out.println("\tNilai x dan y sebelum passed by value");
        System.out.println("Nilai x: "+x);
        System.out.println("Nilai y: "+y);
        bil.operasi_pass_by_value(x,y);
        System.out.println("\tNilai x dan y setelah passed by value");
        System.out.println("Nilai x: "+x);
        System.out.println("Nilai y: "+y);
        System.out.println();
        System.out.println("\tNilai x dan y sebelum passed by reference");
        bil.tampil();
        bil.operasi_pass_by_reference(bil);
        System.out.println("\tNilai x dan y setelah passed by reference");
        bil.tampil();
    }
}