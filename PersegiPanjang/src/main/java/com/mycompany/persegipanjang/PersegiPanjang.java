/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persegipanjang;

/**
 *
 * @author Acer
 */
public class PersegiPanjang {
    private int panjang;
    private int lebar;

    // Default constructor
    public PersegiPanjang() {
        this.panjang = 1;
        this.lebar = 1;
    }

    // Parameter constructor
    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }

    // Mengembalikan nilai luas persegi panjang
    public int getLuas() {
        return panjang * lebar;
    }

    // Mengembalikan nilai keliling persegi panjang
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    // Metode untuk memodifikasi panjang
    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    // Metode untuk memodifikasi lebar
    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        // Menciptakan objek kelas PersegiPanjang
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);

        // Menampilkan informasi tentang setiap objek
        System.out.println("Persegi Panjang 1:");
        System.out.println("Luas: " + persegiPanjang1.getLuas());
        System.out.println("Keliling: " + persegiPanjang1.getKeliling());

        System.out.println("\nPersegi Panjang 2:");
        System.out.println("Luas: " + persegiPanjang2.getLuas());
        System.out.println("Keliling: " + persegiPanjang2.getKeliling());

        System.out.println("\nPersegi Panjang 3:");
        System.out.println("Luas: " + persegiPanjang3.getLuas());
        System.out.println("Keliling: " + persegiPanjang3.getKeliling());
    }
}
