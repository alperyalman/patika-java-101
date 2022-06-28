import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int tmAcilis = 10;
        double ucretKM = 2.2;
        double ucretMin = 20;
        double mesafeKM;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafe (KM): ");
        mesafeKM = input.nextDouble();

        double ucret = tmAcilis + mesafeKM*ucretKM;
        double toplamOdeme = (ucret>ucretMin) ? ucret : ucretMin;

        System.out.println("Toplam ödem tutarı: " + toplamOdeme + " TL");

    }
}
