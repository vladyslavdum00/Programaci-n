import java.util.Arrays;

public class Practica1 {
    static void main(String[] args) {
        double[] notas = new double[20];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (double) (Math.random() * 10.0);
        }
        System.out.println("Notas: " + Arrays.toString(notas));
        int suspensos = 0;
        int aprobados = 0;
        int notables = 0;
        int sobresalientes = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 0 && notas[i] <=4.99) {
                suspensos++;
            } else if (notas[i] > 4.99 && notas[i] <=6.99) {
                aprobados++;
            }else if (notas[i] > 6.99 && notas[i] <=8.99) {
                notables++;
            }else {
                sobresalientes++;
            }
        }
        System.out.println("Suspensos: " + suspensos);
        System.out.println(" Aprobados: " + aprobados);
        System.out.println(" Notables: " + notables);
        System.out.println(" Sobresalientes: " + sobresalientes);



    }



}
