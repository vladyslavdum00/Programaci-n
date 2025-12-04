import java.util.Scanner;

public class P7E19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce el angulo en grados: ");
        double grados = leer.nextDouble();

        System.out.println("Escribe una letra (s, c, t)");
        String letra = leer.next();

        if (letra.equals("s")) {
            System.out.println("Sinus de angulo" + " " + grados + " " + "es: " + Math.sin(grados));

        }else if (letra.equals("c")){
            System.out.println("Cosinus de angulo" + " " + grados + " " + "es: " + Math.cos(grados));
        }else if (letra.equals("t")) {
            System.out.println("Tangens de angulo" + " " + grados + " " + "es: " + Math.tan(grados));
        }else{
            System.out.println("HOY NO!!!!");
        }

    }
}
