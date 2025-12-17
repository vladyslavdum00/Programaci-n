import java.util.Scanner;
import java.util.Arrays;
public class U4P3_E4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el cantidad de alumnos que desea insertar: ");
        int a = sc.nextInt();
        System.out.println("Dime el cantidad de asignaturas: ");
        int n = sc.nextInt();
        double[][] notas = leerNotas(sc, a, n);
        double[] mediaAlumno = mediaPorAlumno(notas);
        double[] mediaAsignaturas = mediaPorAsignatura(notas);

        for (int i = 0; i < mediaAlumno.length; i++) {
            System.out.println("El alumno " + i + " tiene la media: " + mediaAlumno[i]);
        }
        System.out.println(Arrays.toString(mediaAlumno));
        System.out.println(Arrays.toString(mediaAsignaturas));
    }


    static double[][] leerNotas(Scanner sc, int a, int n){
        double[][] notas = new double[a][n];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " +(i + 1));
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Dime la nota " +(j + 1));
                notas[i][j] = sc.nextDouble();
            }
        }
        return notas;
    }

    static double[] mediaPorAlumno(double[][] notas){
        double[] mediaAlumno = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            double mediaAux = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];

            }
            mediaAux = suma / notas[i].length;
            mediaAlumno[i] = mediaAux;
        }
        return mediaAlumno;
    }

    static double[] mediaPorAsignatura(double[][] notas){
        int numAsignaturas = notas[0].length;
        double[] mediaAsignatura = new double[numAsignaturas];
        for (int i = 0; i < numAsignaturas; i++) {
            double suma = 0;
            double mediaAux = 0;

            for (int j = 0; j < notas.length; j++) {
                suma += notas[j][i];
            }
            mediaAux = suma / notas.length;
            mediaAsignatura[i] = mediaAux;
        }
    return mediaAsignatura;
    }

    static void imprimirMatriz(double[][] m){
        for (int i = 0; i < m.length; i++) {
            System.out.println("Alumno " +(i + 1));
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Nota" +(j + 1) + m[i][j]);

            }
        }
    }
    /*



    static void imprimirVector(double[] v){}

*/
}
