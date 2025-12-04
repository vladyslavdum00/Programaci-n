import java.util.Scanner;

public class P7E21 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Dime tu peso (kg): ");
        double peso = leer.nextDouble();

        System.out.println("Dime tu altura (m): ");
        double altura = leer.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 16) {
            System.out.println("Criterio de ingreso a hospital");
        }else if (imc >= 16 && imc <= 17) {
            System.out.println("infrapeso");
        }else if (imc >= 17 && imc <= 18) {
            System.out.println("bajo peso");
        }else if (imc >= 18 && imc <= 25) {
            System.out.println("peso normal(saludable)");
        }else if (imc >= 25 && imc <= 30 ) {
            System.out.println("sobrepeso (obesidad de grado I)");
        }else if (imc >= 30 && imc <= 35) {
            System.out.println("sobrepeso cronico (obesidad de grado II)");
        }else if (imc >= 35 && imc <= 40) {
            System.out.println("obesidad premorbida (obesidad de grado III)");
        }else if (imc > 40) {
            System.out.println("obesidad morbida (obesidad de grado IV)");
        }
    }
}
