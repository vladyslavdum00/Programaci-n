import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class P7E27 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dime el año de nacimiento: ");
        int año = leer.nextInt();

        System.out.print("Dime el mes de nacimiento: ");
        int mes = leer.nextInt();

        System.out.print("Dime el dia de nacimiento: ");
        int dia = leer.nextInt();

        LocalDate cumpleaños = LocalDate.of(año, mes, dia);
        LocalDate hoy = LocalDate.now();

        Period edad = Period.between(cumpleaños, hoy);
        System.out.println("Tu edad es: " + edad.getYears());
    }
}
