import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayiyi giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz: ");
        select = input.nextInt();

        System.out.println(select);

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0)
                    System.out.println("Bolme: " + (n1 / n2));
                else
                    System.out.println("0'a bolme hatasi!");
                break;
            default:
                System.out.println("Yanlis secim yaptiniz! Tekrar deneyiniz!");
                break;
        }

    }
}
