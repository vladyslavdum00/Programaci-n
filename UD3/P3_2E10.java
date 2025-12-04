import java.util.Scanner;

public class P3_2E10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime el dia (1-30): ");
        int dia = leer.nextInt();

        System.out.println("Dime el mes (1-12)");
        int mes = leer.nextInt();

        System.out.println("Dime el año: ");
        int año = leer.nextInt();

        System.out.println("La fecha es correcta: " +compruebaFecha(dia, mes, año));

    }

public static boolean compruebaFecha(int dia, int mes, int año){
    if (dia > 0 && dia <= 30 && mes > 0 && mes <= 12 && año > 0 && año <= 2025){
        return true;
    }else{
        return false;
    }
}


}
