import java.util.Scanner;

public class P7E11 {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.println("Dime el dia de la semana (1-7)");
    int dia = leer.nextInt();

    switch (dia) {
        case 1:
        System.out.println("Es Lunes");
        break;
    
        case 2:
        System.out.println("Es Martes");
        break;

        case 3:
        System.out.println("Es Miercoles");
        break;

        case 4:
        System.out.println("Es Jueves");
        break;

        case 5:
        System.out.println("Es Viernes");
        break;

        case 6:
        System.out.println("Es Sabado");

        case 7:
        System.out.println("Es Domingo");
        break;

        default:
        System.out.println("error");
        break;
    }
}
    
}