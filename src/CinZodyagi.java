import java.util.Scanner;

/**
 * CinZodyagi
 */
public class CinZodyagi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz: ");
        int dogumYili = input.nextInt();
        String burc = "";

        switch (dogumYili % 12) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Kopek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Okuz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavsan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yilan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                burc = "Bulunamadi";
                break;
        }
        System.out.println("Cin zodyagi burcunuz: " + burc);
    }
}