import java.util.Scanner;

public class P3E5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Intruce cantidad de milas: ");
        int milas = leer.nextInt();

        System.out.println("Milas convertidas a kilometros: " +milas_a_kilometros(milas));
    }


    public static double milas_a_kilometros(int milas){
        return milas * 1.60934;
    }


}
