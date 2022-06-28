import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        indeks = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz :" + indeks);
    }
}
