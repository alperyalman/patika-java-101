import java.util.Scanner;

/**
 * ArtikYilHesaplama
 */
public class LeapYearCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yil giriniz: ");

        int year = input.nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            isLeapYear = true;
            if (year % 100 == 0 && year % 400 != 0)
                isLeapYear = false;

        } else
            isLeapYear = false;

        System.out.println(year + " bir artik yil" + (isLeapYear ? "dir." : " degildir."));
    }
}