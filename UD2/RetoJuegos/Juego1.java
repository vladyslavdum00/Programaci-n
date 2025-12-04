package RetoJuegos;

import java.util.Random;
import java.util.Scanner;

public class Juego1 {
    public static void main(String[] args) {
       
        //Creación de variables, scanner, random y contadores
        
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        String respuestaOrd = "";
        String respuestaUsu = "";
        int empate = 0;
        int victoriaUsu = 0;
        int victoriaOrd = 0;
        
        //Inicio del bucle
        do{
            
            //En cada iteración vacia las variables
            respuestaOrd = "";
            respuestaUsu = "";
            
            
            //Pide al usuario que eliga jugada o si quiere terminar juego
            System.out.print("Elige tu jugada (tijera, papel o piedra) y para acabar juego salir: ");
            respuestaUsu = leer.nextLine().toLowerCase();
            
            //Compruebo respuesta que va a terminar juego
            if (respuestaUsu.equals("salir")){
                break;
            }
            
            //Compruebo si entrada de datos es correcta
            if (!respuestaUsu.equals("tijera") && !respuestaUsu.equals("papel") && !respuestaUsu.equals("piedra")){
                System.out.println("Jugada incorecta");
                continue;
            }
            
            
            //Uso el random para generar numero aleatorio y asigno cada numero a una respuesta para jugada del ordenador
            int num = random.nextInt(3) + 1;
             switch (num) {
                case 1:
                    respuestaOrd = "tijera";
                    break;
                
                case 2:
                respuestaOrd = "papel";
                break;

                case 3:
                respuestaOrd = "piedra";
                break;
             
                
             }
        
        
             //Muestro jugada del ordenador
             System.out.println("Jugada de ordenador es: " +respuestaOrd);

             
             //Compruebo quien gana y calculo victorias y empates
             if (respuestaUsu.equals(respuestaOrd)) {
                empate++;
                System.out.println("Empate!!!!");
             }else if ((respuestaUsu.equals("tijera") && respuestaOrd.equals("papel")) || 
             (respuestaUsu.equals("papel") && respuestaOrd.equals("piedra"))
              || (respuestaUsu.equals("piedra") && respuestaOrd.equals("tijera"))){
                victoriaUsu++;
                System.out.println("Ganas tu!!!");
             
               
             }else{
                victoriaOrd++;
                System.out.println("Gana ordenador!!");
             }
                
             
            
            }while(true);

             
            //Muestro resultado
            System.out.println("Marcador final -> Usuario: " +victoriaUsu +" | " +"Ordenador: " +victoriaOrd +" | " +"Empate: " +empate);




        
        
        }


    }

