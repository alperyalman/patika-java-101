import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {
        double r;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        // Alan Formülü : π * r * r;
        double alan = Math.PI*r*r;
        System.out.println("Dairenin alanı: "+ alan);

        // Çevre Formülü : 2 * π * r;
        double cevre = 2*Math.PI*r;
        System.out.println("Dairenin çevresi: "+ cevre);
        System.out.println();
        System.out.print("Merkez açı değeri giriniz: ");
        double alpha = input.nextDouble();
        double dilimAlan = (Math.PI*r*r)*alpha/360.0;
        System.out.println(alpha + " Derecelik Daire Diliminin Alanı: " + dilimAlan);

    }
}
