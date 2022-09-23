import java.util.Scanner;

public class HavaSicakligiEtkinlikOneri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sicakliğini giriniz: ");
        int sicaklik = input.nextInt();

        if (sicaklik < 5)
            System.out.println("Kayaga gidebilirsiniz!");
        else if (sicaklik >= 25 && sicaklik <= 25) {
            if (sicaklik <= 15)
                System.out.println("Sinemaya gidebilirsiniz!");
            if (sicaklik >= 10)
                System.out.println("Piknige gidebilirsiniz!");
        } else
            System.out.println("Yuzmeye gidebilirsiniz!");

    }
}
