import java.util.Random;
import java.util.Scanner;

public class Juego3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        String tablero = "123456789";

        int uTurno = 0;
        int oTurno = 0;

            System.out.println("Tablero: ");


            //Con este bucle estoy dibujando la tabla
            for (int j = 1; j <= tablero.length(); j++){
               switch (j) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 7:
                case 8:
                System.out.print(j + " | ");
                break;

                case 3:
                case 6:
                System.out.print(j);
                System.out.println("\n---------");
                break;
                case 9:
                System.out.println(j);
                break;
               }


            }

            //estoy comprobando si el usuario ha introducido numero correcto
            do{
            System.out.print("Elige tu turno(1-9): ");
            uTurno = leer.nextInt();
            if (uTurno < 1 || uTurno > 9){
              System.out.println("Elige un numero entre 1-9");
              continue;
            }

            //esta comprobando si la casilla esta libre o ocupada
            if (tablero.charAt(uTurno - 1) == 'X' || tablero.charAt(uTurno - 1) == 'O'){
                System.out.println("Esa casilla esta ocupada");
                continue;
            }

            //cambio de numeros a caracteres
            tablero = tablero.substring(0, uTurno - 1) + 'X' + tablero.substring(uTurno);
             System.out.println("Tablero: ");

          //comprueba si la tabla esta llena o no
          boolean empate = true;
           for (int i = 1; i <= 9; i++) {
               if (tablero.contains(String.valueOf(i))) {
                   empate = false;
                   break;
               }
           }
           if (empate) {
               System.out.println("Empate!");
               break;
           }



          //comprueba todas posibles conbinaciones para saber si alguien ha ganado o no
          if(tablero.charAt(0) == 'X' && tablero.charAt(1) == 'X' && tablero.charAt(2) == 'X') {
              System.out.println("Ganas tu!");
              break;
            }else if (tablero.charAt(3) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(5) == 'X'){
              System.out.println("Ganas tu!");
              break;
            }else if (tablero.charAt(6) == 'X' && tablero.charAt(7) == 'X' && tablero.charAt(8) == 'X'){
              System.out.println("Ganas tu!");
              break;
            }else if (tablero.charAt(0) == 'X' && tablero.charAt(3) == 'X' && tablero.charAt(6) == 'X'){
              System.out.println("Ganas tu!");
              break;
            }else if (tablero.charAt(2) == 'X' && tablero.charAt(5) == 'X' && tablero.charAt(8) == 'X'){
              System.out.println("Ganas tu!");
              break;
            }else if (tablero.charAt(1) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(7) == 'X'){
              System.out.println("Ganas tu!");
              break;
            }else if (tablero.charAt(0) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(8) == 'X'){
              System.out.println("Ganas tu!");
              break;
            }else if (tablero.charAt(2) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(6) == 'X'){
              System.out.println("Ganas tu!");
              break;
            }
            for (int j = 1; j <= tablero.length(); j++){
               switch (j) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 7:
                case 8:
                System.out.print(tablero.charAt(j-1) + " | ");
                break;

                case 3:
                case 6:
                System.out.print(tablero.charAt(j-1));
                System.out.println("\n---------");
                break;
                case 9:
                System.out.println(tablero.charAt(j-1));
                break;
               }


            }
            //usando random ordenador elige numero
            oTurno = random.nextInt(tablero.length());
            System.out.println("Turno del ordenador: ");
            do{
              oTurno = random.nextInt(tablero.length());


            }while(tablero.charAt(oTurno) == 'X' || tablero.charAt(oTurno) == 'O');

               tablero = tablero.substring(0, oTurno) + "O" + tablero.substring(oTurno + 1);
               empate = true;
           for (int i = 1; i <= 9; i++) {
               if (tablero.contains(String.valueOf(i))) {
                   empate = false;
                   break;
               }
           }
           if (empate) {
               System.out.println("Empate!");
               break;
           }


           if (tablero.charAt(0) == 'O' && tablero.charAt(1) == 'O' && tablero.charAt(2) == 'O') {
              System.out.println("Gana ORDENADOR!");
              break;
            }else if (tablero.charAt(3) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(5) == 'O'){
              System.out.println("Gana ORDENADOR!");
              break;
            }else if (tablero.charAt(6) == 'O' && tablero.charAt(7) == 'O' && tablero.charAt(8) == 'O'){
              System.out.println("Gana ORDENADOR!");
              break;
            }else if (tablero.charAt(0) == 'O' && tablero.charAt(3) == 'O' && tablero.charAt(6) == 'O'){
              System.out.println("Gana ORDENADOR!");
              break;
            }else if (tablero.charAt(2) == 'O' && tablero.charAt(5) == 'O' && tablero.charAt(8) == 'O'){
              System.out.println("Gana ORDENADOR!");
              break;
            }else if (tablero.charAt(1) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(7) == 'O'){
              System.out.println("Gana ORDENADOR!");
              break;
            }else if (tablero.charAt(0) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(8) == 'O'){
              System.out.println("Gana ORDENADOR!");
              break;
            }else if (tablero.charAt(2) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(6) == 'O'){
              System.out.println("Gana ORDENADOR!");
              break;
            }

                for (int j = 1; j <= tablero.length(); j++){
               switch (j) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 7:
                case 8:
                System.out.print(tablero.charAt(j-1) + " | ");
                break;

                case 3:
                case 6:
                System.out.print(tablero.charAt(j-1));
                System.out.println("\n---------");
                break;
                case 9:
                System.out.println(tablero.charAt(j-1));
                break;
               }


            }

           }while(true);

        }

        }
