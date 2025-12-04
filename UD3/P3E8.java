import java.util.Scanner;

public class P3E8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;


       do{
        System.out.println("Dame el numero (1-10): ");
        n = leer.nextInt();
       }while(n < 1 || n > 10);



       System.out.println("Suma: " +suma1aN(n));
       System.out.println("Producto: " +producto1aN(n));
       System.out.println("Media: " +intermedio1aN(n));


    }

    public static int suma1aN(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++){
            suma += i;
        }
        return suma;
    }

    public static int producto1aN(int n){
        int producto = 1;
        for (int i = 1; i <= n; i++){
            producto *= i;
        }
        return producto;
    }


    public static double intermedio1aN(int n){
         int suma = 0;
         double media = 0;
         int a = 0;
        for (int i = 1; i <= n; i++){
            suma += i;
            a++;
        }
        media = suma / a;
        return media;

    }







}
