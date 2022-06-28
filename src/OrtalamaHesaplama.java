import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Kullanıcdan değer almak için scanner sınıfnın tanımlanması
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerlin alınması
        System.out.println("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.println("Turkce Notunuz: ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzik = input.nextInt();

        int toplam   = (mat + fizik + kimya + tarih + turkce + muzik);
        double sonuc = toplam/6.0;

        System.out.println("Ortalama: " + sonuc);
        System.out.println("Durum: " + ((sonuc>60)?"Geçti":"Kaldı"));
    }
}
