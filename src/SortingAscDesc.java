import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/**
 * SortingDesc
 */
public class SortingAscDesc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("1. sayi: ");
        a = input.nextInt();
        System.out.print("2. sayi: ");
        b = input.nextInt();
        System.out.print("3. sayi: ");
        c = input.nextInt();

        System.out.println("a:" + a + ", b:" + b + ", c:" + c);
        // input = new Scanner(System.in);
        System.out.println("Siralama turu seciniz: 1-Kucukten buyuge, 2-Buyukten kucuge");
        int select = input.nextInt();

        if (a > b && a > c) {
            if (b > c)
                System.out.println(select == 1 ? "c < b < a" : "a > b > c");
            else
                System.out.println(select == 1 ? "b < c < a" : "a > c > b");
        } else if (b > a && b > c) {
            if (a > c)
                System.out.println(select == 1 ? "c < a < b" : "b > a > c");
            else
                System.out.println(select == 1 ? "a < c < b" : "b > c > a");
        } else {
            if (b > a)
                System.out.println(select == 1 ? "a < b < c" : "c > b > a");
            else
                System.out.println(select == 1 ? "b < a < c" : "c > a > b");
        }

    }
}