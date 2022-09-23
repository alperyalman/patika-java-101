import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, muzik;

        // Kullanıcdan değer almak için scanner sınıfnın tanımlanması
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerlin alınması
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = 0;
        int dersSayisi = 0;

        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            dersSayisi++;
        }

        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }

        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }

        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }

        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }

        double ortalama = toplam / (double) dersSayisi;

        if (ortalama < 55) {
            System.out.println("Sinifta kaldiniz!");
        } else {
            System.out.println("Tebrikler gectiniz!");
        }

        System.out.println("Ortalama: " + ortalama);
    }
}
