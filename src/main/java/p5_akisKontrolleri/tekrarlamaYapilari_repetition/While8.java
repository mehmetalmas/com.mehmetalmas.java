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


        System.out.println("------------------------4-------------------------------");

        // Kullanicidan bir sayi alin ve
        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
        // üc degiskenin var kullanicidan alinan sayi, bölen ve sayac(kactane)

        System.out.println("Lütfen bir sayi giriniz");
        int grlnSayi = scan.nextInt();
        int bolen = 1;
        int sayac = 0;

        while (bolen <= grlnSayi){
            if (grlnSayi % bolen == 0) {
                System.out.println("tam bölen = " + bolen);
                // bolen++;  buraya yazarsan if icinde ilk 1 e bakar sonra 1 arttirir 2 ye bakar sonra 3 e, 4 de tam
                // bölünen olmadigindan iften cikar bölen de while cümlesinde olmadigindan buradan sonra while
                // bölen e ulasamaz islem burada kesilir sayac ve sonrasina islem gitmez
            }
            bolen++;  // ilk while ile cek edildiginden while cümesinde olmali
            sayac++;

        }
        System.out.println("tam bölenlerin sayisi = " + sayac);

        System.out.println("------------------------5-------------------------------");

        // kullanicidan iki tamsayi alip
        // bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturun

        System.out.println("Lütfen birinci sayiyi girin");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi girin");
        int sayi2 = scan.nextInt();

        while(sayi1 >= sayi2){
            System.out.println("Aradaki sayilar = " + sayi1);
            sayi2++;
        }

        while(sayi2 >= sayi1){
            System.out.println("Aradaki sayilar = " + sayi2);
            sayi1++;
        }









    }
}
