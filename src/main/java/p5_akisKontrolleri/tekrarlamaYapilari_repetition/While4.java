package p5_akisKontrolleri.tekrarlamaYapilari_repetition;

public class While4 {
    public static void main(String[] args) {


        int i = (int)(10*Math.random());
        int j = (int)(10*Math.random());
        boolean b = i>j;

        System.out.println("\nilk while");
        while (b = !b) // hicbir zaman ilk while girmez
            System.out.println("i = " + i + "  j = " + j);

        System.out.println("\nikinci while");
        while (b = i > j ? true : false) { // false olursa döngüye girmez
            System.out.println("i = " + i + "  j = " + j);
         i = (int)(10*Math.random());
         j = (int)(10*Math.random());
        }

        System.out.println("\nücüncü while");
        while (b = getBoolean()) {  // getBoolean() static ilk degeri hemen alir, b yukarida ki durumunda
            // while parantez icinde karsilastirma yapar esit(true) ise while tekrara(döngüye) girer cümler false
            // olana kadar isleme devam eder
            System.out.println("i = " + i + "  j = " + j);
            i = (int)(10*Math.random());
            j = (int)(10*Math.random());

        }



    }


    public static  boolean getBoolean() {
        boolean b;
        return  b = Math.random() > 0.5 ? true : false;
    }

}
