package p5_akisKontrolleri.tekrarlamaYapilari_repetition;

import java.util.Scanner;

public class While7 {
    public static void main(String[] args) {
        //  Bir kullanıcıdan alınan sayıya kadar olan tüm sayıları ekrana yazdıran bir Java programı yazın.
        // (Örneğin, kullanıcı 5 girdiğinde, program 1, 2, 3, 4, 5'i ekrana yazdırmalıdır.)

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir pozitif sayi giriniz");
        int girilenSayi = scan.nextInt();

        int i = 0;  // while da her zaman bir baslangic degeri tanimlaman gerekir

        while (i <= girilenSayi) {
            System.out.println("kullanıcıdan alınan sayıya kadar olan sayi = " + i);
            i++;  // bu fordaki degeri arttirma gibi bir sart kosma yoksa nereye kadar gidecegini bilmez
        }

















    }
}
