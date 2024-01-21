package p5_akisKontrolleri.tekrarlamaYapilari_repetition;

public class DoWhile1 {
    public static void main(String[] args) {

        /*
        * while in kardesidir
        * do dan sonra gelen cümle(ler) while mantiksal ifadesi dogru oldukca calisir
        * cümle(ler) en az bir kere calisir, cünkü sart kontrolü sonda yapiliyor
        * while satirindan sonra noktali virgül koyulur, { } önce oldugundan

        do
            cümle(ler)
        while(mantiksal ifadeler);

        veya

         do{
            cümle(ler)
         }
        while(mantiksal ifadeler);


        */


        double r;  // while de burada tanimlamaliydik, kontrol önce yapildigi icin double / r = Math.random(); seklinde

        do {
            r = Math.random();
            System.out.println(" do-while in icindeyiz ve r degeri = " + r );
        }while (r < 0.5d);

        // bir kere r yi üretir sonra while daki sarta bakar sart saglaniyorsa tekrar calisire ve döngü böyle calisir







    }
}
