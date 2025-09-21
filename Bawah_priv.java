package Modul_7;

public class Bawah_priv extends Atas_priv {
    public void cetak2() {
        System.out.println("Ada di class BAWAH ..");
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Bawah_priv bwh = new Bawah_priv();
        bwh.cetak1();
        bwh.cetak2();
    }
}