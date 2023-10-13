package Guided1;

public class Bilangan {
    private int a;
    private int b;

    public Bilangan(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void tampil(){
        System.out.println("Nilai bilangan a: "+a);
        System.out.println("Nilai bilangan b: "+b);
    }
    public void operasi_pass_by_value(int x, int y){
        x = x*10;
        y = y*15;
    }
    public void operasi_pass_by_reference(Bilangan bil){
        bil.a = bil.a*10;
        bil.b = bil.b*15;
    }
}