package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Traductor {
    public static void main(String[] args) {
        HashMap<String,String> palabras = new HashMap<String,String>();
        palabras.put("Apple", "Manzana");
        palabras.put("Banana", "Platano");
        palabras.put("Orange", "Naranja");
        palabras.put("Pineapple", "Piña");
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la palabra: ");
        String palabra = sc.nextLine();
        System.out.println(palabras.get(palabra));
    }
}
