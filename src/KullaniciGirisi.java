import java.net.PasswordAuthentication;
import java.util.Scanner;

import javax.xml.transform.Source;

public class KullaniciGirisi {

    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanic adiniz: ");
        userName = input.nextLine();

        System.out.print("Sifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123"))
            System.out.println("Giris yaptiniz!");
        else if (!userName.equals("patika"))
            System.out.println("Kullanici adiniz yanlis!");
        else {
            System.out.println("Bilgileriniz yanlis!\nSifrenizi sifirlamak ister misiniz? 1-Evet, 2-Hayir");
            int select = input.nextInt();
            if (select == 1) {
                String newPassword = password;
                while (true) {
                    input = new Scanner(System.in);
                    System.out.print("Yeni sifre giriniz : ");
                    newPassword = input.nextLine();
                    if (newPassword.equals(password) || newPassword.equals("java123")) {
                        System.out.println("Sifre olusturulamadi, lutfen oncekilerden farkli bir sifre giriniz.\n");
                        continue;
                    }
                    System.out.println("Sifre olusturuldu!");
                    break;
                }
            } else
                System.out.println("Giris yapamadiniz!");
        }

    }
}