import java.util.Scanner;

public class JuegoPiedraPapelTijera {
    /*
     * Pide al usuario su jugada (“piedra”, “papel”, “tijera” o “salir”) y la
     * devuelve como String en minúsculas. Si no es válida la vuelve a pedir
     * static String leerJugadaUsuario(Scanner sc)
     */

    // Devuelve la jugada del ordenador al azar: “piedra”, “papel” o “tijera”.
    // static String generarJugadaPC()

    // Devuelve el resultado de la ronda: 1 si gana el usuario, 0 si hay empate, -1
    // si gana el ordenador.
    // static int determinarResultado(String usuario, String pc)

    // Muestra la jugada y el resultado (“¡Ganas tú!”, “Gana el ordenador” o
    // “Empate”.
    // static void mostrarResultado(String usuario, String pc, int resultado)

    // Muestra el marcador final con victorias, derrotas y empates.
    // static void mostrarMarcador(int victoriasUsuario, int victoriasPC, int
    // empates)

    // Comprueba si la jugada introducida por el usuario es válida (piedra, papel,
    // tijera o salir).
    // static boolean esValida(String jugada)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int victoriasUsuario = 0, victoriasPC = 0, empates = 0;

        String jugadaUsuario, jugadaPC;

        do {
            jugadaUsuario = leerJugadaUsuario(sc).toLowerCase();
            mostrarJugadaUsuario(jugadaUsuario);


            if (jugadaUsuario.equals("salir"))
                break;

            jugadaPC = generarJugadaPC();
            mostrarJugadaPC(jugadaPC);
            int resultado = determinarResultado(jugadaUsuario, jugadaPC);


            mostrarResultado(resultado);

            if (resultado == 1)
                victoriasUsuario++;
            else if (resultado == -1)
                victoriasPC++;
            else
                empates++;

        } while (!jugadaUsuario.equals("salir"));

        mostrarMarcador(victoriasUsuario, victoriasPC, empates);
        sc.close();

    }

    static String leerJugadaUsuario(Scanner sc) {

        String respuesta;
        do {
            System.out.print("Dime la jugada: ");
            respuesta = sc.next().toLowerCase();
            if (esValida(respuesta)) {
                break;
            } else {
                System.out.println("Tu jugada incorrecta");
            }

        } while (true);
        return respuesta;

    }

    static String generarJugadaPC() {
        int res = 1 + (int) (Math.random() * 3);

        if (res == 1) {
            return "piedra";
        } else if (res == 2) {
            return "papel";
        } else if (res == 3) {
            return "tijera";
        } else
            return "ERROR";
    }

    static void mostrarJugadaUsuario(String jugadaUsuario){
        System.out.println("Jugada del usuario: " +jugadaUsuario);
    }

    static void mostrarJugadaPC(String jugadaPC){
        System.out.println("Jugada del ordenador: " +jugadaPC);
    }

    static int determinarResultado(String jugadaUsuario, String jugadaPC) {
        if ((jugadaUsuario.equals("tijera") && jugadaPC.equals("papel")) ||
                (jugadaUsuario.equals("papel") && jugadaPC.equals("piedra"))
                || (jugadaUsuario.equals("piedra") && jugadaPC.equals("tijera"))) {
            return 1;
        } else if ((jugadaPC.equals("tijera") && jugadaUsuario.equals("papel")) ||
                (jugadaPC.equals("papel") && jugadaUsuario.equals("piedra"))
                || (jugadaPC.equals("piedra") && jugadaUsuario.equals("tijera"))) {
            return -1;
        } else
            return 0;

    }

    static void mostrarResultado(int resultado) {
        if (resultado == 1) {

            System.out.println("Ganas tu!");
        } else if (resultado == -1) {

            System.out.println("Gana el ordenador");
        } else {
            System.out.println("Empate");
        }
    }

    static void mostrarMarcador(int victoriasPC, int victoriasUsuario, int empates) {
        System.out.println("Victorias de usuario: " + victoriasUsuario);
        System.out.println("Victorias de ordenador: " + victoriasPC);
        System.out.println("Empates: " + empates);
    }

    static boolean esValida(String jugada){
        if (jugada.equals("tijera") || jugada.equals("piedra") || jugada.equals("papel") || jugada.equals("salir")){

            return true;
        }else{

            return false;

        }
    }
}