import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        //Hipotenüs hesaplama
        int a,b,c;
        double cevre;
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.print("2. kenar uzunluğunu giriniz: ");
        b = input.nextInt();
        System.out.print("3. kenar uzunluğunu giriniz: ");
        c = input.nextInt();

        double u = (a+b+c)/2.0;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
