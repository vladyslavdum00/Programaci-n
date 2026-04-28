package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class CribaDuplicados {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 20; i++) {
            listaNumeros.add(rnd.nextInt(10) + 1);
        }

        System.out.println("Lista original (con repetidos): " + listaNumeros);


        HashSet<Integer> numerosUnicos = new HashSet<>(listaNumeros);

        System.out.println("Lista limpia: " + numerosUnicos);
        System.out.println("El tamaño se redujo de " + listaNumeros.size() + " a " + numerosUnicos.size());
    }
}
