import java.util.Scanner;

public class U4P2_E5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] palabras = {"artem", "bob", "zack", "vlad"};

        boolean orden = false;
        for (int i = 0; i < palabras.length - 1; i++) {
            if (palabras[i].compareTo(palabras[i + 1]) < 0) {
                orden = true;
            } else if (palabras[i].compareTo(palabras[i + 1]) > 0) {
                orden = false;
                break;
            }
            if (i == palabras.length - 1) {
                if (palabras[palabras.length - 1].compareTo(palabras[i - 1]) < 0) {
                    orden = true;
                } else if (palabras[palabras.length - 1].compareTo(palabras[i - 1]) > 0) {
                    orden = false;
                }
            }
        }

        if (orden) {
            System.out.println("Bien");
        } else System.out.println("Mal");








    }
}
