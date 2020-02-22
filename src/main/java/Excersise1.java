import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Excersise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = scanner.nextInt();
            suma += tablica[i];
            if (tablica[i] > max) {
                max = tablica[i];
            }
            if (tablica[i] < min) {
                min = tablica[i];
            }


        }
        System.out.println(Arrays.toString(tablica));
        System.out.println("Suma: " + suma);
        double srednia = (double) suma / tablica.length;
        System.out.println("Średnia : " + srednia);
        System.out.println("Max: " + max);
        System.out.println("Min : " + min);
        double sumodch = 0;
        for (int el : tablica){
            sumodch += Math.pow(el - srednia, 2) / tablica.length;

        }
        double x0 = Math.pow(tablica[0] - srednia,2);
        double x1 = Math.pow(tablica[1] - srednia,2);
        double x2 = Math.pow(tablica[2] - srednia,2);
        double x3 = Math.pow(tablica[3] - srednia,2);
        double x4 = Math.pow(tablica[4] - srednia,2);
        double x5 = Math.pow(tablica[5] - srednia,2);
        double x6 = Math.pow(tablica[6] - srednia,2);
        double x7 = Math.pow(tablica[7] - srednia,2);
        double x8 = Math.pow(tablica[8] - srednia,2);
        double x9 = Math.pow(tablica[9] - srednia,2);

        double sumax = (x0 + x1 + x2 + x3 + x4 + x5 +x6 + x7+ x8 +x9) / (tablica.length);
        double odchylenie = Math.sqrt(sumax);
        double odchylenie2 = Math.sqrt(sumodch);
        System.out.println("Odchylenie 2: " + odchylenie2);
        System.out.println("Odchylenie standardowe: " + odchylenie);





    }

}
