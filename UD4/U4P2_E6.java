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
    String [] iguales = new String[palabras.length];
    for (int i = 0; i < palabras.length; i++) {
        for (int j = i+1; j < palabras.length; j++) {

            if (palabras[i].equals(palabras[j])) {
                iguales[i] = palabras[j];
            }
        }
    }
    if (iguales[0] != null) {
        for (int i = 0; i < iguales.length; i++) {

                System.out.println(iguales[i]);

    }

    }











    }
}
