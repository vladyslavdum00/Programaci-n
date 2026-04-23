package Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class MainGato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            while (true){
                try {
                    System.out.println("Introduce el nombre del gato" + (i + 1) );
                    String nombre = sc.nextLine();
                    System.out.println("Introduce el edad del gato ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    gatos.add(new Gato(edad, nombre));
                    break;
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        for( Gato gato : gatos ){
           gato.imprimir();
        }

    }
}
