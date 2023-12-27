package p5_akisKontrolleri.tekrarlamaYapilari_repetition;

public class While3 {
    public static void main(String[] args) {


        double r = Math.random();
        System.out.println("üretilen r  = " + r);


        while ( r < 0.8){ // r 0.8 den kücük ise while i calistir ve r yi yazdir
            r = Math.random(); // bu fordaki degeri arttirma gibi bir sart kosma yoksa nereye kadar gidecegini bilmez
            System.out.println("while girdi ve yeni r =" + r);
        }

        System.out.println("while girmedi");










    }
}
