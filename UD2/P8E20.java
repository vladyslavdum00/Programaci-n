import java.util.Scanner;

public class P8E20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        boolean stop = false;
        boolean diez = false;
        int c = 0;
        do{
            System.out.println("Dime tu nota");
            int nota = leer.nextInt();
            c++;
            if (nota > -1){
                suma += nota;
            }

            
            if (nota == -1) {
                stop = true;
                c--;
            }
            if (nota == 10){
                diez = true;
            }

                
            
        }while (stop != true);

        int media = (suma / c);
        System.out.println("La suma total es: " +suma);
        System.out.println("La media es: " +media);
        if (diez == true) {
            System.out.println("Habia un 10");
        }

    }
}
