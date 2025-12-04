import java.util.Scanner;

public class JuegoAhorcadoPalabra {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
            String secreta;
            String mostrada;
            char letra;
            int intentos = 5;
            secreta = generaPalabraSecreta();
            mostrada = inicializarPalabraMostrada(secreta);
            boolean contieneLetra = true;


            do{

            System.out.println("Palabra mostrada: " + mostrada);
            mostrarEstado(mostrada, intentos);
            letra = pedirLetra(sc);
            System.out.println("Letra: " + letra);

            if(contieneLetra != true){
                intentos--;
                System.out.println();

            }

            System.out.println(descubrirLetras(secreta, mostrada, letra));

            }while(intentos > 0);








        //System.out.println("Ahorcado de palabra: " +inicializarPalabraMostrada(generaPalabraSecreta()));
        //System.out.println(pedirLetra(sc));
       //System.out.println(contieneLetra(null, 0));





    }

    // Pide la palabra secreta al usuario y la devuelve en minúsculas.
    static String pedirPalabraSecreta(Scanner sc) {
        System.out.println("Dime la palabra: ");
        String secreta = sc.nextLine();
        return secreta;

    }


    // Devuelve una palabra secreta al azar de entre varias posibles
    // Nota: método alternativo a pedirPalabraSecreta(Scanner sc)





    static String generaPalabraSecreta() {
        Scanner sc = new Scanner(System.in);
        String palabra1 = "", palabra2 = "", palabra3 = "";
        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                palabra1 = pedirPalabraSecreta(sc);
            } else if (i == 2) {
                palabra2 = pedirPalabraSecreta(sc);
            } else {
                palabra3 = pedirPalabraSecreta(sc);
            }
        }

            int res = 1 + (int) (Math.random() * 3);
            switch (res) {
                case 1:
                    return palabra1;

                case 2:
                    return palabra2;

                case 3:
                    return palabra3;

                default:
                    return "";

            }



    }

    // Devuelve una cadena con tantos guiones como letras tenga ‘secreta’.
        static String inicializarPalabraMostrada(String secreta){
            String palabraCifrada = "";
            for (int i = 0; i < secreta.length(); i++){
                palabraCifrada += "-";
      }
      return palabraCifrada;
        }





        // Pide al usuario una letra y devuelve el primer carácter introducido.
        static char pedirLetra(Scanner sc){
            System.out.print("Dime la letra: ");
            char letra = sc.next().charAt(0);
            return  letra;

        }

        // Comprueba si la letra introducida está dentro de la palabra secreta.
        static boolean contieneLetra(String secreta, char letra){
            boolean contieneLetra = true;
            for (int j = 0; j < secreta.length(); j++){

                if (secreta.charAt(j) == letra){
                    contieneLetra = true;
                }else{
                    contieneLetra = false;
                }

        }
        return contieneLetra;
    }


    //Devuelve la palabra mostrada tras descubrir las letras acertadas.
    static String descubrirLetras(String secreta, String mostrada, char letra){
        String decifrada = "";
       for (int j = 0; j < secreta.length(); j++){

        if (secreta.charAt(j) == letra){

          decifrada += letra;


        }else{
          decifrada += mostrada.charAt(j);
        }



    }

      mostrada = decifrada;
      return mostrada;
    }


    // Devuelve true si ‘mostrada’ ya no contiene guiones (palabra completa).
        static boolean palabraCompleta(String mostrada){
            for (int i = 0; i < mostrada.length(); i++){
                if (mostrada.charAt(i) != '-'){
                    return true;
                }
            }
            return false;
        }

        // Muestra el estado actual del juego: palabra mostrada e intentos restantes.
        static void mostrarEstado(String mostrada, int intentos){
            System.out.println("Estado actual del juego: " +mostrada);
            System.out.println("Intentos restantes: " +intentos);
        }

        // Muestra el resultado final: si ha ganado o perdido y la palabra secreta.
        static void mostrarResultadoFinal(String secreta, boolean haGanado){

        }









     }
