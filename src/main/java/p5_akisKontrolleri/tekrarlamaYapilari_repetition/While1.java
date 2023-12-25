package p5_akisKontrolleri.tekrarlamaYapilari_repetition;

public class While1 {
    public static void main(String[] args) {

        /*

        while(mantiksal ifade)
        cümle

        veya

        while(mantiksal ifade){
        cümle(ler)
        }



        * ( ) parantez kullanmak zorunludur
        * kod blogunun kac kere calisacagi bilinmiyorsa veya bir sarta bagli ise kullanilir
          (kac kere calisacagi belli ise for loop)
        * mantiksal ifade true oldugu müddettece cümleleri calistirir,
        * false oldugunda while biter, akis sonraki satirdan devam eder
        * mantiksal ifade birlesik ifadeden olusabilir, önemli olan ifadenin true veya false vermesidir
          while(b = i>j ? true : false) gibi



         */


        // iki basamakli sayilardan 7 ile bölünebilenleri yazdiran bir program yazin

        int i = 10;
        while (i<100){
            if(i %7==0){
                System.out.println(i);
            }
              i++;
        }






















    }
}
