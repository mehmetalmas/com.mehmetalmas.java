package p5_akisKontrolleri.tekrarlamaYapilari_repetition;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        /*
            Kullanicidan toplamak uzere pozitif sayilar isteyin, (döngüyü düsün hemen=sayilar isteyin diyor)
            islemi bitirmek icin 0’a basmasini soyleyin.
            Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
            ve “Negatif sayi giremezsiniz” yazdirip basa donun
            Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
            yanlislikla kac negative sayi girdigini
            ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        */

        System.out.println("");


        Scanner scanner = new Scanner(System.in);

        int sayi;
        int negatifSayiSayaci = 0;
        int poyitifSayiSayaci = 0;
        int toplam = 0;


        do {
            System.out.println("Lütfen toplamak icin pozitif bir sayi girin. \nIslemi bitirmek istiyorsaniz 0 a basin");
            sayi = scanner.nextInt();
            if (sayi<0) {
                System.out.println("Negatif bir sayi giremezsiniz");
                negatifSayiSayaci++;
            }else if(sayi>0) {
                toplam += sayi;
                poyitifSayiSayaci++;
            }
        }while (sayi != 0);

        System.out.println("Giridiginiz sayilarin toplami = " + toplam);
        System.out.println("Giridiginiz negatif sayilarin adeti = " + negatifSayiSayaci);
        System.out.println("Giridiginiz pozitif sayilarin adeti = " + poyitifSayiSayaci);












    }
}
