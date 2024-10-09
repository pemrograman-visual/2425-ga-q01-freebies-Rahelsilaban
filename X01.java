// 12S24010 - Artha Liebe Siregar
// 12S24054 - Rahel Juri Elisabet Silaban


import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargaakhir, hargatiapbuku, palingmurah;

        hargaakhir = 0;
        hargatiapbuku = 0;
        hargatiapbuku = Double.parseDouble(input.nextLine());
        palingmurah = 1000;
        while (hargatiapbuku != 0) {
            if (palingmurah <= hargatiapbuku) {
                hargatiapbuku = hargatiapbuku;
            } else {
                palingmurah = hargatiapbuku;
            }
            hargaakhir = hargaakhir + hargatiapbuku;
            hargatiapbuku = Double.parseDouble(input.nextLine());
        }
        if (hargaakhir >= 100.0) {
            hargaakhir = hargaakhir - palingmurah;
        } else {
            hargaakhir = hargaakhir;
        }
        System.out.println(toFixed(hargaakhir,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

