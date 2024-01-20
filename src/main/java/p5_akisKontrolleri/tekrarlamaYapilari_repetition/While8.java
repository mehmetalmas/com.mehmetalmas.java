package p5_akisKontrolleri.tekrarlamaYapilari_repetition;

import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {

        System.out.println("------------------------1-------------------------------");

        //Bir kullanıcıdan alınan sayının faktöriyelini hesaplayan bir program yazın.
        // iki degisken var bir girilen sayi iki faktöriyel

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayi giriniz");

        int girilenSayi = scan.nextInt();
        int faktoriyel = 1; // while da her zaman bir baslangic degeri tanimlaman gerekir

        while(girilenSayi > 0){
            faktoriyel *= girilenSayi;
            girilenSayi--;
        }

        System.out.println("girilen sayinin faktöriyeli = " + faktoriyel); // while icinde olsa idi ulasamazdi


        System.out.println("------------------------2-------------------------------");



        // kullanicidan istenilen sayidan 300 kadar olan sayilarin toplamini veren bir program yazin
        // iki degisken var bir girilen sayi iki toplam

        System.out.println("Lütfen bir sayi giriniz");
        int kullaniciSayisi = scan.nextInt();
        int toplam = 0;

        while (kullaniciSayisi<=300){
            toplam += kullaniciSayisi;
            kullaniciSayisi++;  // bu fordaki degeri arttirma gibi bir sart kosma yoksa nereye kadar gidecegini bilmez
        }
        System.out.println("toplam = " + toplam);


        System.out.println("------------------------3-------------------------------");

        // kullanicidan toplamak icin sayilar isteyin, istenilen sayilarin toplami 500 u gecerse sonucu yazdirin
        // iki degisken var bir girilen sayi iki sonuc

        int sayi = 0;
        int sonuc = 0;

        while (sonuc <= 500){
            System.out.println("Lütfen toplamak icin sayi ekleyin");
            sayi = scan.nextInt();
            sonuc += sayi; // bu fordaki degeri arttirma gibi bir sart kosma yoksa nereye kadar gidecegini bilmez
        }
        System.out.println("girilen sayilarin toplami = " + sonuc);


        System.out.println("------------------------3-------------------------------");

        // Kullanicidan bir sayi alin ve
        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin

        int input = 0;
        int bolen = 0;

        while (input%bolen==0){
            System.out.println("Lütfen bir sayi giriniz");
            input = scan.nextInt();
            input++;
            bolen++;

        }











    }
}
