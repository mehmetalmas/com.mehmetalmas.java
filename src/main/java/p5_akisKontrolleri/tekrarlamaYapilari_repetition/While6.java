package p5_akisKontrolleri.tekrarlamaYapilari_repetition;

public class While6 {
    public static void main(String[] args) {
        //Bir dizi içindeki tüm elemanları ekrana yazdıran bir program yazın.

        int[] ary = {5,8,4,11};
        int i = 0;  // while da her zaman bir baslangic degeri tanimlaman gerekir

        while (i < ary.length){
            System.out.println(ary[i]);
            i++;  // bunu yazmazsan sonsuz döngüye girer ve hep ilk elemani yazdirir
                  // bu fordaki degeri arttirma gibi bir sart kosma yoksa nereye kadar gidecegini bilmez

        }



        //Bir sayıyı tersine çeviren bir program yazın (Örneğin, 12345 sayısı 54321 olmalıdır).







    }
}
