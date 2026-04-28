package HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BuscadorPalabrasUnicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String[] palabras = texto.toLowerCase().split(" ");
        HashSet<String> palabrasUnicos = new HashSet<>(List.of(palabras));
        System.out.println("Palabra unicas: " + palabrasUnicos);
    }

}
