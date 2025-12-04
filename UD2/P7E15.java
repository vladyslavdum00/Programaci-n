import java.util.Scanner;

public class P7E15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe primera nota: ");
        int nota1 = leer.nextInt();

        System.out.print("Escribe segunda nota: ");
        int nota2 = leer.nextInt();

        System.out.print("Escribe tercera nota: ");
        int nota3 = leer.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;
        int redondeado = (int) Math.round(media);
        
         if (nota1 < 5 || nota2 < 5 || nota3 < 5) {
            redondeado = Math.min(redondeado, 4);
         }

         System.out.println("Nota final es: " + redondeado);

         
         
        
         

    }
}
