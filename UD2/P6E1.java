import java.util.Scanner;
public class P6E1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int Segundos;
                System.out.println("Introduce el cantidad de segundos: ");
        Segundos = entrada.nextInt();
            int Dias = Segundos / 86400;
            int Horas = Segundos / 3600;
            int Minutos = Segundos / 60;
                System.out.println("Dias: " + Dias);
                System.out.println("Horas: " + Horas);
                System.out.println("Minutos: " + Minutos);
                System.out.println("Segundos: " + Segundos);
    }
}
