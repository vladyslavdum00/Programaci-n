package Exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main_6_5_8 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = 99;
        for (int i = 0; i < 10; i++) {
            try {
                a = devuelveEntero(i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                a = 99;
            }
            System.out.println(a);
        }
    }


    public static void ej1() {
        try {
            System.out.println("Introduce numero: ");
            int num = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Valor introducido incorrecto.");
        }
    }

    public static void ej2() {
        try {
            System.out.println("Introduce numero A: ");
            int numA = sc.nextInt();
            System.out.println("Introduce numero A: ");
            int numB = sc.nextInt();
            int res = numA / numB;
            System.out.println("Resultado de A/B: " + res);
        }catch (InputMismatchException e){
            System.out.println("Error: el dato tiene que ser numero entero");
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
    }
    public static void ej3() {
        double[] arr = new double[5];
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                try {
                    System.out.println("Introduce numero: ");
                    arr[i] = sc.nextDouble();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("Valor introducido incorrecto.");
                    sc.next();
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Resultado: " + arr[i]);
        }

    }
    public static void ej4() {
        int[] arr = new int[(int) (Math.random()*100) +1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10) + 1;
        }
        System.out.println("Tamaño del array: " + arr.length);
        try {
            System.out.println("Introduce posicion del array: ");
            int num = sc.nextInt();
            System.out.println(arr[num]);
        }catch (InputMismatchException e){
            System.out.println("Valor introducido incorrecto.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("La posicion esta fuerra del array.");
        }
    }
    public static double acceso (double [] v, int j) throws RuntimeException {
        try{
            if ((0 <= j) && (j < v.length))
                return v[j];
            else
                throw new RuntimeException ("El indice " + j
                        + " no existe en el vector");
        }
        catch (RuntimeException exc){
            throw exc;
        }
    }

    private static int metodo ( ) throws NumberFormatException {
        int valor =0;
        try {
            valor = valor +1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println ("Valor al final del try : " + valor) ;
        }
        catch (NumberFormatException e ) {
            valor = valor + Integer.parseInt("42");
            System.out.println ("Valor al final del catch :" + valor);
            throw e;
        }
        finally {
            valor = valor + 1;
            System.out.println("Valor al final de finally :" + valor) ;
        }
        valor = valor + 1;
        System.out.println ("Valor antes del return : " + valor);
        return valor;
    }
    public static int devuelveEntero1(int num) {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepcion");
            }
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
    public static int devuelveEntero(int num) throws Exception {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepcion rana");
            } else {
                throw new IOException("Lanzando excepcion pezezpada");
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
            return 2;
        }
    }
}
