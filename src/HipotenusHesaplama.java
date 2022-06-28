import java.sql.SQLOutput;
import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        //Hipotenüs hesaplama
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("1. dik kenar uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.print("2. dik kenar uzunluğunu giriniz: ");
        b = input.nextInt();

        c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs uzunluğu: " + c);
    }
}
