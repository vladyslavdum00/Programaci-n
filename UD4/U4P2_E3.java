import java.util.Scanner;

public class U4P2_E3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[8];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduzca el nombre: ");
            nombres[i] = sc.nextLine().trim();
        }
        System.out.println("Dime la letra: ");
        char letra = sc.next().charAt(0);
        int contador = 0;


            for (int j = 0; j < nombres.length; j++) {
                if (nombres[j].charAt(0) == letra) {
                    contador++;
                }
            }
            System.out.println("Hay " + contador + " nobmres que se empieszan por  " +letra);
        }










    }


