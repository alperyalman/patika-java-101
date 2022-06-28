import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün tutarını giriniz: ");
        tutar = input.nextDouble();
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den
        //büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        kdvOran = (tutar>1000) ? 0.08:0.18;
        double kdvTutar = tutar*kdvOran;
        double kdvDahilTutar = tutar + kdvTutar;

        System.out.println("********** Ödeme Özeti **********");
        System.out.println("Ürün Tutarı: " + tutar);
        System.out.println("KDV (%18): " + kdvTutar);
        System.out.println("KDV Dahil Fiyat: " + kdvDahilTutar);
    }
}
