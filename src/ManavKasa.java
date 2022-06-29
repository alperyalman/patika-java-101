import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutKgFiyat = 2.14;
        double elmaKgFiyat = 3.67;
        double domatesKgFiyat = 1.11;
        double muzKgFiyat = 0.95;
        double patlicanKgFiyat = 5.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        double armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKg = input.nextDouble();

        System.out.println("************************");

        double toplamTutar = armutKg*armutKgFiyat + elmaKg*elmaKgFiyat + domatesKg*domatesKgFiyat + muzKg*muzKgFiyat + patlicanKg*patlicanKgFiyat;
        System.out.println("Toplam Tutar: " + toplamTutar);

    }
}
