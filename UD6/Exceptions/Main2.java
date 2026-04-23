package Exceptions;

import java.util.Scanner;

public class Main2 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Dime el numero positivo: ");
                int p = sc.nextInt();
                sc.nextLine();
                imprimePositivo(p);
                System.out.println("Dime el numero negativo: ");
                int n = sc.nextInt();
                sc.nextLine();
                imprimeNegativo(n);
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

    }
    static void imprimePositivo( int p) throws Exception {
        if (p >= 0){
            System.out.println(p);
        }else{
            throw new Exception("El numero no puedo ser negativo");
        }
    }

    static void imprimeNegativo( int n) throws Exception {
        if (n < 0){
            System.out.println(n);
        }else{
            throw new Exception("El numero no puede ser positivo");
        }
    }
}
