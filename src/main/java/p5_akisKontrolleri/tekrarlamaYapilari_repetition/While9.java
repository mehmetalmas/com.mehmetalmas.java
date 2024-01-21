package p5_akisKontrolleri.tekrarlamaYapilari_repetition;

import java.util.Scanner;

public class While9 {
    public static void main(String[] args) {

        /* kullanicadan asagidaki sartlar dogru oluncaya kadar sifre olusturmasini isteyin
         * sartlari saglamayan durumlar icin hatalari yazdirin ve tekrar sifre olusturmasini isteyin
         * gecerli sifre olusturuldugunda,sifreniz basari ile olusturuldu yazdirin
         *
         * sifrenin ilk karakteri kücük harf olmali
         * sifrenin son karakteri sayi olmali
         *
         */

        Scanner scan = new Scanner(System.in);

        boolean sifreDogrumu = false; // while de döngüye girmek icin ihtiyaci var, cikmak icin while de en son true ata
        String sifre = "";
        char ilkHarf;
        char sonHarf;

        while (!sifreDogrumu) {

            System.out.println("ilk karakteri kücük harf, son karakteri sayi olacak sekilde sifre olusturun");
            sifre = scan.nextLine();  //burada direk sifreyi olusturacak "mhmtAlms01" gibi ilk kücük, son sayi
            ilkHarf = sifre.charAt(0); // ilk karakteri kontol etmek icin buna ihtiyacim
            sonHarf = sifre.charAt(sifre.length() - 1); // son karakteri kontol etmek icin buna ihtiyacim

            if (ilkHarf < 'a' || ilkHarf > 'z') {
                System.out.println("sifrenin ilk harfi kücük olmali");
            } else if (sonHarf < '0' || sonHarf > '9') {
                System.out.println("sifrenin son karakteri rakam olmali");
            } else {
                System.out.println("sifrenizi basari ile olusturdunuz");
                sifreDogrumu = true;
            }

        }












    }
}
