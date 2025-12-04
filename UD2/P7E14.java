import java.util.Scanner;

public class P7E14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime el cantidad de hombres: ");
        int hombres = leer.nextInt();

        System.out.println("Dime el cantidad de mujeres: ");
        int mujeres = leer.nextInt();

        int total = hombres + mujeres;

        int phombres = hombres * 100 / total;
        int pmujeres = mujeres * 100 / total;


        System.out.println("Hombres: " + phombres + "%");
        System.out.println("Mujeres: " + pmujeres + "%");


        if (phombres > pmujeres) {
            System.out.println("Hay más hombres");
        } else if (phombres == pmujeres) {
            System.out.println("Misma cantidad de mujeres y hombres");
        }
        else {
            System.out.println("Hay más mujeres");
        }
    }
}
