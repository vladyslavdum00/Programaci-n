package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ContadorDeFrecuencias {
    public static void main(String[] args) {
        HashMap<String, Integer> votos = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            String palabra = sc.nextLine();
            if (votos.containsKey(palabra)) {
                votos.put(palabra, votos.get(palabra) + 1);
            }else {
                votos.put(palabra, 1);
            }
        }

        System.out.println(votos);
    }
}
