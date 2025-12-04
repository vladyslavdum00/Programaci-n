import java.util.Random;
import java.util.Scanner;

public class P8E25 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Random random = new Random();

        System.out.print("Dime cuantas veces quieres tirar el dado: ");
        int num = leer.nextInt();

        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;

        for (int i = 1; i <= num; i++){
            int numdado = random.nextInt(6) + 1;
                if (numdado == 1) {
                    uno++;
                }else if (numdado == 2) {
                    dos++;
                }else if (numdado == 3) {
                    tres++;
                }else if (numdado == 4) {
                    cuatro++;
                }else if (numdado == 5) {
                    cinco++;
                }else if (numdado == 6) {
                    seis++;
                }
        }
        System.out.println("Tirada 1: " +uno +" veces " + " "+uno * 100 / num +"%");
        System.out.println("Tirada 2: " +dos +" veces " + " "+dos * 100 / num +"%");
        System.out.println("Tirada 3: " +tres +" veces " + " "+tres * 100 / num +"%");
        System.out.println("Tirada 4: " +cuatro +" veces " + " "+cuatro * 100 / num +"%");
        System.out.println("Tirada 5: " +cinco +" veces " + " "+cinco * 100 / num +"%");
        System.out.println("Tirada 6: " +seis +" veces " + " "+seis * 100 / num +"%");

    }
}
