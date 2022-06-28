import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün tutarını giriniz: ");
        tutar = input.nextDouble();
        double kdvTutar = tutar*kdvOran;
        double kdvDahilTutar = tutar + kdvTutar;

        System.out.println("********** Ödeme Özeti **********");
        System.out.println("Ürün Tutarı: " + tutar);
        System.out.println("KDV (%18): " + kdvTutar);
        System.out.println("KDV Dahil Fiyat: " + kdvDahilTutar);
    }
}
