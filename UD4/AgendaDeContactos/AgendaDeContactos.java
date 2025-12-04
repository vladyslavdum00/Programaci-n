package AgendaDeContactos;
import java.util.Arrays;
import java.util.Scanner;

public class AgendaDeContactos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int MAX_SIZE = 100;
        int position = 0;
        int[] telefonos = new int[MAX_SIZE];
        String[] nombres = new String[MAX_SIZE];
        String[] emails = new String[MAX_SIZE];

      do {
          PideYguardaNombre(sc, nombres, position);
          PideYguardaTelefono(sc, telefonos, position);
          PideYguardaEmail(sc, emails, position);

          System.out.println(Arrays.toString(nombres));
          System.out.println(Arrays.toString(telefonos));
          System.out.println(Arrays.toString(emails));
          position++;
      }while(position < MAX_SIZE);



    }


    static String[] PideYguardaNombre(Scanner sc, String[] nombres, int position) {

        System.out.println("Introduce el nombre de la cuenta: ");
        nombres[position] = sc.nextLine();
        return nombres;
    }
    static int[] PideYguardaTelefono(Scanner sc, int[] telefonos, int position) {

        System.out.println("Introduce el telefono del cuenta: ");
        telefonos[position] = Integer.parseInt(sc.nextLine());
        return telefonos;
    }

    static String[] PideYguardaEmail(Scanner sc, String[] emails, int position) {

        System.out.println("Introduce el email de la cuenta: ");
        emails[position] = sc.nextLine();
        return emails;
    }

    static void MuestraMenu(){
        System.out.println("1. Listar contactos");
        System.out.println("2. Buscar por nombre");
        System.out.println("3. Añadir contacto");
        System.out.println("4. Modificar contacto");
        System.out.println("5. Eliminar contacto");
        System.out.println("0. Salir");
    }

    static int EligaOpción(Scanner sc){
        System.out.print("Elige opcion: ");
        int opcion = sc.nextInt();
        return opcion;
    }

}
