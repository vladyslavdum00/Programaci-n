import java.util.Scanner;

public class U4_E6 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Dime el tamaño de array: ");
     int n = sc.nextInt();
     boolean[] booleanos = alternarBooleanos(n);
        int contador = 0;
     for ( int i = 0; i < booleanos.length; i++){
        if (booleanos[i] == true){
            contador++;
        }

    }
    System.out.println(contador);
    }


    static boolean[] alternarBooleanos(int n){
        boolean[] booleanos = new boolean[n];
       booleanos[0] = true;

        for (int i = 1; i < booleanos.length - 1; i++){
            if (booleanos[i] == false){
                booleanos[i + 1] = true;
            }else if (booleanos[i] == true){
                booleanos[i + 1] = false;
            }

            if (booleanos[i] == true){

            }
        }
    return booleanos;
    }




}
