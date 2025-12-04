import java.util.Scanner;

public class JuegoTresEnRaya {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String tablero = "123456789";
    int uTurno;
    int oTurno = 0;




dibujaTabla(tablero);

do{


    uTurno = turnoUsuario(sc);
    if (compruebaJugadaUsuario(uTurno)) {
        System.out.println("Elige un numero entre (1-9): \n");
        continue;
    }

    if (compruebaCasillaLibreOcupada(uTurno, tablero)){
        System.out.println("Tienes que elegir otra casilla: \n");
        continue;
    }
    tablero = PintarTablaUsuario(tablero, uTurno);

    dibujaTabla(tablero);

    if (Empate(tablero)) {
               System.out.println("Empate!");
               break;
           }

    oTurno = turnoOrdenador(tablero, oTurno);

    tablero = PintarTablaOrdenador(tablero, oTurno);
    dibujaTabla(tablero);

    if (Empate(tablero)) {
               System.out.println("Empate!");
               break;
           }

           if (CompruebaVictoriaUsuario(tablero)){
            System.out.println("Gana Usuario!!!!");
            break;
           }
           if (CompruebaVictoriaOrdenador(tablero)){
            System.out.println("Cana Ordenador!!!");
            break;
           }











}while(true);



}

//Metodos

static void dibujaTabla(String tablero){

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
}
        static int turnoUsuario(Scanner sc){
            System.out.print("Elige tu turno(1-9): ");
            int uTurno = sc.nextInt();
            return uTurno;
    }

    static boolean compruebaJugadaUsuario(int uTurno){
        if (uTurno < 1 || uTurno > 9){
              return true;

            }else return false;
    }

    static boolean compruebaCasillaLibreOcupada(int uTurno, String tablero){
        if (tablero.charAt(uTurno - 1) == 'X' || tablero.charAt(uTurno - 1) == 'O'){
               return true;
            }else return false;
    }







    static String PintarTablaUsuario(String tablero, int uTurno){
        tablero = tablero.substring(0, uTurno - 1) + 'X' + tablero.substring(uTurno);
        return tablero;
    }


    static int turnoOrdenador(String tablero, int oTurno){
        System.out.println("Turno del ordenador \n");
        int res;
         do{
            res = 1 + (int) (Math.random() * 9);

            }while(tablero.charAt(res - 1) == 'X' || tablero.charAt(res - 1) == 'O');
            return res;

    }

    static String PintarTablaOrdenador(String tablero, int oTurno){

        tablero = tablero.substring(0, oTurno - 1) + "O" + tablero.substring(oTurno);
        return tablero;
    }


    static boolean Empate(String tablero){
        boolean empate = true;
        for (int i = 1; i <= 9; i++) {
               if (tablero.contains(String.valueOf(i))) {
                   empate = false;
                   break;
               }
           }
           return empate;
    }


        static boolean CompruebaVictoriaUsuario(String tablero){
            if(tablero.charAt(0) == 'X' && tablero.charAt(1) == 'X' && tablero.charAt(2) == 'X') {
             return true;

            }else if (tablero.charAt(3) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(5) == 'X'){
              return true;

            }else if (tablero.charAt(6) == 'X' && tablero.charAt(7) == 'X' && tablero.charAt(8) == 'X'){
              return true;

            }else if (tablero.charAt(0) == 'X' && tablero.charAt(3) == 'X' && tablero.charAt(6) == 'X'){
              return true;

            }else if (tablero.charAt(2) == 'X' && tablero.charAt(5) == 'X' && tablero.charAt(8) == 'X'){
              return true;

            }else if (tablero.charAt(1) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(7) == 'X'){
              return true;

            }else if (tablero.charAt(0) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(8) == 'X'){
              return true;

            }else if (tablero.charAt(2) == 'X' && tablero.charAt(4) == 'X' && tablero.charAt(6) == 'X'){
             return true;

            }else return false;
        }


        static boolean CompruebaVictoriaOrdenador(String tablero){
            if (tablero.charAt(0) == 'O' && tablero.charAt(1) == 'O' && tablero.charAt(2) == 'O') {
             return true;
            }else if (tablero.charAt(3) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(5) == 'O'){
              return true;
            }else if (tablero.charAt(6) == 'O' && tablero.charAt(7) == 'O' && tablero.charAt(8) == 'O'){
              return true;
            }else if (tablero.charAt(0) == 'O' && tablero.charAt(3) == 'O' && tablero.charAt(6) == 'O'){
              return true;
            }else if (tablero.charAt(2) == 'O' && tablero.charAt(5) == 'O' && tablero.charAt(8) == 'O'){
              return true;
            }else if (tablero.charAt(1) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(7) == 'O'){
              return true;
            }else if (tablero.charAt(0) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(8) == 'O'){
              return true;
            }else if (tablero.charAt(2) == 'O' && tablero.charAt(4) == 'O' && tablero.charAt(6) == 'O'){
              return true;
            }else return false;
        }



    }