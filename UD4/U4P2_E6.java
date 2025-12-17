import java.util.Scanner;
import java.util.Arrays;

public class U4P2_E6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[10];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduzca la palabra: ");
            palabras[i] = sc.nextLine().trim();
        }
        String[] iguales = new String[10];
        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < iguales.length; j++) {

                if (palabras[i].equals(palabras[j])) {
                    iguales[i] = palabras[j];
                }
            }
        }

        for (int i = 0; i < iguales.length; i++) {
            if (iguales[i] != null) {
                System.out.println(iguales[i]);
            }
        }

    }


}

